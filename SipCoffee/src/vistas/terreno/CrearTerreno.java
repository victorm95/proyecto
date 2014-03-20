package vistas.terreno;

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

import controladores.TerrenoController;

public class CrearTerreno extends JPanel {
	
	//Componentes Graficos
	private JLabel lNombre;
	private JLabel lMunicipio;
	private JLabel lDireccion;
	private JLabel lArea;
	
	private JTextField tNombre;
	private JTextField tMunicipio;
	private JTextField tDireccion;
	private JTextField tArea;
	
	private JTable tabla;
	private Vector<String> titulo;
	private Vector<Object> data;
	
	public JButton btnAceptar;
	public JButton btnCancelar;
	
	private TerrenoController controlador;
	
	
	// Constructor
	public CrearTerreno(){
			
		controlador = new TerrenoController();
		
		titulo = new Vector<String>();
		titulo.add("Municipio");
		titulo.add("Nombre");
		titulo.add("Direccion");
		titulo.add("Area");
		
		data = controlador.all();
		
		tabla = new JTable(data,titulo);
		
		
		lNombre = new JLabel("Nombre ");
		tNombre = new JTextField (10);
		
		lMunicipio = new JLabel ("Municipio ");
		tMunicipio = new JTextField (10);
		
		lDireccion = new JLabel ("Direccion ");
		tDireccion = new JTextField (10);
		
		lArea = new JLabel ("Area ");
		tArea = new JTextField (10);
		
		btnAceptar = new JButton ("Aceptar");
		btnCancelar = new JButton ("Cancelar");
		

		super.setLayout(new GridBagLayout());
		
		super.add (lNombre, new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,10,2,2) ,1,1) );
		super.add (tNombre, new GridBagConstraints(1,0,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,2,2,10) ,1,1) );
		
		super.add (lMunicipio, new GridBagConstraints(0,1,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,2,2) ,1,1) );
		super.add (tMunicipio, new GridBagConstraints(1,1,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,2,2,10) ,1,1) );
		
		super.add (lDireccion, new GridBagConstraints(0,2,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,2,2) ,1,1) );
		super.add (tDireccion, new GridBagConstraints(1,2,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,2,2,10) ,1,1) );
		
		super.add (lArea, new GridBagConstraints(0,3,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,2,2) ,1,1) );
		super.add (tArea, new GridBagConstraints(1,3,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,2,2,10) ,1,1) );
		
		super.add (btnAceptar, new GridBagConstraints(0,4,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,2,2) ,1,1) );
		super.add (btnCancelar, new GridBagConstraints(1,4,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,2,2,10) ,1,1) );
		
		super.add(new JScrollPane(tabla),new GridBagConstraints(3,0,2,4,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,2,10,10) ,1,1) );
		
	}

}
