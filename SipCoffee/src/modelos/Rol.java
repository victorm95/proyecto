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
	
	/*-----------------------------|Getters|---------------------------------*/
	
	public String getRol(){
		return this.rol;
	}
	
	public int getId(){
		return this.id;
	}
	
	public Vector<String> toVector(){
		Vector<String> v = new Vector<String>();
		v.add(this.rol);
		return v;
	}
	
}
