/***********************************************************************
 * Module:  Property.java
 * Author:  saul.duenas
 * Purpose: Defines the Class Property
 ***********************************************************************/

package com.transaction.context;


import java.util.*;

/** @pdOid 021e0827-a91e-416c-a7d9-943efb14432b */
public class Property {
   
	public Property() {
		
	}
	
	public Property(String property,String propertyParent,String category,String sqltype,String type,String datasource,String isMultivalue,String value) {
		this.property = property;
		this.propertyParent = propertyParent;
		this.category = category;
		this.sqltype = sqltype;
		this.type = type;
		this.datasource = datasource;
		this.isMultivalue = isMultivalue;
		this.value = value;
	}
	
	/** PK - Nombre del parametro
    * 
    * @pdOid bcf582db-5cf0-49ff-aac6-7908dc83802d */
   private String property;
   /** Parametro Padre
    * 
    * @pdOid ce583f0b-6c54-4b9a-bb87-f043f80111cb */
   private String propertyParent;
   /** Campo utilizado para catalogar las propiedades
    * 
    * @pdOid c4b1038a-3718-4757-81b7-1c050fedea40 */
   private String category;
   /** Tipo de Dato ANSI SQL (VARCHAR,INTEGER, etc) 
    * 
    * @pdOid 1709aef5-2d81-4037-8149-2b7fb2a6bbd9 */
   private String sqltype;
   /** DIRECT, SQLVALUE   see notes
    * 
    * @pdOid ec651477-c417-4b3e-8201-8c40ca32e52e */
   private String type;
   /** Origen de datos, solo cuando el TYPE es "SQLVALUE"
    * 
    * @pdOid 05c8b045-1823-460b-ae38-ed321bb5b1b2 */
   private String datasource=null;
   /** Indicador de un parametro de multiples valores
    * 
    * @pdOid 06994b85-4f48-4182-849e-aa2b36d202e0 */
   private String isMultivalue;
   /** El valor o dato asociado al parametro
    * 
    * @pdOid 6aa57fed-e49b-4c0c-905c-e7e16aa637a3 */
   private String value;
   
   /** @pdOid 59332193-75f6-42bb-9d5c-f35c70b33d14 */
   public String getPropertyName() {
      return property;
   }
   
   /** @param newProperty
    * @pdOid 4beac739-0c82-43a2-928c-0cd2c936e92b */
   public void setPropertyName(String newProperty) {
      property = newProperty;
   }
   
   /** @pdOid cf6fbe4e-eca5-487b-8613-cb6bfb6e1f54 */
   public String getPropertyParent() {
      return propertyParent;
   }
   
   /** @param newPropertyParent
    * @pdOid 1206b4cb-b1b4-49f8-9f5e-c360da5273b3 */
   public void setPropertyParent(String newPropertyParent) {
      propertyParent = newPropertyParent;
   }
   
   /** @pdOid 52ca6dd7-0716-4e08-8e2a-3acf9ae7e797 */
   public String getCategory() {
      return category;
   }
   
   /** @param newCategory
    * @pdOid d72fa7c0-c34f-4498-9154-d867af784552 */
   public void setCategory(String newCategory) {
      category = newCategory;
   }
   
   /** @pdOid 02091c78-be37-449f-bebf-70645935a9cb */
   public String getSqltype() {
      return sqltype;
   }
   
   /** @param newSqltype
    * @pdOid 185c869b-cc83-45d3-aaac-72c54c430460 */
   public void setSqltype(String newSqltype) {
      sqltype = newSqltype;
   }
   
   /** @pdOid 544e5ca2-94ec-4ce6-8179-53970ff29e0a */
   public String getType() {
      return type;
   }
   
   /** @param newType
    * @pdOid b1dc4988-48ea-4cdd-9ce3-cdfd6a4aa76a */
   public void setType(String newType) {
      type = newType;
   }
   
   /** @pdOid 4f195afd-3d4b-40db-b948-828b051bd204 */
   public String getDatasource() {
      return datasource;
   }
   
   /** @param newDatasource
    * @pdOid 888682d3-8b19-4da3-907a-fe3466d157f0 */
   public void setDatasource(String newDatasource) {
      datasource = newDatasource;
   }
   
   /** @pdOid fa443227-32c7-483e-8695-03273263632f */
   public String getIsMultivalue() {
      return isMultivalue;
   }
   
   /** @param newIsMultivalue
    * @pdOid dba0e51e-3b16-4b3f-9469-56c5425114bb */
   public void setIsMultivalue(String newIsMultivalue) {
      isMultivalue = newIsMultivalue;
   }
   
   /** @pdOid 64daa639-5b7b-4e64-92f0-72471a57cdd2 */
   public String getValue() {
      return value;
   }
   
   /** @param newValue
    * @pdOid 95e1f0e7-0dcb-42ac-82aa-dffe2e106179 */
   public void setValue(String newValue) {
      value = newValue;
   }

   private ArrayList<Property> list = new ArrayList<Property>();

   public ArrayList<Property> List() {
       
	   if (list != null) {
		   return list;
	   }
	   return null;
   }
   
   public Property getProperty(String propertyName) {
      if (list == null) {
        	for(Property prop:list) {
    	  		if (prop.getPropertyName().equals(propertyName)) {
    	  			return prop;
    	  		}
    	  	}
      }
	  return null;
   }
   
}
