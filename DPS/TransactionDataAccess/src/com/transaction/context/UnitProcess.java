/***********************************************************************
 * Module:  UnitProccess.java
 * Author:  saul.duenas
 * Purpose: Defines the Class UnitProccess
 ***********************************************************************/

package com.transaction.context;

import java.util.ArrayList;

/** Registro de unidades de Proceso
 * Entiendase como unidad
 * 
 * @pdOid cfaa1d70-fa32-49ce-8026-f9f657613d85 */
public class UnitProcess {
   /** PK - Nombre de la Unidad de Proceso
    * 
    * @pdOid 4a56a847-8f87-42ec-b0f6-970d054cb6dd */
   protected String process;
   /** Descripciòn de la Unidad de Proceso
    * 
    * @pdOid fb557adb-8ee4-4a46-9d25-45869d01de66 */
   protected String description;
   
   /** @pdRoleInfo migr=no name=Match assc=fkMappingUnitsProccess coll=java.util.List impl=java.util.ArrayList mult=0..* type=Composition */
   public Match match = new Match();
   /** @pdRoleInfo migr=no name=Source assc=fkUnitsProccessSourcesOutput mult=1..1 side=A */
   public Source source_in = new Source();
   /** @pdRoleInfo migr=no name=Source assc=fkUnitsProccessSourcesInput mult=1..1 side=A */
   public Source source_out = new Source();
   
   /** @pdOid 916e151c-7b0e-4fa5-a87c-f89e19797d15 */
   public String getProcess() {
      return process;
   }
   
   /** @param newProcess
    * @pdOid 37577b03-707c-468e-bf3d-b73649434111 */
   public void setProcess(String newProcess) {
      process = newProcess;
   }
   
   /** @pdOid ca381b2c-1b42-4be1-89e3-b5436277ae53 */
   public String getDescription() {
      return description;
   }
   
   /** @param newDescription
    * @pdOid d5c2faf3-51bb-409c-9590-6e687859ca2f */
   public void setDescription(String newDescription) {
      description = newDescription;
   }
   
   public Match getMatch() {
	  return match;
   }

   public void setMatch(Match match) {
	  this.match = match;
   }
	
   public Source getSource_in() {
	  return source_in;
   }
	
   public void setSource_in(Source source_in) {
	  this.source_in = source_in;
   }
	
   public Source getSource_out() {
	  return source_out;
   }
	
   public void setSource_out(Source source_out) {
	  this.source_out = source_out;
   }
   

   private ArrayList<UnitProcess> list = new ArrayList<UnitProcess>();
   
   /** @pdGenerated default getter */
   public ArrayList<UnitProcess> List() {
      if (list == null) {
         return list;
      }
   
      return null;
   }
   
   public UnitProcess getMetaData(String processName) {
      if (list == null) {
        	for(UnitProcess up:list) {
    	  		if (up.getProcess().equals(processName)) {
    	  			return up;
    	  		}
    	  	}
      }
	  return null;
   }
   
   
}