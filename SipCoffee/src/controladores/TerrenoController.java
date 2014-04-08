package controladores;

import java.util.Vector;

import modelos.Rol;
import modelos.Terreno;

public class TerrenoController {

	//Atributos
	Terreno terreno;
	
	//Constructor
	public TerrenoController(){
		terreno = new Terreno();
	}	
	
	//Acciones
	
	public boolean insert(String municipio, String nombre, int area, String direccion){
		if(this.terreno.insert(municipio, nombre, area, direccion)){
			return true;
		}else{
			return false;
		}
	}
	

	
}
