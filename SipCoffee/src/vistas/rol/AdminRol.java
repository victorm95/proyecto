package vistas.rol;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import modelos.Rol;
import controladores.RolController;

public class AdminRol extends JPanel implements ActionListener {

	//Componentes Graficos
	
	private JLabel lNombre;
	
	private JTextField tNombre;
	
	private JButton btnGuardar;
	private JButton btnCancelar;
	
	private JTable tabla;
	private DefaultTableModel tModel;
	private JScrollPane scroll;
	
	private Vector<String> titulo;
	private Vector<Object> data;
	
	private RolController controlador;
	
	//Constructor
	public AdminRol(){
		controlador = new RolController();
		
		titulo = new Vector<String>();
		titulo.add("Rol");

		data = adaptar(controlador.selectAll());
		tModel = new DefaultTableModel(data,titulo);

		tabla = new JTable(tModel);
		scroll = new JScrollPane(tabla);
		scroll.setPreferredSize(new Dimension(150,100));
		
		lNombre = new JLabel("Nombre");
		tNombre = new JTextField(10);
		
		btnGuardar = new JButton("Guargar");
		btnCancelar = new JButton("Cancelar");
				
		btnGuardar.addActionListener(this);
		btnCancelar.addActionListener(this);
		
		super.setLayout( new GridBagLayout() );
		
		super.add(lNombre , new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,10,2,5) , 1,1) );
		super.add(tNombre , new GridBagConstraints(0,1,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,2,5 ) ,1,1) );
		
		super.add(btnGuardar , new GridBagConstraints(0,2,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,2,5) ,1,1) );
		super.add(btnCancelar , new GridBagConstraints(0,3,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,2,5) ,1,1) );
				
		super.add(scroll, new GridBagConstraints(1,0,2,4,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,10,2,10) ,1,1) );
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == btnGuardar){
			
			if( !tNombre.getText().equals("") && controlador.insert(tNombre.getText())  ){
				
				JOptionPane.showMessageDialog(this, "El Rol  "+tNombre.getText()+" ha sido creado exitosamente.","Registro Exitoso",JOptionPane.INFORMATION_MESSAGE);
				data.clear();
				data = adaptar(controlador.selectAll());
				tModel.setDataVector(data, titulo);
				tNombre.setText("");
			}
			
		}else if(e.getSource() == btnCancelar){	}
		
	}
	
	
	private Vector<Object> adaptar(Vector<Object> data){
		Vector<Object> retorno = new Vector<Object>();
		for(Object rol : data){
			retorno.add( new Rol(rol.toString()).toVector() );
		}
		return retorno;
	}
	
}
