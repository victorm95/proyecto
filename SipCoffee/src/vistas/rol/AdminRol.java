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
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import controladores.RolController;

public class AdminRol extends JPanel implements ActionListener {

	//Componentes Graficos
	
	private JLabel lNombre;
	
	private JTextField tNombre;
	
	private JButton btnGuardar;
	private JButton btnEliminar;
	private JButton btnCancelar;
	
	private JList lista;
	private Vector<String> data;
	private JScrollPane scroll;
	
	private RolController controlador;
	
	//Constructor
	public AdminRol(){
		controlador = new RolController();
		
		data = controlador.selectAll();
		lista = new JList( data );
		
		scroll = new JScrollPane(lista);
		scroll.setPreferredSize(new Dimension(100,90));
		
		lNombre = new JLabel("Nombre");
		tNombre = new JTextField(10);
		
		btnGuardar = new JButton("Guargar");
		btnEliminar = new JButton("Eliminar");
		btnCancelar = new JButton("Cancelar");
				
		btnGuardar.addActionListener(this);
		btnEliminar.addActionListener(this);
		btnCancelar.addActionListener(this);
		
		super.setLayout( new GridBagLayout() );
		
		super.add(lNombre , new GridBagConstraints(0,0,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,10,2,5) , 1,1) );
		super.add(tNombre , new GridBagConstraints(0,1,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,2,5 ) ,1,1) );
		
		super.add(btnGuardar , new GridBagConstraints(0,2,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,2,5) ,1,1) );
		super.add(btnEliminar , new GridBagConstraints(0,3,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(2,10,2,5) ,1,1) );
		super.add(btnCancelar , new GridBagConstraints(0,4,1,1,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL, new Insets(2,10,2,5) ,1,1) );		
		super.add(scroll, new GridBagConstraints(1,0,2,4,0,0,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(10,10,2,10) ,1,1) );
		
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
						"Rol Eliminado." ,
						JOptionPane.ERROR_MESSAGE
				);
			}
			
		}else if(e.getSource() == btnCancelar){	}
		
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
