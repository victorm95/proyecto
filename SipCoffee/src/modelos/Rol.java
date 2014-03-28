package modelos;

import java.util.Vector;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;

public class Rol extends Conexion{

	//Atributos 
	private int id;
	private String rol;
	
	/*-----------Constructor-------*/
	public Rol(){}
	
	public Rol(int id,String rol){
		this.id = id;
		this.rol = rol;
	}
	
	public Rol(String rol){
		this.rol = rol;
	}
	
	/*-----------------------------|Getters|---------------------------------*/
	
	public String getRol(){
		return this.rol;
	}
	
	public int getId(){
		return this.id;
	}
	
	
	
	/*---------------------------------|Acciones|------------------------------------*/
	/** Crea un nuevo Rol, recibe como parametro un String con el nombre del Rol. */
	public boolean insert(String rol){
		Connection conexion = (Connection)super.conectar();
		try{
			conexion.createStatement().executeUpdate("INSERT INTO Roles(nombre) VALUES('"+rol+"');");
			conexion.close();
			return true;
		}catch(Exception e){
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	
	public boolean delete(String rol){
		Connection conexion = (Connection)super.conectar();
		try{
			conexion.createStatement().executeUpdate("DELETE FROM Roles WHERE Nombre='"+rol+"';");
			conexion.close();
			return true;
		}catch(Exception e){
			System.out.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	
	/** Consulta todos los Roles y los devuelve en forma de Vector */
	public Vector<String> selectAll(){
		ResultSet result;
		Vector<String> retorno;
		Connection conexion;
		try{
			conexion = (Connection)super.conectar();
			retorno = new Vector<String>();
			result = (ResultSet)conexion.createStatement().executeQuery("SELECT * FROM Roles;");
			while(result.next()){
				retorno.add( result.getString("Nombre") );
			}
			conexion.close();
			return retorno;
		}catch(Exception e){
			System.out.println("Error: " + e.getMessage() );
			return null;
		}
	}
	
}
