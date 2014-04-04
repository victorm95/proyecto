package vistas.rol;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;

import controladores.RolController;

public class AdminRol extends JPanel implements ActionListener {

	//Componentes Graficos
	
	private JLabel lNombre;
	
	private JTextField tNombre;
	
	private JButton btnGuardar;
	private JButton btnEliminar;
	private JButton btnEditar;
	
	private JList lista;
	private Vector<String> data;
	private JScrollPane scroll;
	
	private JPanel pNuevo;
	private JPanel pComponentes;
	
	private RolController controlador;
	
	//Constructor
	public AdminRol(){
		controlador = new RolController();
		
		pNuevo = new JPanel(new GridBagLayout());
		pNuevo.setBorder( BorderFactory.createTitledBorder("Nuevo Rol") );
		
		pComponentes = new JPanel(new GridBagLayout());
		pComponentes.setBorder( BorderFactory.createLineBorder( Color.GRAY) );
		
		data = controlador.selectAll();
		lista = new JList( data );
	
		
		scroll = new JScrollPane(lista);
		scroll.setPreferredSize(new Dimension(150,250));
		
		lNombre = new JLabel("Nombre");
		tNombre = new JTextField(10);
		
		btnGuardar = new JButton("Guargar");
		btnEliminar = new JButton("Eliminar");
		btnEditar = new JButton("Editar");
		
		btnGuardar.setIcon( new ImageIcon(getClass().getResource("../img/guardar.png")) );
		btnEditar.setIcon( new ImageIcon(getClass().getResource("../img/editar.png")) );
		btnEliminar.setIcon( new ImageIcon(getClass().getResource("../img/eliminar.png")) );
				
		btnGuardar.addActionListener(this);
		btnEliminar.addActionListener(this);
		btnEditar.addActionListener(this);
		
		super.setLayout( new GridBagLayout() );
		
		pNuevo.add(lNombre,new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,10,10,10) ,1,1) );
		pNuevo.add(tNombre,new GridBagConstraints(0,1,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(4,4,4,4) ,1,1) );
		pNuevo.add(btnGuardar,new GridBagConstraints(0,2,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(4,4,4,4) ,1,1) );
		
		pComponentes.add(btnEditar,new GridBagConstraints(0,2,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(20,20,5,20) ,1,1) );
		pComponentes.add(btnEliminar,new GridBagConstraints(0,3,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(5,20,20,20) ,1,1) );
		
		pComponentes.add(pNuevo,new GridBagConstraints(0,0,1,2,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(15,15,7,10) ,1,1) );
		super.add(pComponentes, new GridBagConstraints(0,0,1,5,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(40,40,40,30) ,1,1) );
		
		//super.add(btnEditar , new GridBagConstraints(0,3,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,2,5) ,1,1) );
		//super.add(btnEliminar , new GridBagConstraints(0,4,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL, new Insets(2,10,10,5) ,1,1) );
		
		super.add(scroll, new GridBagConstraints(1,0,2,5,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(30,20,30,30) ,1,1) );
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == btnGuardar){
			
			if( !tNombre.getText().equals("") && controlador.insert(tNombre.getText())  ){
				
				JOptionPane.showMessageDialog(this, "El Rol  "+tNombre.getText()+" ha sido creado exitosamente.","Registro Exitoso",JOptionPane.INFORMATION_MESSAGE);
				data.add( tNombre.getText() );
				lista.updateUI();
				tNombre.setText("");
			}
			
		}else if(e.getSource() == btnEliminar){
			
			if( !lista.isSelectionEmpty() && controlador.delete(data.get(lista.getSelectedIndex())) ){
				JOptionPane.showMessageDialog(this,
						"El Rol " + data.get(lista.getSelectedIndex()) + " ha sido eliminado correctamente." ,
						"Rol Eliminado." ,
						JOptionPane.INFORMATION_MESSAGE
				);
				data.remove( lista.getSelectedIndex() );
				lista.updateUI();
				lista.clearSelection();
				
			}else{
				JOptionPane.showMessageDialog(this,
						"Ocurrio un error al eliminar el Rol " + data.get(lista.getSelectedIndex()) + "." ,
						"Error al eliminar el Rol" ,
						JOptionPane.ERROR_MESSAGE
				);
			}
			
		}else if(e.getSource() == btnEditar){
			
			if( !lista.isSelectionEmpty() ){
				
				String nuevo = JOptionPane.showInputDialog(this,"Ingrese el nuevo valor para " + data.get(lista.getSelectedIndex()) , data.get(lista.getSelectedIndex()) );
				
				if( controlador.update( data.get(lista.getSelectedIndex()) , nuevo) ){
					JOptionPane.showMessageDialog(
							this , 
							"El Rol " + data.get(lista.getSelectedIndex()) + " ha sido actualizado a " + nuevo + "." ,
							"Rol Editado exitosamente" ,
							JOptionPane.INFORMATION_MESSAGE
					);
					
					data.set(lista.getSelectedIndex(), nuevo);
					lista.updateUI();
					
				}else{
					JOptionPane.showMessageDialog(
							this , 
							"Ocurrio un error al actualizar el Rol " + data.get(lista.getSelectedIndex()) ,
							"Rol Editado exitosamente" ,
							JOptionPane.ERROR_MESSAGE
					);
				}
				
			}
			
		}
	}
	
	
	private Vector<Object> adaptar(Vector<Object> data){
		Vector<Object> retorno = new Vector<Object>();
		Vector<Object> temp;
		for(Object rol : data){
			temp = new Vector<Object>();
			temp.add( rol.toString() );
			retorno.add(temp);
			temp = null;
		}
		return retorno;
	}
	
	//Clase Privada
	private class MyTableModel extends AbstractTableModel {
		
		private Vector<String> columnNames;
		private Vector<Object> data;
		
		//Constructor
		private MyTableModel(Vector<String> columnNames,Vector<Object> data){
			this.columnNames = columnNames;
			this.data = data;
		}

		public int getColumnCount() {
            return this.columnNames.size();
        }
 
        public int getRowCount() {
            return data.size();
        }
 
        public String getColumnName(int col) {
            return columnNames.get(col);
        }
 
        public Object getValueAt(int row, int col) {
        	Vector<Object> temp = (Vector<Object>) data.get(row);
            return temp.get(col);
        }
        
        public Class getColumnClass(int c) {
            return getValueAt(0, c).getClass();
        }
        
        public boolean isCellEditable(int row, int col) {
            if (col == 0) {
                return false;
            } else {
                return true;
            }
        }
 
        public void setValueAt(Object value, int row, int col) {
            Vector<Object> temp = new Vector<Object>();
            temp.add(value);
            data.add(temp);
            temp = null;
            fireTableCellUpdated(row, col);
        }
        
	}
	
}
