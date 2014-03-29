package controladores;

import java.util.Vector;

import modelos.Conexion;
import modelos.Rol;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;

public class RolController {
	
	//Atributos
	Rol rol;
	
	//Constructor
	public RolController(){
		rol = new Rol();
	}
	
	
	
	//Acciones
	
	public boolean insert(String rol){
		if(this.rol.insert(rol)) return true;
		else return false;
	}
	
	public boolean update(String antiguo , String nuevo){
		if( this.rol.update(antiguo,nuevo) ) return true;
		else return false;
	}
	
	public boolean delete(String rol){
		if(this.rol.delete(rol)) return true;
		else return false;
	}
	
	public Vector selectAll(){
		return this.rol.selectAll();
	}
	
}
