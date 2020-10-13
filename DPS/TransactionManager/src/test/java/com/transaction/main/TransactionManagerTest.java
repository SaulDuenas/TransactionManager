package com.transaction.main;


import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.Properties;

import javax.xml.bind.JAXBException;
import org.xml.sax.SAXException;

import com.gatetech.database.DataConnection;
import com.transaction.context.Property;
import com.transaction.context.TransactionDataContext;
import com.transaction.mapper.utils;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class TransactionManagerTest {

	final static Logger log = Logger.getLogger(TransactionManagerTest.class);
	
	public static void main(String[] args) {
	
		int result = 0;
		boolean flag_log = false;
	
	//	if (ClassLoader.getSystemResourceAsStream("config/log4j.xml") == null) {
	//		System.out.println("No existe");
	//	}
	//	else {
	//		System.out.println("Existe");
	//	}
	// ClassLoader.getSystemResources("config/log4j.xml")
	
					
		TransactionDataContext datacontext;
		try {
			
			
			datacontext = new TransactionDataContext("C:\\gatetch\\internos\\TransactionManager\\DPS\\XML\\configuration_.xml");
			//datacontext = new TransactionDataContext();
			
			Properties PropertiesLog = new  Properties();
			InputStream inputlog = ClassLoader.getSystemResourceAsStream("config/log4j.properties");
			PropertiesLog.load(inputlog);
			PropertyConfigurator.configure(PropertiesLog);
			
			log.info("Prueba de lectura de Archivo de configuración XML (Sección CONNECTION) - " + new Date());	
			flag_log = true;
			
			DataConnection conn;
			conn = utils.FillDataAcces(datacontext);

			// Recorremos el listado 
			for (DataConnection elemConn :conn.List()) {
				log.info(elemConn.get_name());
			}
			
			log.info("Prueba de lectura de Archivo de configuración XML (Sección PROPERTIES) - " + new Date());	
			
			//Property Properties = datacontext.FillProperties();
						
			for (Property property :datacontext.FillProperties().List()) {
				log.info(property.getPropertyName());
			}
			
			result = 0;
			log.info("Fin de prueba - " + new Date());
		
		} catch (JAXBException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw)); 
			
			if (flag_log != false) { 
			
				log.error(sw);
			}
			else { 
				e.printStackTrace(); 
			}
			result = 5;
		}
		finally {
			System.exit(result);
		}
		

	}


	

}
