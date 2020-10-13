package com.transaction.data;

import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import com.transaction.xml.ObjectFactory;
import com.transaction.xml.TRANSACTIONMANAGER;

public class TransactionXML {
	
	static String path= new String();
	
	TransactionXML(String path) throws JAXBException, SAXException {
	
		TransactionXML.path =path;
		
	}
	
	
	static public TRANSACTIONMANAGER Transaction(String path)throws JAXBException, SAXException{
		try {
			if (TransactionXML.path ==null || TransactionXML.path.equals("")) {TransactionXML.path =path;}
			
			JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
			SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI); 
			Schema schema = sf.newSchema(new File("schema\\TransactionManager.xsd")); 
			
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			unmarshaller.setSchema(schema);
			
			return (TRANSACTIONMANAGER) unmarshaller.unmarshal(new File(TransactionXML.path));
		
		} catch (JAXBException e) {
			
			throw new JAXBException("An error occurred while performing the requested operation." + 
									"\r Message: " + e.getLinkedException().toString()); 
		
		} catch (SAXException e) {
		
			throw new SAXException("An error occurred while performing the requested operation." + 
									"\r Message: " + e.getMessage()); 
	
		}
	}
	
}
