/***********************************************************************
 * Module:  Parameter.java
 * Author:  saul.duenas
 * Purpose: Defines the Class Parameter
 ***********************************************************************/

package com.transaction.context;

import java.util.ArrayList;

public class Parameter {
	
	    /** PK - Nombre del parametro
	    * 
	    * @pdOid ecf3363c-6b59-4eb0-8cd9-665951ddc644 */
	   private String parameter;
	   /** Posición del parametro
	    * 
	    * @pdOid 508554b8-538a-4a9b-841b-fe68d6cca677 */
	   private int idOrder;
	   /** DIRECT, PROPERTIE   see notes
	    * 
	    * @pdOid c3e11d96-592f-4980-81df-b9fa15d0d386 */
	   private String type;
	   /** Tipo de Dato ANSI SQL (VARCHAR,INTEGER, etc) 
	    * 
	    * @pdOid f9e6c9c2-4425-45ff-bfa9-75a6d2cfd03e */
	   private String sqltype;
	   /** Indicador de un parametro de multiples valores
	    * 
	    * @pdOid 429a9d16-8d65-403e-b10a-45ec60e3872b */
	   private String isMultivalue;
	   /** El dato o valor asociado al parametro SQL
	    * 
	    * @pdOid 3064cc28-5c6d-4da6-b525-46c6c7e1aebc */
	   private String value;
	   
	   public Parameter() {
		   
	   }
	   
	   public Parameter(String parameter,int idOrder,String type,String sqltype,String isMultivalue,String value) {
		   
		   this.parameter = parameter;
		   this.idOrder = idOrder;
		   this.type = type;
		   this.sqltype = sqltype;
		   this.isMultivalue = isMultivalue;
		   this.value = value;
	   
	   }
	   
	   /** @pdOid 08490559-17ef-4b06-9226-da25353464e3 */
	   public String getParameter() {
	      return parameter;
	   }
	   
	   /** @param newParameter
	    * @pdOid acf41225-539a-4abd-b661-71bb9ad2fa7d */
	   public void setParameter(String newParameter) {
	      parameter = newParameter;
	   }
	   
	   /** @pdOid b9d325ea-faf2-4052-adc2-7bd0e579c8df */
	   public int getIdOrder() {
	      return idOrder;
	   }
	   
	   /** @param newIdOrder
	    * @pdOid 9978d821-61cd-43ae-94ca-1586278c99da */
	   public void setIdOrder(int newIdOrder) {
	      idOrder = newIdOrder;
	   }
	   
	   /** @pdOid 7362317b-a04d-424d-9ddf-1760614b810d */
	   public String getType() {
	      return type;
	   }
	   
	   /** @param newType
	    * @pdOid b78c998b-8044-4cee-8770-7e781f3b4780 */
	   public void setType(String newType) {
	      type = newType;
	   }
	   
	   /** @pdOid 5e318b80-beec-4989-94d9-72c4e8bc5e54 */
	   public String getSqltype() {
	      return sqltype;
	   }
	   
	   /** @param newSqltype
	    * @pdOid 32ef8017-42f2-4b42-8fae-22cb1ab95326 */
	   public void setSqltype(String newSqltype) {
	      sqltype = newSqltype;
	   }
	   
	   /** @pdOid d67fe174-2224-4c88-9311-237bf154ec9c */
	   public String getIsMultivalue() {
	      return isMultivalue;
	   }
	   
	   /** @param newIsMultivalue
	    * @pdOid e37eb27b-be85-469f-8ebe-0d3f76b3d858 */
	   public void setIsMultivalue(String newIsMultivalue) {
	      isMultivalue = newIsMultivalue;
	   }
	   
	   /** @pdOid b1c70bb6-d09c-40ea-bd08-8a35f8d94589 */
	   public String getValue() {
	      return value;
	   }
	   
	   /** @param newValue
	    * @pdOid 1cd9a609-4f8f-4e81-bb44-04f8c1a90bde */
	   public void setValue(String newValue) {
	      value = newValue;
	   }
	   
	   private ArrayList<Parameter> list = new ArrayList<Parameter>();

	   public ArrayList<Parameter> List() {
	       if (list != null) {
	    	   return list;   
	       }
	       
		   return null;
	   }
	   
	   public Parameter getParameter(String parameterName) {
	      if (list != null) {
	        	for(Parameter param:list) {
	    	  		if (param.getParameter().equals(parameterName)) {
	    	  			return param;
	    	  		}
	    	  	}
	      }
		  return null;
	   }
	   
}
