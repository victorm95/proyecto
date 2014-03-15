package modelos;

import java.util.Vector;

public class Rol {

	//Atributos 
	private int id;
	private String rol;
	
	public Rol(int id,String rol){
		this.id = id;
		this.rol = rol;
	}
	
	
	
	public Vector toVector(){
		Vector v = new Vector();
		//v.add(this.id);
		v.add(this.rol);
		return v;
	}
	
}
