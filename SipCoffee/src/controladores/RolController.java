package controladores;

import java.util.Vector;

import modelos.Conexion;
import modelos.Rol;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;

public class RolController {
	
	//Atributos
	private Conexion driver;
	private Connection conexion; 
	
	//Constructor
	public RolController(){
		driver = new Conexion();
	}
	
	
	
	//Acciones
	
	public boolean nuevoRol(String rol){
		conexion = (Connection)driver.conectar();
		try{
			conexion.createStatement().executeQuery("INSERT INTO roles(nombre) VALUES('"+rol+"');");
			conexion.close();
			driver.desconectar();
			return true;
		}catch(Exception e){
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	/** Consulta todos los Roles y los devuelve en forma de Vector */
	public Vector all(){
		ResultSet result;
		Vector<Vector<String>> retorno;
		try{
			conexion = (Connection)driver.conectar();
			retorno = new Vector<Vector<String>>();
			result = (ResultSet)conexion.createStatement().executeQuery("SELECT * FROM Rol;");
			
			
			while(result.next()){
				retorno.add( new Rol(result.getInt("Id") , result.getString("Nombre")).toVector() );
			}
			
			conexion.close();
			driver.desconectar();
				
			return retorno;
		}catch(Exception e){
			System.out.println("Error: " + e.getMessage() );
			return null;
		}
	}
	
	
	/*
	
	private class Rol extends Vector{
		private Rol(int id,String rol){
			super.add(id);
			super.add(rol);
		}
	}*/

}
