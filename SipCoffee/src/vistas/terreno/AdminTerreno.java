package vistas.terreno;

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

import controladores.TerrenoController;

public class AdminTerreno extends JPanel implements ActionListener{
	
	//Componentes Graficos
	private JLabel lNombre;
	private JLabel lMunicipio;
	private JLabel lDireccion;
	private JLabel lArea;
	//private JLabel lImagenFinca;
	
	private JTextField tNombre;
	private JTextField tMunicipio;
	private JTextField tDireccion;
	private JTextField tArea;
	
	private JTable tabla;
	private Vector<String> titulo;
	private Vector<Object> data;
	//private String path;
	
	public JButton btnGuardar;
	public JButton btnCancelar;
	//public JButton btnExaminar;
	
	private JScrollPane scroll;
	
	private TerrenoController controlador;
	
	
	// Constructor
	public AdminTerreno(){
			
		controlador = new TerrenoController();
		
		titulo = new Vector<String>();
		titulo.add("Municipio");
		titulo.add("Nombre");
		titulo.add("Direccion");
		titulo.add("Area");
		
		tabla = new JTable(data,titulo);
		scroll = new JScrollPane(tabla);
		scroll.setPreferredSize(new Dimension(400,120));
		
		lNombre = new JLabel("Nombre ");
		tNombre = new JTextField (10);
		
		lMunicipio = new JLabel ("Municipio ");
		tMunicipio = new JTextField (10);
		
		lDireccion = new JLabel ("Direccion ");
		tDireccion = new JTextField (10);
		
		lArea = new JLabel ("Area ");
		tArea = new JTextField (10);
		
		//lImagenFinca=new JLabel("Imagen");
		//btnExaminar=new JButton("Examinar");
		
		btnGuardar = new JButton ("Guardar");
		btnCancelar = new JButton ("Cancelar");	
		
		//path=new String();
		
		super.setLayout(new GridBagLayout());
		
		super.add (lNombre, new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,10,2,2) ,1,1) );
		super.add (tNombre, new GridBagConstraints(1,0,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,2,2,10) ,1,1) );
		
		super.add (lMunicipio, new GridBagConstraints(0,1,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,2,2) ,1,1) );
		super.add (tMunicipio, new GridBagConstraints(1,1,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,2,2,10) ,1,1) );
		
		super.add (lArea, new GridBagConstraints(0,2,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,2,2) ,1,1) );
		super.add (tArea, new GridBagConstraints(1,2,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,2,2,10) ,1,1) );
				
		super.add (lDireccion, new GridBagConstraints(0,3,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,2,2) ,1,1) );
		super.add (tDireccion, new GridBagConstraints(1,3,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,2,2,10) ,1,1) );

		//super.add(lImagenFinca,new GridBagConstraints(0,4,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,2,2),1,1) );
		//super.add(btnExaminar,new GridBagConstraints(1,4,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,2,2,10),1,1) );
		
		super.add (btnGuardar, new GridBagConstraints(0,4,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,2,2) ,1,1) );
		super.add (btnCancelar, new GridBagConstraints(1,4,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,2,2,10) ,1,1) );
		
		super.add(scroll,new GridBagConstraints(3,0,2,6,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,2,10,10) ,1,1) );
		
		btnGuardar.addActionListener(this);
		//btnExaminar.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==btnGuardar){
			
			if( !tNombre.getText().equals("") && !tMunicipio.getText().equals("") && !tArea.getText().equals("") && !tDireccion.getText().equals("") && controlador.insert(tMunicipio.getText(),tNombre.getText(),Integer.parseInt(tArea.getText()),tDireccion.getText())){
				
				JOptionPane.showMessageDialog(this, "El Terreno  "+tNombre.getText()+" ha sido creado exitosamente.","Registro Exitoso",JOptionPane.INFORMATION_MESSAGE);

			}else{
				
				JOptionPane.showMessageDialog(this, "No se pudo registrar, porfavor verifique los datos.","Registro Fallido",JOptionPane.INFORMATION_MESSAGE);
				
			}
			
		}
		
		/*if(e.getSource()==btnExaminar){
			
			JFileChooser file=new JFileChooser();
			int opcion=file.showOpenDialog(new JButton("Abrir"));
			
			if(opcion==JFileChooser.APPROVE_OPTION){
				
				path=file.getSelectedFile().getAbsolutePath();
				
				//Ventana.panel.add(new JLabel(new ImageIcon(path)));
				paintComponents(Ventana.panel.getGraphics());
				
			}

		}*/
		
	}
	/*
	@Override
	public void paintComponents(Graphics g){
		
		Dimension tamano=getSize();
		ImageIcon fondo=new ImageIcon(path);
		g.drawImage(fondo.getImage(), 0, 0, null);
		Ventana.panel.paintComponents(g);
		
	}*/
}
