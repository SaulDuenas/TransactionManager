package com.configuration.dao;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.apache.commons.io.FilenameUtils;
import org.xml.sax.SAXException;

import com.configuration.xml.CONFIGURATION;
import com.configuration.xml.ObjectFactory;


public abstract class ConfigurationData {
	
	protected static String path_file= new String();
	static String configuration_file = "configuration.xml";
	static String schema_path_file = "config/configuration.xsd";
	
	
	private String app_path() throws IOException  {
		
		String path="";
		
		path = new java.io.File(".").getCanonicalPath();
		path = FilenameUtils.separatorsToSystem(path);
		path = FilenameUtils.normalize(path);
				
		return path;
	}
	
	
	public String Config_Path() throws IOException {
		
		String lRetVal;  

		lRetVal = FilenameUtils.concat(this.app_path(),ConfigurationData.configuration_file);
		lRetVal = FilenameUtils.normalize(lRetVal);
		
		return lRetVal;
		
	}
	
	
	// to default configuration file
	public ConfigurationData() throws IOException  {
		ConfigurationData.path_file = Config_Path();
	}
	
	// to specific configuration file
	public ConfigurationData(String path_file) throws JAXBException, SAXException {
	
		ConfigurationData.path_file =path_file;
		
	}
	
	
	@SuppressWarnings("unused")
	public CONFIGURATION serializeConfig()throws JAXBException, SAXException, IOException{
		
		JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
		SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI); 
		
		// ***********************************************************************************************************************
		URL url = ClassLoader.getSystemResource(schema_path_file); // acceder a archivos dentro de un jar
		//File file = new File(getClass().getResource(schema_path_file).getFile()); // acceder a archivos en el classpath_file
		// ***********************************************************************************************************************
		
		Schema schema = sf.newSchema(url);
		
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		unmarshaller.setSchema(schema);
		
		return (CONFIGURATION) unmarshaller.unmarshal(new File(ConfigurationData.path_file));
		
	}
	
}
