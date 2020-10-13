package com.transaction.process;

import java.util.EventObject;

public class ProcessMakerEventObject extends EventObject{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ProcessMaker processMaker;
	
	
	public ProcessMakerEventObject(Object source,ProcessMaker processMaker) {
		super(source);
		this.processMaker = processMaker;
		// TODO Auto-generated constructor stub
	}

	public ProcessMaker getProcessMaker ()
    {
        return processMaker;
    }
	
	
}
