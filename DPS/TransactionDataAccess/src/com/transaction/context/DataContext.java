package com.transaction.context;

import javax.xml.bind.JAXBException;

import org.xml.sax.SAXException;

import com.transaction.data.TransactionXML;
import com.transactions.xml.TRANSACTION;

public class DataContext {
	
	static String path =null;
	static TRANSACTION transactionXml = null;
	
	// por XML
    public DataContext(String path) throws JAXBException, SAXException{
		
    	DataContext.path = path;
			
	}
    

	// En una conexión a base de datos
    DataContext(String url,String user,String password){
		
		
	}

    
    public DataSource FillDatasource() throws JAXBException, SAXException {
    	
    	if (!(path == null || path.equals(""))) {
    		
    		DataSource datasource = new DataSource();
    		
    		transactionXml =  TransactionXML.Transaction(path);
    		
    		// Obteniendo DATASOURCES
    		for(TRANSACTION.DATASOURCE ds : transactionXml.getDATASOURCE()) {
    			
    			datasource.list().add(new DataSource(ds.getDATASOURCE(),
    												 ds.getNAME(),
    												 ds.getURL(),
    												 ds.getUSER(),
    												 ds.getPASSWORD(),
    												 ds.getDRIVERCLASSNAME(),
    												 ds.getVALIDATIONQUERY()));		
    		}
    	
    		return datasource;
    	}
    	
    	return null;
    }
    
 public Property FillProperties() throws JAXBException, SAXException {
    	
    	if (!(path == null || path.equals(""))) {
    		
    		Property property = new Property();
    		
    		transactionXml =  TransactionXML.Transaction(path);
    		
    		// Obteniendo DATASOURCES
    		for(TRANSACTION.PROPERTY prop : transactionXml.getPROPERTY()) {
    			
    			property.List().add(new Property(prop.getPROPERTY(),
    											 prop.getPROPERTYPARENT(),
    											 prop.getCATEGORY(),
    											 prop.getTYPE(),
    											 prop.getTYPE(),
    											 prop.getDATASOURCE(),
    											 prop.getISMULTIVALUE(),
    											 prop.getVALUE()));		
    		}
    	
    		return property;
    	}
    	
    	return null;
    }
	
}
