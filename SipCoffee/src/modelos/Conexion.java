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
	public Conexion(){}
	
	public Conexion(String server , String user , String pass , String db){
		this.user = user;
		this.pass = pass;
		this.db = db;
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
	
	
	/*--------------------------Setters-------------------------------*/
	
	public void setServer(String server){
		this.server = "jdbc:mysql://" + server + "/" + this.db;
	}
	
	public void setUser(String user){
		this.user = user;
	}
	
	public void setPass(String pass){
		this.pass = pass;
	}
	
	public void setDb(String db){
		this.db = db;
	}

}
