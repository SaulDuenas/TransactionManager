/***********************************************************************
 * Module:  Metadata.java
 * Author:  saul.duenas
 * Purpose: Defines the Class Metadata
 ***********************************************************************/

package com.transaction.context;

import java.util.*;

/** Registro de metadatos de las fuentes de datos,
 * @pdOid 7945f9ba-f6f0-424e-88a0-e72ba01c155e */
public class MetaData {
   /** @pdOid c6eaf659-6b43-416c-93e3-d091eaf20212 */
   private String colname;
   /** @pdOid edfc24bf-ce3a-4d4b-b5ad-ff2df8cfb627 */
   private int orderId;
   /** @pdOid 2050353d-89bc-40bd-8aa7-05aebac7fdad */
   private String sqltype;
   
   
   /** @pdOid b726932b-49db-46fa-9e20-2666aa1b8765 */
   public String getColname() {
      return colname;
   }
   
   /** @param newColname
    * @pdOid 2ac62911-297e-48fe-bcad-973fb2aab2a8 */
   public void setColname(String newColname) {
      colname = newColname;
   }
   
   /** @pdOid 8c7c7c31-e5b7-41fb-adf0-969ae8a89758 */
   public int getOrderId() {
      return orderId;
   }
   
   /** @param newOrderId
    * @pdOid 3446e4a7-532d-43b9-9e18-bef7e1ccb31f */
   public void setOrderId(int newOrderId) {
      orderId = newOrderId;
   }
   
   /** @pdOid eed8e35a-8c29-463f-8161-de944c00381b */
   public String getSqltype() {
      return sqltype;
   }
   
   /** @param newSqltype
    * @pdOid a0a95074-e106-4131-89e6-961c23c960b1 */
   public void setSqltype(String newSqltype) {
      sqltype = newSqltype;
   }
   
   private ArrayList<MetaData> list = new ArrayList<MetaData>();
   
   /** @pdGenerated default getter */
   public ArrayList<MetaData> List() {
      if (list == null) {
         return list;
      }
   
      return null;
   }
   
    public MetaData getMetaData(String colname) {
      if (list == null) {
        	for(MetaData meta:list) {
    	  		if (meta.getColname().equals(colname)) {
    	  			return meta;
    	  		}
    	  	}
      }
	  return null;
   }
}