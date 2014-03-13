package vistas.siembra;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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
	
	private GridBagConstraints constraints;
	
	//Constructor 
	public CrearSiembra(){
		
		super.setLayout( new GridBagLayout() );
		constraints = new GridBagConstraints();
		
		elementosParccela = new Vector<String>();
		elementosParccela.add("Parcela 1");
		elementosParccela.add("Parcela 2");
		elementosParccela.add("Parcela 3");
		
		elementosSemilla = new Vector<String>();
		elementosSemilla.add("Caturra");
		
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		lSemilla = new JLabel("Semilla");
		super.add(lSemilla,constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		listaSemilla = new JComboBox(elementosSemilla);
		super.add(listaSemilla,constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		lParcela = new JLabel("Parcela");
		super.add(lParcela,constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		listaParcela = new JComboBox(elementosParccela);
		super.add(listaParcela,constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		lUsuario = new JLabel("Usuario");
		super.add(lUsuario,constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		tUsuario = new JTextField(10);
		super.add(tUsuario,constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 3;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		lCantidad = new JLabel("Cantidad");
		super.add(lCantidad,constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 3;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		tCantidad = new JTextField(10);
		super.add(tCantidad,constraints);
		
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
