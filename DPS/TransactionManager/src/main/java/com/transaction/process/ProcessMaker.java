package com.transaction.process;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ListIterator;

import javax.xml.bind.JAXBException;

import org.apache.log4j.Logger;
import org.xml.sax.SAXException;

import com.gatetech.database.DataConnection;
import com.gatetech.database.SqlHelper;
import com.gatetech.datasource.DataRow;
import com.gatetech.datasource.DataTable;
import com.transaction.context.Source;
import com.transaction.context.TransactionDataContext;
import com.transaction.mapper.process;
import com.transaction.mapper.utils;

public class ProcessMaker implements ProcessMakerEventListener {
	
	public Logger log = Logger.getLogger(ProcessMaker.class);
	
    // Aqui se almacenaran todos los manejadores (delegados) de evento
   
	private ArrayList<ProcessMakerEventListener> listeners = new ArrayList<ProcessMakerEventListener>();
	
	DataConnection AllConnection=null;
	
	public ProcessMaker() {
		
		// Creamos el almacen de los listeners. ArrayList almacena objetos, por tanto para recuperarlos tendremos que hacer CASTINGS
		
		// La clase ProcessMaker tambien es un ProcessMakerEventListener, entonces lo agregamos
        // para crear los eventos predeterminados (mas abajo codificados)
    	//listeners.add(this);
	}
	
	
	public void addProcessMakerEventListener (ProcessMakerEventListener listener){
	    // agregamos el manejador a nuestra lista
	    listeners.add(listener);
	}
	
	
	static public void run(process list,TransactionDataContext dataContext) {
		
		
		
	}
	
	
	public void run(TransactionDataContext dataContext) throws JAXBException, SAXException, IOException, SQLException {
		
		this.AllConnection = utils.FillDataAcces(dataContext);
		
		for (Source source :dataContext.FillSource().list()) {
			
			log.info(utils.messageLog("Proccesing Source: " + source.getName()));
			
			 ListIterator<ProcessMakerEventListener> li = listeners.listIterator();
		     while (li.hasNext()) {
		       ((ProcessMakerEventListener)li.next()).readSource(new SourceEventObject(this,source),"");
		     }
			 
		     try {
			     // Type of Transaction 
			    
			     switch (source.getTypesource().toUpperCase()) {
			     
				     case "SQLTOTEXTFILE":	SqlToTextFile(source);
				    	 					break;
				    	 					
				     case "SQLTOJRXML":
				    	 
		 									break;
				    	 
				     case "TEXTFILETOSQL":
				    	 
				    	 					break;
				    
				     case "SQLTOSQL":
				    	 
				    	 					break;
			    	 
			     }
		     } catch (Exception e) {
				StringWriter sw = new StringWriter();
				e.printStackTrace(new PrintWriter(sw)); 
	
				log.error(utils.messageLog(sw.toString()));
		     }
		     
		}
		
	}

	
	public void SqlToTextFile(Source source) throws Exception {
		// 0. Obtengo conección
		 
		if (!source.getDatasource().equals(""))
		{
			DataConnection datasource = this.AllConnection.getDataAccess(source.getDatasource());
		
			 if (datasource != null) {
				 
				 Object[] parameters =null;
				 
				 DataTable datatable = SqlHelper.FillDataTable(datasource,source.getsqlsource(),parameters);
				 
				 for(int i=0;i<=datatable.DataColumList().size()-1;i++) {
						System.out.println("Name: " + datatable.DataColumList().get(i).get_Name() + " - Type: " + datatable.DataColumList().get(i).DataType() + " - SQLType: " + datatable.DataColumList().get(i).SQLType());
					}
							    
				 for(DataRow rw:datatable.DataRowList()) {
					
					System.out.println(rw.toString("|", "\"", "\""));
				 }
				 
			 }
			 else {
				 throw new SQLException("An error occurred Data Source not found - DataSourceName: " + source.getDatasource());
			 }
		
		}
		else {
			throw new Exception("DataSource not especified" + source.getDatasource());
		}
			 
		// 1. Obtengo Resultado consulta SQL
		
		// 2. Se genera la copia como se especifico en layout
		
		// 3. Se genera el archivo 
		
	} 
	
	
	
	@Override
	public void readSource(SourceEventObject args,String message) {
		
		//log.info(utils.messageLog("Source: " + args.getSource().getName() + " DataSource:" + args.getSource().getDatasource() ));
	}
	
	
}
