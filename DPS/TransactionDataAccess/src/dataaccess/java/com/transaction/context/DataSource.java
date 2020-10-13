/***********************************************************************
 * Module:  Datasource.java
 * Author:  saul.duenas
 * Purpose: Defines the Class DataSource
 ***********************************************************************/

package com.transaction.context;

import java.util.*;

/** Registro de Conexiones a base de datos
 * 
 * @pdOid 393a0339-090a-4ae5-aeb6-0a638e23a30a */
public class DataSource  {
   
	
	public DataSource(){
		
	}
	
	DataSource(String name,String url,String user,String password,String driverclassname,String validationQuery){
		
		this.name=name;
		this.url=url;
		this.user=user;
		this.password=password;
		this.driverclassname=driverclassname;
		this.validationQuery=validationQuery;
	}
   
	
	  private ArrayList<DataSource> list = new ArrayList<DataSource>();

	  public ArrayList<DataSource> list() {
	       if (list != null) {
	    	   return list;
	       }
	       
	       return null;
	   }
	   
	  public DataSource GetDataSource(String Name) {
	      if (list != null) {
	        	for(DataSource ds:list) {
	    	  		if (ds.getName().equals(Name)) {
	    	  			return ds;
	    	  		}
	    	  	}
	      }
		  return null;
	   }
	
	
   /** Nombre descriptivo para identificar la conexión
    * 
    * @pdOid 2f2292e8-20f0-413d-81c5-12d47dc19273 */
   private String name;
   /** Cadena de Conexión a la Base de Datos
    * 
    * @pdOid fbcd3e2d-9ee4-4f9b-85d3-aca5b1213f48 */
   private String url;
   /** Nombre de Usuario
    * 
    * @pdOid 483abe37-eb89-408b-83f5-26a508c92126 */
   private String user;
   /** Contraseña de Conexión
    * 
    * @pdOid f9f69431-78e6-4b17-9205-13fefd8f5755 */
   private String password;
   /** Driver de conexión
    * 
    * @pdOid 425b1283-4477-43a6-8ca9-0d398f01e77b */
   private String driverclassname;
   /** @pdOid 29719cef-7b11-4374-a613-1df07f4a3e90 */
   private String validationQuery;
   
   
   /** @pdOid d7203af2-4c67-4feb-bebc-08b319eb4bfd */
   public String getName() {
      return name;
   }
   
   /** @param newName
    * @pdOid b34bd381-7bc5-43b0-9587-bb1e5059fd71 */
   public void setName(String newName) {
      name = newName;
   }
   
   /** @pdOid c2b231c6-eb15-4df7-ac84-44ae3b886586 */
   public String getUrl() {
      return url;
   }
   
   /** @param newUrl
    * @pdOid 8196deef-4817-4cff-9309-baf5168ee90a */
   public void setUrl(String newUrl) {
      url = newUrl;
   }
   
   /** @pdOid 8b3e4e13-fe92-4419-b5fc-e6fad5b1d455 */
   public String getUser() {
      return user;
   }
   
   /** @param newUser
    * @pdOid bff676fc-a93a-4d4d-a949-a0c7c9bc8348 */
   public void setUser(String newUser) {
      user = newUser;
   }
   
   /** @pdOid bac5fd35-709e-4f3c-9f3a-54f0b6f2e134 */
   public String getPassword() {
      return password;
   }
   
   /** @param newPassword
    * @pdOid 4c18c13c-ad74-424e-915a-9a75f8de1e95 */
   public void setPassword(String newPassword) {
      password = newPassword;
   }
   
   /** @pdOid 3a31cb46-7dfc-4e93-a4cf-e1a6c509207a */
   public String getDriverclassname() {
      return driverclassname;
   }
   
   /** @param newDriverclassname
    * @pdOid eb1ce52a-0424-41ad-b022-419855c367ac */
   public void setDriverclassname(String newDriverclassname) {
      driverclassname = newDriverclassname;
   }
   
   /** @pdOid c1767d18-3489-4ee4-bd34-af0115aaf6a6 */
   public String getValidationQuery() {
      return validationQuery;
   }
   
   /** @param newValidationQuery
    * @pdOid 0e8e0c67-90ff-4777-972b-98d029555786 */
   public void setValidationQuery(String newValidationQuery) {
      validationQuery = newValidationQuery;
   }

  
}


