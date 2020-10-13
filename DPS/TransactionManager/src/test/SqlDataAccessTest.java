package test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import javax.xml.bind.JAXBException;

import org.xml.sax.SAXException;

import com.gatetech.database.DataAccess;
import com.transaction.context.DataContext;
import com.transaction.context.DataSource;

public class SqlDataAccessTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.out.println("Prueba de Conexión");	
			
		java.util.Date fechaIni = new Date();
		System.out.println (fechaIni);
		
				
		try {
			
			DataAccess connection = new DataAccess();
			
			DataContext datacontext = new DataContext("D:\\GateTech\\Internos\\TransactionManager\\DPS\\XML\\transactionManager.xml");
			
			DataSource datasource = datacontext.FillDatasource();
			
			for (DataSource ds:datasource.list()) {
				
				System.out.println(ds.getName());
				
				connection.setConnection(ds.getName(),ds.getDriverclassname(),ds.getUrl(),ds.getUser(), ds.getPassword(),ds.getValidationQuery());
			}
			
			Connection conn= connection.getDataAccess("SIMVOP").GetConnection();
			
			if (!conn.isClosed()) {
				System.out.println("Conexión SIMVOP Ok");
			}	
			else {
				System.out.println("No Conexión");
			}
			
		    conn.close();
		
			java.util.Date fechaFin = new Date();
			System.out.println(fechaFin);
			
		} catch (SQLException  e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
