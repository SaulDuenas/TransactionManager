package com.transaction.mapper;

import java.util.ArrayList;


public class process {

	private String name="";
	private ArrayList<String> parameters= new ArrayList<String>();
	
	
	public ArrayList<String> getParameters() {
		return parameters;
	}
	
	
	public void setParameters(ArrayList<String> parameters) {
		this.parameters = parameters;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	private ArrayList<process> list = new ArrayList<process>();
	
	public ArrayList<process> list() {
		if (list != null) {
			return list;
	    }
	       
	    return null;
	}
	
  
	public process getProcess(String processName) {
		if (list != null) {
			for(process proc:list) {
				if (proc.getName().equals(processName)) {
					return proc;
				}
			}
		}
		return null;
	}
	
	
	public process() {
		
	}
	
	public process(String arg) {
	
		//Triplet<String,Integer,Double[]> = Triplet.with
		
		// Trama la cadena:   nombreProceso,var01:value01,var02:value02, ....., varN:valueN
		String str = new String (arg);
		String parts[] =str.split(",");
		
		// set name process
		this.name = parts[0];
		// set parameters
		for (int i=1;i<=(parts.length-1);i++) {
			
			parameters.add(parts[i]);
		}
		
	}
	
	  
}
