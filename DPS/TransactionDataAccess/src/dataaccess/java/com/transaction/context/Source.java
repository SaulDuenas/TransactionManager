/***********************************************************************
 * Module:  Source.java
 * Author:  saul.duenas
 * Purpose: Defines the Class Source
 ***********************************************************************/

package com.transaction.context;

import java.util.ArrayList;


public class Source {
	
	   private String group;
	   
	   private String name;
	   
	   private String typesource;
	
	   private String filename;
	
	   private String path;
	   
	   private String codingFormat;
	
	   private String header;
	
	   private String format;
	
	   private String delimiter;
	
	   private String leftEnclosure;
	
	   private String rightEnclousure;
	
	   private String sheetName;
	
	   private String jrxmlPath;
	   
	   private String datasource;
	
	   private String sqlsource;
	
	   private String dataload;
		
	   private String sqlload;
	   
	   private MetaData metadata = null;
	
	   private Parameter parameter = null;
	   
	   
	   public Source(String group,String name,String typesource,
			   		 String filename,String path,String codingFormat,String header,String delimiter,
			   		 String leftEnclosure,String rightEnclousure,String sheetName,String datasource,
			   		 String jrxmlPath,String sqlsource,String dataload,String sqlload) {
		    
		  this.group = group;
		  this.name = name;
		  this.typesource = typesource;
		  this.filename = filename;
		  this.path = path;
		  this.codingFormat = codingFormat;
		  this.header = header;
		  this.delimiter = delimiter;
		  this.leftEnclosure = leftEnclosure;
		  this.rightEnclousure = rightEnclousure;
		  this.sheetName = sheetName;
		  this.jrxmlPath=jrxmlPath;
		  this.datasource = datasource;
		  this.sqlsource = sqlsource;
		  this.dataload = dataload;
		  this.sqlload = sqlload;
 	   }

	   

	   public Source() {
		   
	   }
	   
	   
	   private ArrayList<Source> list = new ArrayList<Source>();

		  public ArrayList<Source> list() {
		       if (list != null) {
		    	   return list;
		       }
		       
		       return null;
		   }
		   
	  public Source getProcess(String name) {
	      if (list != null) {
	        	for(Source source:list) {
	    	  		if (source.getName().equals(name)) {
	    	  			return source;
	    	  		}
	    	  	}
	      }
		  return null;
	  } 
	  
	  
	   /** @pdOid bc56afb8-1799-43f8-ab89-b248ce78b769 */
	   public String getName() {
	      return name;
	   }
	   
	   /** @param newName
	* @pdOid bd030dd0-64d8-41ef-862a-9cbc5d978de1 */
	   public void setName(String newName) {
	      name = newName;
	   }
	   
	   /** @pdOid 2e93c262-9255-402e-8410-7a57d3ec82a2 */
	   public String getTypesource() {
	      return typesource;
	   }
	   
	   /** @param newTypesource
	* @pdOid 975aee33-fd49-4e7c-8917-830b0ba07def */
	   public void setTypesource(String newTypesource) {
	      typesource = newTypesource;
	   }
	   
	   /** @pdOid 5515427e-91e6-4cf3-8e18-b053544dd381 */
	   public String getFilename() {
	      return filename;
	   }
	   
	   /** @param newFilename
	* @pdOid 44d191f9-71cc-4e4f-84e7-a9543ae79000 */
	   public void setFilename(String newFilename) {
	      filename = newFilename;
	   }
	   
	   /** @pdOid 96d0660b-ec41-4629-9406-1aaa7d9808f7 */
	   public String getPath() {
	      return path;
	   }
	   
	   /** @param newPath
	* @pdOid e351e27e-87b8-4326-aef2-b25904af5978 */
	   public void setPath(String newPath) {
	      path = newPath;
	   }
	   
	   /** @pdOid b22489c5-c1ea-4aff-a763-a88104321051 */
	   public String getHeader() {
	      return header;
	   }
	   
	   /** @param newHeader
	* @pdOid 1cd59107-62c4-4b9d-9296-536e8e889893 */
	   public void setHeader(String newHeader) {
	      header = newHeader;
	   }
	   
	   /** @pdOid 2fc06741-faef-4d19-8a4e-6c45a5f6db25 */
	   public String getFormat() {
	      return format;
	   }
	   
	   /** @param newFormat
	* @pdOid 7b9e21a5-d727-4b21-803b-c7f57316005c */
	   public void setFormat(String newFormat) {
	      format = newFormat;
	   }
	   
	   /** @pdOid 98af0cf0-a667-4764-9a2a-e91b4550fc05 */
	   public String getDelimiter() {
	      return delimiter;
	   }
	   
	   /** @param newDelimiter
	* @pdOid 8c7cfb00-2f6e-49b8-9a86-ecc3c66134eb */
	   public void setDelimiter(String newDelimiter) {
	      delimiter = newDelimiter;
	   }
	   
	   /** @pdOid fa0189b9-0b15-41b9-8570-219c918ef9da */
	   public String getLeftEnclosure() {
	      return leftEnclosure;
	   }
	   
	   /** @param newLeftEnclosure
	* @pdOid 67012805-6f85-404e-ba84-f9dcb7bb873b */
	   public void setLeftEnclosure(String newLeftEnclosure) {
	      leftEnclosure = newLeftEnclosure;
	   }
	   
	   /** @pdOid e7dc4f90-c1d7-4bb3-a6b4-f2ced1efc93a */
	   public String getRightEnclousure() {
	      return rightEnclousure;
	   }
	   
	   /** @param newRightEnclousure
	* @pdOid 72b41af5-b7b0-47dc-9a2f-62f39fb2ab79 */
	   public void setRightEnclousure(String newRightEnclousure) {
	      rightEnclousure = newRightEnclousure;
	   }
	   
	   /** @pdOid 5ca65aff-efc1-4358-8e75-66d7067c38a8 */
	   public String getSheetName() {
	      return sheetName;
	   }
	   
	   /** @param newSheetName
	* @pdOid dc9b1e5e-042d-47c6-ab7e-f25c7e71f830 */
	   public void setSheetName(String newSheetName) {
	      sheetName = newSheetName;
	   }
	   
	   /** @pdOid caabdccd-2bfc-45f2-b89b-90cb20a72179 */
	   public String getDatasource() {
	      return datasource;
	   }
	   
	   /** @param newDatasource
	* @pdOid fe17afa1-4e9d-473a-88e0-c0f5364e65ac */
	   public void setDatasource(String newDatasource) {
	      datasource = newDatasource;
	   }
	   
	   /** @pdOid 5184bd09-6205-459b-bbd2-35658c2a8692 */
	   public String getsqlsource() {
	      return sqlsource;
	   }
	   
	   /** @param newScriptsqlsource
	* @pdOid e8a1811a-ec79-4a0f-81b4-75720ff0bee6 */
	   public void setsqlsource(String newScriptsqlsource) {
	      sqlsource = newScriptsqlsource;
	   }
	   
	   public ArrayList<MetaData> MetaData() {
		   if (metadata == null) {
			   metadata = new MetaData(); 
			   
		   }
		   
		   return metadata.List();
	   }
	
	
	   public ArrayList<Parameter> Parameters() {
		   if (parameter == null) {
			   parameter = new Parameter(); 
		   }
		   return parameter.List();
	   }

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	
	public String getCodingFormat() {
		return codingFormat;
	}

	public void setCodingFormat(String codingFormat) {
		this.codingFormat = codingFormat;
	}
	

	   public String getdataload() {
		return dataload;
	}



	public void setdataload(String dataload) {
		this.dataload = dataload;
	}



	public String getsqlload() {
		return sqlload;
	}



	public void setsqlload(String sqlload) {
		this.sqlload = sqlload;
	}
	
	 public String getjrXmlPath() {
		return jrxmlPath;
	}
	
	public void setjrXmlPath(String jrxmlPath) {
		this.jrxmlPath = jrxmlPath;
	}
	 
}
