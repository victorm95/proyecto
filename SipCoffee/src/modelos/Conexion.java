package modelos;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	protected static String user = "root";
	protected static String pass = "";
	protected static String server = "jdbc:mysql://localhost/SipCoffee";
	
	//Constructor	
	public Conexion(){
		
	}
	
	protected static Connection conectar(){
		Connection conexion;
		try{
			Class.forName("com.mysql.jdbc.Driver");			
			conexion = DriverManager.getConnection(Conexion.server,Conexion.user,Conexion.pass);
			return conexion;
		}catch(Exception e){
			return null;
		}
		
	}
	
}
