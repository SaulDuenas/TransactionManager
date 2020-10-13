package com.transaction.mapper;

import java.io.IOException;

public class properties extends propertiesBase {

	public properties() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public String path_out() throws Exception {
		return this.get_property("parser.file.out").trim();
		
	}
	
	
}
