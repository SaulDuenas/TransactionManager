package com.transaction.process;

import java.util.EventObject;

import com.transaction.context.Source;

public class SourceEventObject extends EventObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Source sourceObj = new Source();
	
	
	
	public SourceEventObject(Object source,Source sourceObj) {
		super(source);
		
		this.sourceObj  = sourceObj;
		// TODO Auto-generated constructor stub
	}
	
	public Source getSource () {
		return this.sourceObj;
	}

}
