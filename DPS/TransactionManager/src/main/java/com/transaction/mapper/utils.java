package com.transaction.mapper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

import javax.xml.bind.JAXBException;

import org.xml.sax.SAXException;

import com.gatetech.database.DataConnection;
import com.transaction.context.DataSource;
import com.transaction.context.TransactionDataContext;

public class utils {

	public static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");	
	
	public utils(){
		
	}
	
	static public String messageLog (String msg) {
		
		return utils.sdf.format(new Date()) + " - " + msg; 
	}
	
	static public DataConnection FillDataAcces (TransactionDataContext dataContext) throws JAXBException, SAXException, IOException {
		DataSource datasource = dataContext.FillDataSource(); // 
		DataConnection dataaccees = new DataConnection();
		
		// Cargo los datasources al Array de DataAccess
		for (DataSource ds:datasource.list()) {
			
			//System.out.println(ds.getName());
		    dataaccees.List().add(new DataConnection(ds.getName(),ds.getDriverclassname(),ds.getUrl(),ds.getUser(), ds.getPassword(),ds.getValidationQuery()));
		}
		
		return dataaccees;
	}
	
	
	
	public static boolean outputFile(String path,Collection<String> content) throws IOException {
		boolean lretval=false;
		File file = new File(path);
		BufferedWriter bw=null;
		
		
		bw = new BufferedWriter(new FileWriter(file));
		for (String s:content){
		  bw.write(s);
		  bw.newLine();
		}   
		bw.close();
		lretval = true;
	
		return lretval;
	}
	
	
	public static boolean outputFile(String path,String content) throws IOException {
		boolean lretval=false;
		File file = new File(path);
		BufferedWriter bw=null;
		
		bw = new BufferedWriter(new FileWriter(file));
	
	    bw.write(content);
		bw.newLine();
		bw.close();
		lretval = true;
	
		return lretval;
	}
	
	
	public static Object SqlTypetoData (String sqlType,Object value,boolean isArray) {
		
		if (sqlType.equals("INTEGER")){
			return Integer.parseInt(value.toString());
		}
		else if (sqlType.equals("BIGINT")){
			return  Long.parseLong(value.toString());
		}
		
		else if (sqlType.equals("REAL")){
			return  Float.parseFloat(value.toString());
		}
		else if (sqlType.equals("FLOAT") || sqlType.equals("DOUBLE")){
			return  Double.parseDouble(value.toString());
		}
		
		else if (sqlType.equals("CHAR") || sqlType.equals("VARCHAR") || sqlType.equals("LONGVARCHAR")){
			return value.toString();
		}
		
		else if (sqlType.equals("NUMERIC") || sqlType.equals("DECIMAL") ){
			return  (java.math.BigDecimal) value;
		}
		
		else if (sqlType.equals("BOOLEAN")){
			return  Boolean.parseBoolean(value.toString());
		}
		else if (sqlType.equals("TINYINT")){
			return  Byte.parseByte(value.toString());
		}
		else if (sqlType.equals("SMALLINT")){
			return  Short.parseShort(value.toString());
		}
		
		else if (sqlType.equals("DATE") || sqlType.equals("TIME") || sqlType.equals("TIMESTAMP")){
			return new java.sql.Date(((Date) value).getTime());
		}
		
		return null;
		
	}
	
}
