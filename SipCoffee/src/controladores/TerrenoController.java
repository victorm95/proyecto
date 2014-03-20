package controladores;

import java.util.Vector;

import modelos.Conexion;
import modelos.Rol;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;

public class TerrenoController {

	//Atributos
	private Conexion driver;
	private Connection conexion; 
	
	//Constructor
	public TerrenoController(){
		driver = new Conexion();
	}
	
	
	
	//Acciones
	
	/** Consulta todos los Roles y los devuelve en forma de Vector */
	public Vector all(){
		return null;
	}
	
}
