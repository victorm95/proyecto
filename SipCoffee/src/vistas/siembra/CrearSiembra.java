package vistas.siembra;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CrearSiembra extends JPanel {
	
	//Componentes Graficos
	
	private JLabel lSemilla;
	private JLabel lParcela;
	private JLabel lUsuario;
	private JLabel lCantidad;
	
	private JTextField tUsuario;
	private JTextField tCantidad;
	
	private JComboBox listaSemilla;
	private JComboBox listaParcela;
	
	public JButton btnAceptar;
	public JButton btnCancelar;
	
	private Vector<String> elementosSemilla;
	private Vector<String> elementosParccela;
	
	//Constructor 
	public CrearSiembra(){
		
		super.setLayout( new GridBagLayout() );
		
		elementosParccela = new Vector<String>();
		elementosParccela.add("Parcela 1");
		elementosParccela.add("Parcela 2");
		elementosParccela.add("Parcela 3");
		
		elementosSemilla = new Vector<String>();
		elementosSemilla.add("Caturra");
		
		
		lSemilla = new JLabel("Semilla");
		listaSemilla = new JComboBox(elementosSemilla);
		
		lParcela = new JLabel("Parcela");
		listaParcela = new JComboBox(elementosParccela);
		
		lUsuario = new JLabel("Usuario");
		tUsuario = new JTextField(10);
		
		lCantidad = new JLabel("Cantidad");
		tCantidad = new JTextField(10);
		
		btnAceptar = new JButton("Aceptar");
		btnCancelar = new JButton("Cancelar");
		
		
		
		super.add(lSemilla, new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,10,2,2) ,1,1) );
		super.add(listaSemilla, new GridBagConstraints(1,0,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,2,2,10) ,1,1) );
		
		super.add(lParcela,new GridBagConstraints(0,1,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,2,2) ,1,1) );
		super.add(listaParcela,new GridBagConstraints(1,1,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,2,2,10) ,1,1) );
		
		super.add(lUsuario,new GridBagConstraints(0,2,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,2,2) ,1,1) );
		super.add(tUsuario,new GridBagConstraints(1,2,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,2,2,10) ,1,1) );
		
		super.add(lCantidad,new GridBagConstraints(0,3,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,2,2) ,1,1) );
		super.add(tCantidad,new GridBagConstraints(1,3,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,2,2,10) ,1,1) );
		
		super.add(btnAceptar,new GridBagConstraints(0,4,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,10,2) ,1,1) );
		super.add(btnCancelar,new GridBagConstraints(1,4,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,2,10,10) ,1,1) );
		
	}

}
