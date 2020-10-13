package com.transaction.context;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.xml.sax.SAXException;

import com.configuration.dao.ConfigurationData;
import com.configuration.xml.CONFIGURATION;


public class TransactionDataContext extends ConfigurationData {
	
	static CONFIGURATION transactionConf = null;
	static int option=0;
	
	enum Options {
		XML,DATABASE;
	};
	
	@SuppressWarnings("unused")
	private Options local_option;
	
	
	// 
	
	public TransactionDataContext() throws IOException {
		super();
		this.local_option = Options.XML;
		// TODO Auto-generated constructor stub
	}

	
	// 
	
	public TransactionDataContext(String path) throws IOException, JAXBException, SAXException {
		super(path);
		this.local_option = Options.XML;
		// TODO Auto-generated constructor stub
	}

	
	
	public Property FillProperties() throws JAXBException, SAXException, IOException {
    	
    	if (this.local_option.equals(Options.XML) &&  !(path_file.equals(null) || path_file.equals(""))) {
    		
    		Property property = new Property();
    		//transactionXml = new TransactionXML().Transaction(path);
    		
    		transactionConf = serializeConfig();
    		
    		// Obteniendo PROPERTIES
    		for(CONFIGURATION.PROPERTY prop : transactionConf.getPROPERTY()) {
    			property.List().add(new Property(prop.getPROPERTY(),
    											 prop.getPROPERTYPARENT(),
    											 prop.getCATEGORY(),
    											 prop.getSQLTYPE(),
    											 prop.getTYPE(),
    											 prop.getDATASOURCE(),
    											 prop.getISMULTIVALUE(),
    											 prop.getVALUE()));		
    		}
    		
    		return property;
    	}
    	
    	
    	if (this.local_option.equals(Options.DATABASE)){
    		
    		
    	}
    	
    	
    	return null;
    }
		

    
    public DataSource FillDataSource() throws JAXBException, SAXException, IOException {
    	
    	if (this.local_option.equals(Options.XML) &&  !(path_file.equals(null) || path_file.equals(""))) {
    		
    		DataSource datasource = new DataSource();
    		
    		transactionConf = serializeConfig();
    		//com.configuration.data.configuration
    		//TODO Get DATASOURCES
    		for(CONFIGURATION.CONNECTION ds : transactionConf.getCONNECTION()) {
    			
    			datasource.list().add(new DataSource(ds.getNAME(),
    												 ds.getURL(),
    												 ds.getUSER(),
    												 ds.getPASSWORD(),
    												 ds.getDRIVERCLASSNAME(),
    												 ds.getVALIDATIONQUERY()));		
    		}
    	
    		return datasource;
    	}

    	
    	if (this.local_option.equals(Options.DATABASE)){
    		
    		
    		
    	}
    	
    	
    	return null;
    }
    
    
    public Source FillSource() throws JAXBException, SAXException, IOException {
    	
    	if (this.local_option.equals(Options.XML) &&  !(path_file.equals(null) || path_file.equals(""))) {
    		
    		Source source = new Source();
    		
    		transactionConf = serializeConfig();
    		
    		//TODO Get Sources
    		for(CONFIGURATION.SOURCE src : transactionConf.getSOURCE()) {
    			
    			source.list().add(new Source(src.getGROUP(),src.getNAME(),src.getTYPESOURCE(),
   			   		                         src.getFILENAME(),src.getPATH(),src.getCODINGFORMAT(),src.getHEADER(),src.getDELIMITER(),
   			   		                         src.getLEFTENCLOSURE(),src.getRIGHTENCLOUSURE(),src.getSHEETNAME(),src.getDATASOURCE(),
   			   		                         src.getJRXMLPATH(),src.getSQLSOURCE(),src.getSQLLOAD(),src.getDATALOAD()));
    			
    			
    			//MetaData metadataList = new MetaData();
    	      	//TODO  Get MetaData
    			for(CONFIGURATION.SOURCE.METADATA metadata : src.getMETADATA()) {
    				
    				//metadataList.List().add(new MetaData(metadata.getCOLNAMESOURCE(),metadata.getORDERIDSOURCE(),metadata.getCOLNAMELOAD(),metadata.getORDERIDLOAD(),metadata.getSQLTYPE(),metadata.getFORMAT()));
    				
    				source.MetaData().add(new MetaData(metadata.getCOLNAMESOURCE(),metadata.getORDERIDSOURCE(),metadata.getCOLNAMELOAD(),metadata.getORDERIDLOAD(),metadata.getSQLTYPE(),metadata.getFORMAT()));
    			}
    			
    			//source.MetaData().addAll(metadataList.List());
    		
    	    	//TODO  Get Parameters
    			for(CONFIGURATION.SOURCE.PARAMETER parameter : src.getPARAMETER()) {
    				source.Parameters().add(new Parameter(parameter.getPARAMETER(),parameter.getIDORDER(),parameter.getTYPE(),parameter.getSQLTYPE(),parameter.getISMULTIVALUE(),parameter.getVALUE()) );
    			}
    		}
    	
    		return source;
    	}
    	
    	
    	if (this.local_option.equals(Options.DATABASE)){
    		
    		
    		
    	}
    	
    	return null;
    }
    
    
    
	
}
