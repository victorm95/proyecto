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
	
	public boolean nuevo(String rol){
		if(this.rol.nuevo(rol)){
			return true;
		}else{
			return false;
		}
	}
	
	
	public Vector all(){
		return this.rol.all();
	}
	

}
