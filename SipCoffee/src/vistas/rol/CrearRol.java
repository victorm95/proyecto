package vistas.rol;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controladores.RolController;

public class CrearRol extends JPanel {

	//Componentes Graficos
	
	private JLabel lNombre;
	
	private JTextField tNombre;
	
	private JButton btnGuardar;
	private JButton btnCancelar;
	private JButton btnEliminar;
	
	private JTable tabla;
	private JScrollPane scroll;
	
	private Vector<String> titulo;
	private Vector<Object> data;
	
	private RolController controlador;
	
	//Constructor
	public CrearRol(){
		controlador = new RolController();
		
		titulo = new Vector<String>();
		titulo.add("Rol");
		
		data = controlador.all();

		tabla = new JTable(data,titulo);
		scroll = new JScrollPane(tabla);
		scroll.setPreferredSize(new Dimension(150,150));
		
		lNombre = new JLabel("Nombre");
		tNombre = new JTextField(10);
		
		btnGuardar = new JButton("Guargar");
		btnCancelar = new JButton("Cancelar");
		btnEliminar = new JButton("Eliminar");
				
		
		super.setLayout( new GridBagLayout() );
		
		super.add(lNombre , new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,10,2,5) , 1,1) );
		super.add(tNombre , new GridBagConstraints(0,1,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,2,5 ) ,1,1) );
		
		super.add(btnGuardar , new GridBagConstraints(0,2,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,2,5) ,1,1) );
		super.add(btnCancelar , new GridBagConstraints(0,3,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,2,5) ,1,1) );
		super.add(btnEliminar , new GridBagConstraints(0,4,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,10,2) ,1,1) );
		
		super.add(scroll, new GridBagConstraints(1,0,2,4,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,10,2,10) ,1,1) );
		
	}
	
}
