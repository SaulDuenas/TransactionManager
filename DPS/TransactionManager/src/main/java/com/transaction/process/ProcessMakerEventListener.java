package com.transaction.process;

import java.util.EventListener;

public interface ProcessMakerEventListener extends EventListener {

	void readSource(SourceEventObject args,String message);
	
	
}
