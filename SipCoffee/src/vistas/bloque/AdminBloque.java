package vistas.bloque;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AdminBloque extends JPanel {
	
	//Componentes Graficos
	private JLabel lTerreno;
	private JLabel lNombre;
	private JLabel lArea;
	
	private JComboBox lista;
	private Vector<String> elementosLista;
	
	private JTextField tNombre;
	private JTextField tArea;
	
	private Font fuenteTexto;
	
	public JButton btnGuardar;
	public JButton btnCancelar;
	
	private GridBagConstraints constrains;
	
	//Constructor
	public AdminBloque(){
		
		super.setLayout(new GridBagLayout());
				
		elementosLista = new Vector<String>();
		elementosLista.add("Tereno 1");
		elementosLista.add("Tereno 2");		
		lista = new JComboBox(elementosLista);
		
		lTerreno = new JLabel("Terreno");
		
		lNombre = new JLabel("Nombre");
		tNombre = new JTextField(10);
		
		lArea = new JLabel("Area");
		tArea = new JTextField(10);	
		
		btnGuardar = new JButton("Guardar");
		btnCancelar = new JButton("Cancelar");
		
		super.add(lTerreno,new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,10,2,2) ,1,1) );
		super.add(lista,new GridBagConstraints(1,0,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,2,2,10) ,1,1) );
		
		super.add(lNombre,new GridBagConstraints(0,1,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,10,2,2) ,1,1) );
		super.add(tNombre,new GridBagConstraints(1,1,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,2,2,10) ,1,1) );

		super.add(lArea,new GridBagConstraints(0,2,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,10,2,2) ,1,1) );
		super.add(tArea,new GridBagConstraints(1,2,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,2,2,10) ,1,1) );
		
		super.add (btnGuardar, new GridBagConstraints(0,3,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,2,2) ,1,1) );
		super.add (btnCancelar, new GridBagConstraints(1,3,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,2,2,10) ,1,1) );
		
		
			
	}

}
