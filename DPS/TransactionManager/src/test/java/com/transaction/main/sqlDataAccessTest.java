package com.transaction.main;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import com.gatetech.database.DataConnection;
import com.gatetech.database.SqlHelper;

import com.gatetech.datasource.DataRow;
import com.gatetech.datasource.Layout;
import com.gatetech.datasource.DataTable;

public class sqlDataAccessTest {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss.SSS");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("DataAccess TEST - Date:" + timestamp.toString() + " - OtherFormat:" + sdf.format(timestamp));
		
		//DataAccess dataaccess = new DataAccess("ASIGNACION", "net.sourceforge.jtds.jdbc.Driver", "jdbc:jtds:sqlserver://oficina.teseracto.com:1435;databaseName=SIMVOP;", "sa", "Te$eract0", "SELECT 1");

	   //DataAccess dataaccess = new DataAccess("TESERACTO", "com.microsoft.sqlserver.jdbc.SQLServerDriver", "jdbc:sqlserver://oficina.teseracto.com:1433;databaseName=SIMVOP;", "sa", "Te$eract0", "SELECT 1");
		DataConnection dataaccess = new DataConnection("AcciDevSQL01", "com.microsoft.sqlserver.jdbc.SQLServerDriver", "jdbc:sqlserver://AcciDevSQL01:2431;databaseName=ASIGNACION;", "weblogic", "logic", "SELECT 1");

	   
		// Obtengo una conexión en especifico
		Connection conn;
		try {
			// Se establece al conexión
			conn = dataaccess.GetConnection();
			
			String msg = !conn.isClosed()?"Conexión a AcciDevSQL01  OK":"No Conexión";
			System.out.println(msg);
			System.out.println("Corriendo consulta SQL");
			
			Object[] parameters = new Object[1];
			parameters[0] = (String)"IENOVA";
			
			//parameters = null;
			
			//DataTable datatable = SqlHelper.ExecuteDataTable(dataaccess, "SELECT TOP 10 Folio,FechaHora,Pozo,Variable,Valor FROM MUESTREO;", parameters);
			DataTable datatable = SqlHelper.FillDataTable(dataaccess, "SELECT TOP 10 IdOrden, FecRecep, NomEmisora,PrecioOrden,CantTitOrden FROM ASIGNACION.dbo.Asi_Orden_RINO  WHERE NomEmisora = ? ;", parameters);
			 
			for(int i=0;i<=datatable.DataColumList().size()-1;i++) {
				System.out.println("Name: " + datatable.DataColumList().get(i).get_Name() + " - Type: " + datatable.DataColumList().get(i).DataType() + " - SQLType: " + datatable.DataColumList().get(i).SQLType());
			}
			
			System.out.println(datatable.ColumnstoString("|", "\"", "\""));
			
		    Layout layout_list = new Layout(); 
		    layout_list.getlist().add(new Layout(3,""));
		    layout_list.getlist().add(new Layout(2,""));
		    layout_list.getlist().add(new Layout(1,"yyyy.MM.dd.HH.mm.ss.SSS"));
		    layout_list.getlist().add(new Layout(4,""));
		    layout_list.getlist().add(new Layout(0,""));

	//	    layout_list = null;
		    
			for(DataRow rw:datatable.DataRowList()) {
				
				System.out.println(rw.toString("|", "\"", "\"",layout_list.getlist()));
			}
			
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
}
