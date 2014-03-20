package modelos;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	
	private Connection conexion;
	private String user;
	private String pass;
	private String server;
	private String db;
	
	//Constructor	
	public Conexion(){
		this.user = "root";
		this.pass = "";
		this.db = "sipcoffee";
		this.server = "localhost";
		this.server = "jdbc:mysql://" + server + "/" + this.db;
	}
	
	public Connection conectar(){
		
		try{
			Class.forName("com.mysql.jdbc.Driver");			
			this.conexion = DriverManager.getConnection(this.server,this.user,this.pass);
			return this.conexion;
		}catch(Exception e){
			return null;
		}
		
	}
	
	
	public boolean desconectar(){
		try{
			conexion.close();
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
	
	/*-----------------------Getters----------------------------------*/
	public Connection getConexion(){
		return this.conexion;
	}
	

}
