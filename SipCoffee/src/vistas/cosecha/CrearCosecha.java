package vistas.cosecha;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CrearCosecha extends JPanel {
	
	private JLabel lUsuario;
	private JLabel lCantidad;
	
	private JComboBox listaUsuarios;
	
	private JTextField tCantidad;
	
	private JButton btnAceptar;
	private JButton btnCancelar;
	
	private Vector<String> elementosUsuarios;
	
	//Constructor 
	public CrearCosecha() {
		
		elementosUsuarios = new Vector<String>();
		elementosUsuarios.add("Pedro");
		elementosUsuarios.add("Juan");
		
		lUsuario = new JLabel("Usuario");
		lCantidad = new JLabel("Cantidad");
		
		tCantidad = new JTextField(10);
		
		listaUsuarios = new JComboBox(elementosUsuarios);
		
		btnAceptar = new JButton("Aceptar");
		btnCancelar = new JButton("Cancelar");
		
		
		super.setLayout( new GridBagLayout() );
		
		super.add(lUsuario , new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,10,2,2) ,1,1) );
		super.add(listaUsuarios, new GridBagConstraints(1,0,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,5,2,10) ,1,1) );
		super.add(lCantidad, new GridBagConstraints(0,1,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,2,2) ,1,1) );
		super.add(tCantidad,new GridBagConstraints(1,1,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,5,2,10) ,1,1) );
		super.add(btnAceptar , new GridBagConstraints(0,2,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,10,5) ,1,1) );
		super.add(btnCancelar, new GridBagConstraints(1,2,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,5,10,10) , 1,1) );
		
	}

}
