package vistas.parcela;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CrearParcela extends JPanel {
	
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
	
	public JButton btnAceptar;
	public JButton btnCancelar;
	
	private GridBagConstraints constraints;
	
	//Constructor
	public CrearParcela(){
		
		super.setLayout( new GridBagLayout() );
		constraints = new GridBagConstraints();
		
		elementosBloque = new Vector<String>();
		elementosBloque.add("Bloque 1");
		elementosBloque.add("Bloque 2");
		
		elementosEstado = new Vector<String>();
		elementosEstado.add("Activa");
		elementosEstado.add("Inactiva");
		
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		lNombre = new JLabel("Nombre");
		super.add(lNombre,constraints);	
		
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.WEST;
		tNombre = new JTextField(10);
		super.add(tNombre,constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		lArea = new JLabel("Area");
		super.add(lArea,constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		tArea = new JTextField(10);
		super.add(tArea,constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		lBloque = new JLabel("Bloque");
		super.add(lBloque,constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		listaBloque = new JComboBox(elementosBloque);
		super.add(listaBloque,constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 3;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		lEstado = new JLabel("Estado");
		super.add(lEstado,constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 3;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		listaEstado = new JComboBox(elementosEstado);
		super.add(listaEstado,constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 4;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		btnAceptar = new JButton("Aceptar");
		super.add(btnAceptar,constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 4;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		btnCancelar = new JButton("Cancelar");
		super.add(btnCancelar,constraints);
				
	}

}
