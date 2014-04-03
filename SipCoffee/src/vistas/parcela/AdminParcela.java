package vistas.parcela;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AdminParcela extends JPanel {
	
	//Componentes Graficos
	
	private JLabel lBloque;
	private JLabel lNombre;
	private JLabel lArea;
	private JLabel lEstado;
	
	private JTextField tNombre;
	private JTextField tArea;
	
	private JComboBox listaEstado;
	private Vector<String> elementosEstado;
	private JComboBox listaBloque;
	private Vector<String> elementosBloque;
	
	public JButton btnGuardar;
	public JButton btnCancelar;
	
	private GridBagConstraints constraints;
	
	//Constructor
	public AdminParcela(){
		
		super.setLayout( new GridBagLayout() );
		constraints = new GridBagConstraints();
		
		elementosBloque = new Vector<String>();
		elementosBloque.add("Bloque 1");
		elementosBloque.add("Bloque 2");
		
		elementosEstado = new Vector<String>();
		elementosEstado.add("Activa");
		elementosEstado.add("Inactiva");
		
		lNombre = new JLabel("Nombre");
		tNombre = new JTextField(10);
		
		lArea = new JLabel("Area");
		tArea = new JTextField(10);
		
		lBloque = new JLabel("Bloque");
		listaBloque = new JComboBox(elementosBloque);
		
		lEstado = new JLabel("Estado");
		listaEstado = new JComboBox(elementosEstado);
		
		btnGuardar = new JButton("Guardar");
		btnCancelar = new JButton("Cancelar");

		super.add(lNombre,new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,10,2,2) ,1,1));	
		super.add(tNombre,new GridBagConstraints(1,0,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,2,2,10) ,1,1) );		

		super.add(lArea,new GridBagConstraints(0,1,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,10,2,2) ,1,1));
		super.add(tArea,new GridBagConstraints(1,1,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,2,2,10) ,1,1) );		

		super.add(lBloque,new GridBagConstraints(0,2,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,10,2,2) ,1,1));
		super.add(listaBloque,new GridBagConstraints(1,2,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,2,2,10) ,1,1));

		super.add(lEstado,new GridBagConstraints(0,3,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,10,2,2) ,1,1));
		super.add(listaEstado,new GridBagConstraints(1,3,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,2,2,10) ,1,1));

		super.add (btnGuardar, new GridBagConstraints(0,4,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,2,2) ,1,1) );
		super.add (btnCancelar, new GridBagConstraints(1,4,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,2,2,10) ,1,1) );
		
		
				
	}

}
