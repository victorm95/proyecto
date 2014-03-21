package modelos;

import java.util.Vector;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;

public class Rol extends Conexion{

	//Atributos 
	private int id;
	private String rol;
	
	/*-----------Constructores-------*/
	public Rol(){}
	
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
	
	
	/*---------------------------------|Acciones|------------------------------------*/
	/** Crea un nuevo Rol */
	public boolean nuevo(String rol){
		Connection conexion = (Connection)super.conectar();
		try{
			conexion.createStatement().executeUpdate("INSERT INTO Roles(nombre) VALUES('"+rol+"');");
			conexion.close();
			conexion.close();
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
		Connection conexion;
		try{
			conexion = (Connection)super.conectar();
			retorno = new Vector<Vector<String>>();
			result = (ResultSet)conexion.createStatement().executeQuery("SELECT * FROM Roles;");
			while(result.next()){
				retorno.add( new Rol(result.getInt("Id") , result.getString("Nombre")).toVector() );
			}
			conexion.close();
			return retorno;
		}catch(Exception e){
			System.out.println("Error: " + e.getMessage() );
			return null;
		}
	}
}
