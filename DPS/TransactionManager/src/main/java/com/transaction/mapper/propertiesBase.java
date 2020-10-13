package com.transaction.mapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.io.FilenameUtils;

public class propertiesBase {
	
	private Properties _conf = new Properties();
	private InputStream _inputStream;
	static String GLOBAL_PROPERTIES = "config.properties";
	private String _path_File;
	
	// Construtor
	public propertiesBase(String pathFile) throws IOException {
		this._conf = new Properties();
		this._path_File = pathFile;
		if (new File(pathFile).exists()) {
			this._inputStream =new FileInputStream (new File(this._path_File));
			this._conf.load(_inputStream); 
		
		}
	}
	
	// Construtor
	public propertiesBase() throws IOException {
		this._conf = new Properties();
		this._path_File = this.Path_Properties();
		if (new File(this._path_File).exists()) {
			this._inputStream =new FileInputStream (new File(this._path_File));
			this._conf.load(_inputStream); 
		}
		
	}
	
	
	private String app_path() throws IOException  {
		
		String path="";
		
		path = new java.io.File(".").getCanonicalPath();
		path = FilenameUtils.separatorsToSystem(path);
		path = FilenameUtils.normalize(path);
				
		return path;
	}
	
	public String Path_Properties() throws IOException {
		
		String lRetVal;  

		lRetVal = FilenameUtils.concat(this.app_path(),propertiesBase.GLOBAL_PROPERTIES);
		lRetVal = FilenameUtils.normalize(lRetVal);
		
		return lRetVal;
		
	}
	
	
	protected String get_property(String property) throws Exception {
		String retVal="";
		
		if (this._conf != null) {
			retVal = this._conf.getProperty(property);
		
		}
		else {
			 throw new Exception("ERR: Properties class NULL");
		}
		return retVal; 
	
	}
	
	
	public boolean set_property(String pProperty,String pValue) throws Exception{
		
		boolean lRetVal;
		
		if (this._conf != null) {
		     // guardamos propiedades
				   this._conf.setProperty(pProperty,pValue);
				   //this._conf.store(out, comments);
				   lRetVal = true;
			   
		} else {
			lRetVal = false;
			throw new Exception("set_property: error al encontrar la propiedad [" + pProperty + "]");
			
		}
		
		return lRetVal;
	
	}
	
}
