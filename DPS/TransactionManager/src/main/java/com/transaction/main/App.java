package com.transaction.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.SQLException;
import java.util.Properties;
import javax.xml.bind.JAXBException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.xml.sax.SAXException;

import com.transaction.context.Property;
import com.transaction.context.TransactionDataContext;
import com.transaction.mapper.process;
import com.transaction.mapper.utils;
import com.transaction.process.ProcessMaker;

public class App {

	static public Logger log = Logger.getLogger(App.class);
	static boolean flag_log = false;
	static Object log_file = "";
	static Object resutlOK = 0;
	static Object resutlFail = 0;
	static int result = 2;
	static process Allprocess = new process();
	
	static TransactionDataContext datacontext=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
				load_configuration();
			
				inizialize();
				
				log.info(utils.messageLog("TransactionManager - Carga de Configuración completa Status: (OK)"));	
				
				// Rescatamos los parametros externos
				// Trama la cadena:   nombreProceso,var01:value01,var02:value02, ....., varN:valueN
				// NOTA: Si viene vacio: se ejecutaran todos los procesos que se encuentren en el archivo de configuración 
				//                       con los valores por default
				
				for (String arg:args) {
					Allprocess.list().add(new process(arg));
				}
				
				ProcessMaker process = new ProcessMaker();
				
				//process.addProcessMakerEventListener(this);
				process.run(App.datacontext);
				
				result = Integer.parseInt(resutlOK.toString()); 
				
				log.info(utils.messageLog("TransactionManager - Fin de Ejecución"));	
				
				
		} catch (IOException | JAXBException | SAXException | SQLException e) {
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw)); 
			
			if (flag_log != false) { 
			
				log.error(utils.messageLog(sw.toString()));
			}
			else {
				result = Integer.parseInt(resutlFail.toString()); // El proceso no arranco 
				// no se logro cargar el log - se envia el error general en archivo de 
				e.printStackTrace();
			}
		
		}
		finally {
			System.exit(result);
		}
	}
	
	
	public static void inizialize() throws IOException, JAXBException, SAXException {
		
		App.datacontext = new TransactionDataContext();
		
		Properties PropertiesLog = new Properties();
		InputStream inputlog = ClassLoader.getSystemResourceAsStream("config/log4j.properties");
		PropertiesLog.load(inputlog);
		PropertiesLog.setProperty("log4j.appender.htmlfile.File",log_file.toString());
		PropertyConfigurator.configure(PropertiesLog);
		
		log.info(utils.messageLog("TransactionManager - Inizialización completa - Status(OK)"));	
		
		for (Property property :datacontext.FillProperties().List()) {
			log.info(utils.messageLog(property.getPropertyName() + " value: " + property.getValue()));
		}
		
		flag_log = true;
		
	}
	
	public static void load_configuration() throws IOException, JAXBException, SAXException {
	
		// cargamos las propiedades y/o parametros default del proceso
		App.datacontext = new TransactionDataContext();  
		
		Property Allproperties = datacontext.FillProperties();
		Property Logprop = Allproperties.getProperty("@logger");
		Property ResultOK = Allproperties.getProperty("@ResultOK");
		Property ResultFailed = Allproperties.getProperty("@ResultFailed");
		
		log_file = utils.SqlTypetoData(Logprop.getSqltype(),Logprop.getValue(),false);
		resutlOK = utils.SqlTypetoData(ResultOK.getSqltype(),ResultOK.getValue(),false);
		resutlFail = utils.SqlTypetoData(ResultFailed.getSqltype(),ResultFailed.getValue(),false);
		
	}


}


