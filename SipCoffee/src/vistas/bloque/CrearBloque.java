package vistas.bloque;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CrearBloque extends JPanel {
	
	//Componentes Graficos
	private JLabel lTerreno;
	private JLabel lNombre;
	private JLabel lArea;
	
	private JComboBox lista;
	private Vector<String> elementosLista;
	
	private JTextField tNombre;
	private JTextField tArea;
	
	private Font fuenteTexto;
	
	public JButton btnAceptar;
	public JButton btnCancelar;
	
	private GridBagConstraints constrains;
	
	//Constructor
	public CrearBloque(){
		
		super.setLayout(new GridBagLayout());
		constrains = new GridBagConstraints();
		
		fuenteTexto = new Font("Arial",Font.PLAIN,20);
		
		elementosLista = new Vector<String>();
		elementosLista.add("Tereno 1");
		elementosLista.add("Tereno 2");
		
		constrains.gridx = 0;
		constrains.gridy = 0;
		constrains.gridwidth = 1;
		constrains.gridheight = 1;
		lTerreno = new JLabel("Terreno");
		lTerreno.setFont(fuenteTexto);
		super.add(lTerreno,constrains);
		
		constrains.gridx = 1;
		constrains.gridy = 0;
		constrains.gridwidth = 1;
		constrains.gridheight = 1;
		lista = new JComboBox(elementosLista);
		super.add(lista,constrains);
		
		constrains.gridx = 0;
		constrains.gridy = 1;
		constrains.gridwidth = 1;
		constrains.gridheight = 1;
		lNombre = new JLabel("Nombre");
		lNombre.setFont(fuenteTexto);
		super.add(lNombre,constrains);
		
		constrains.gridx = 1;
		constrains.gridy = 1;
		constrains.gridwidth = 1;
		constrains.gridheight = 1;
		tNombre = new JTextField(10);
		super.add(tNombre,constrains);
				
		constrains.gridx = 0;
		constrains.gridy = 2;
		constrains.gridwidth = 1;
		constrains.gridheight = 1;
		lArea = new JLabel("Area");
		lArea.setFont(fuenteTexto);
		super.add(lArea,constrains);
		
		constrains.gridx = 1;
		constrains.gridy = 2;
		constrains.gridwidth = 1;
		constrains.gridheight = 1;
		tArea = new JTextField(10);
		super.add(tArea,constrains);
		
		constrains.gridx = 0;
		constrains.gridy = 3;
		constrains.gridwidth = 1;
		constrains.gridheight = 1;
		btnAceptar = new JButton("Aceptar");
		super.add(btnAceptar,constrains);
		
		constrains.gridx = 1;
		constrains.gridy = 3;
		constrains.gridwidth = 1;
		constrains.gridheight = 1;
		btnCancelar = new JButton("Cancelar");
		super.add(btnCancelar,constrains);
		
			
	}

}
