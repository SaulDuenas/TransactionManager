package com.transaction.context;

import java.util.ArrayList;

public class Match implements Comparable<Match> {

	   /** @pdOid efedd397-b0b1-486b-a608-6e959b20d301 */
	   private int orderId;
	   /** @pdOid 2eb75b5f-a9a0-4698-8c3c-0dfa351adabd */
	   private String format;
	
	   /** @pdOid c6eaf659-6b43-416c-93e3-d091eaf20212 */
	   private String colname_in;
	   
	   /** @pdOid c6eaf659-6b43-416c-93e3-d091eaf20212 */
	   private String colname_out;
	   
	   
	   /** @pdOid 5e187810-ccf6-4add-9bcc-542bdd550b9e */
	   public int getOrderId() {
	      return orderId;
	   }
	   
	   /** @param newOrderId
	    * @pdOid 620ab358-25f0-4ea9-b4e8-34da1355545f */
	   public void setOrderId(int newOrderId) {
	      orderId = newOrderId;
	   }
	   
	   /** @pdOid c889738d-7383-402f-b2de-90610d85034d */
	   public String getFormat() {
	      return format;
	   }
	   
	   /** @param newFormat
	    * @pdOid 33656a29-3fff-49d5-b67a-869d4014d173 */
	   public void setFormat(String newFormat) {
	      format = newFormat;
	   }
	   
	   /** @pdOid b726932b-49db-46fa-9e20-2666aa1b8765 */
	   public String getColname_in() {
	      return colname_in;
	   }
	   
	   /** @param newColname
	   */
	   public void setColname_in(String newColname) {
	      colname_in = newColname;
	   }
	   
	   /** @pdOid b726932b-49db-46fa-9e20-2666aa1b8765 */
	   public String getColname_out() {
	      return colname_out;
	   }
	   
	   /** @param newColname
	    * @pdOid 2ac62911-297e-48fe-bcad-973fb2aab2a8 */
	   public void setColname_out(String newColname) {
	      colname_out = newColname;
	   }
	   
	   private ArrayList<Match> list = new ArrayList<Match>();
	   
	   /** @pdGenerated default getter */
	   public ArrayList<Match> List() {
	      if (list == null) {
	         return list;
	      }
	      
	      return null;
	   }
	   
	   @Override
	   public int compareTo(Match o) {
           if (orderId < o.getOrderId()) {
               return -1;
           }
           if (orderId > o.getOrderId()) {
               return 1;
           }
           return 0;
       }
	   
}
