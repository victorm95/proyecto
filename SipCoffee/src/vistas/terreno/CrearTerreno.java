package vistas.terreno;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CrearTerreno extends JPanel {
	
	//Componentes Graficos
	private JLabel lTitulo;
	private JLabel lNombre;
	private JLabel lMunicipio;
	private JLabel lDireccion;
	private JLabel lArea;
	
	private JTextField tNombre;
	private JTextField tMunicipio;
	private JTextField tDireccion;
	private JTextField tArea;
	
	public JButton btnAceptar;
	public JButton btnCancelar;
	
	private Font fuenteTexto;
	
	// Constructor
	public CrearTerreno(){
		
		fuenteTexto = new Font("Arial",Font.PLAIN,20);
		
		
		super.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		
		lNombre = new JLabel("Nombre ");
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.WEST;
		super.add (lNombre, constraints);
		
		JTextField campoTexto = new JTextField (10);
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		super.add (campoTexto, constraints);
		
		lMunicipio = new JLabel ("Municipio ");
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		super.add (lMunicipio, constraints);
		
		tMunicipio = new JTextField (10);
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		super.add (tMunicipio, constraints);
		
		lDireccion = new JLabel ("Direccion ");
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		super.add (lDireccion, constraints);
		
		JTextField campoDireccion = new JTextField (10);
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		super.add (campoDireccion, constraints);
		
		lArea = new JLabel ("Area ");
		constraints.gridx = 0;
		constraints.gridy = 3;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		super.add (lArea, constraints);
		
		JTextField campoArea = new JTextField (10);
		constraints.gridx = 1;
		constraints.gridy = 3;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		super.add (campoArea, constraints);
		
		btnAceptar = new JButton ("Aceptar");
		constraints.gridx = 0; 
		constraints.gridy = 4; 
		constraints.gridwidth = 1; 
		constraints.gridheight = 1;
		super.add (btnAceptar, constraints);

		btnCancelar = new JButton ("Cancelar");
		constraints.gridx = 1; 
		constraints.gridy = 4; 
		constraints.gridwidth = 1; 
		constraints.gridheight = 1;
		super.add (btnCancelar, constraints);
		
		
		
	}

}
