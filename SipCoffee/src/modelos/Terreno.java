package modelos;

import com.mysql.jdbc.Connection;

public class Terreno extends Conexion{

	public boolean insert(String municipio, String nombre, int area, String direccion){
		
		Connection conexion = (Connection)super.conectar();
		
		try{
			
			conexion.createStatement().executeUpdate("INSERT INTO terreno(Municipio,Nombre,Area,Direccion) VALUES('"+municipio+"','"+nombre+"',"+area+",'"+direccion+"');");
			conexion.close();
			
			return true;
			
		}catch(Exception e){
			
			System.out.println("Error: " + e.getMessage());
			
			return false;
			
		}
		
	}

	public boolean update(String municipio, String nombre, int area, String direccion){
		
		Connection conexion = (Connection)super.conectar();
		
		try{
			
			conexion.createStatement().executeUpdate("UPDATE terreno SET Municipio='"+municipio+"', Nombre='"+nombre+"', Area="+area+",Direccion='"+direccion+"' WHERE Nombre='"+nombre+"';");
			conexion.close();
			
			return true;
			
		}catch(Exception e){
			
			System.out.println("Error: " + e.getMessage());
			
			return false;
			
		}
		
	}
	
	public boolean delete(String nombre){
		
		Connection conexion = (Connection)super.conectar();
		
		try{
			
			conexion.createStatement().executeUpdate("DELETE terreno WHERE Nombre='"+nombre+"';");
			conexion.close();
			
			return true;
			
		}catch(Exception e){
			
			System.out.println("Error: " + e.getMessage());
			
			return false;
			
		}
		
	}
	
}
