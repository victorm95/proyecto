package vistas.rol;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class CrearRol extends JPanel {

	//Componentes Graficos
	
	private JLabel lNombre;
	
	private JTextField tNombre;
	
	private JButton btnGuardar;
	private JButton btnCancelar;
	private JButton btnEliminar;
	
	private JList lista;
	
	private Vector<String> elemtLista;
	
	//Constructor
	public CrearRol(){
		
		elemtLista = new Vector<String>();
		elemtLista.add("Administrador");
		elemtLista.add("cosechador");
		elemtLista.add("sembrador");
		
		lNombre = new JLabel("Nombre");
		
		tNombre = new JTextField(10);
		

		lista = new JList(elemtLista);
		
		
		
		
		btnGuardar = new JButton("Guargar");
		btnGuardar.addActionListener( new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				if(! tNombre.getText().equals("")){
					elemtLista.add( tNombre.getText() );
					lista.updateUI();
					tNombre.setText("");
				}
			}
		});
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener( new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				tNombre.setText("");
			}
		});
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener( new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				if(!lista.isSelectionEmpty()){
					try{
						elemtLista.remove( lista.getSelectedIndex() ); 
						lista.updateUI();
						lista.clearSelection();
					}catch(Exception ex){
					}finally{
						tNombre.setText("");
					}
				}
			}
		});
				
		
		super.setLayout( new GridBagLayout() );
		
		super.add(lNombre , new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,10,2,5) , 1,1) );
		super.add(tNombre , new GridBagConstraints(0,1,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,2,5 ) ,1,1) );
		
		super.add(btnGuardar , new GridBagConstraints(0,2,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,2,5) ,1,1) );
		super.add(btnCancelar , new GridBagConstraints(0,3,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,2,5) ,1,1) );
		super.add(btnEliminar , new GridBagConstraints(0,4,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,10,2) ,1,1) );
		
		super.add(lista , new GridBagConstraints(1,0,2,4,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,10,2,10) ,1,1) );
		
	}
	
}
