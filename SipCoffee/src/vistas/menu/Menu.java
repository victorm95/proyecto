package vistas.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import vistas.Ventana;
import vistas.bloque.CrearBloque;
import vistas.cosecha.CrearCosecha;
import vistas.parcela.CrearParcela;
import vistas.rol.CrearRol;
import vistas.siembra.CrearSiembra;
import vistas.terreno.CrearTerreno;
import vistas.terreno.EditarTerreno;

public class Menu extends JMenuBar implements ActionListener {

	// Componentes Graficos
	Ventana ventana;
	
	//Menu Terreno
	private JMenu terreno;
	private JMenuItem crearTerreno;
	private JMenuItem modificarTerreno;
	private JMenuItem consultarTerreno;
	private JMenuItem eliminarTerreno;
	
	//Menu Bloque
	private JMenu bloque;
	private JMenuItem crearBloque;
	private JMenuItem modificarBloque;
	private JMenuItem consultarBloque;
	private JMenuItem eliminarBloque;
	
	//Menu Parcela
	private JMenu parcela;
	private JMenuItem crearParcela;
	private JMenuItem modificarParcela;
	private JMenuItem consultarParcela;
	private JMenuItem eliminarParcela;
	
	//Menu Siembra
	private JMenu siembra;
	private JMenuItem crearSiembra;
	private JMenuItem modificarSiembra;
	private JMenuItem consultarSiembra;
	private JMenuItem eliminarSiembra;
	
	//Menu Cosecha
	private JMenu cosecha;
	private JMenuItem crearCosecha;
	private JMenuItem modificarCosecha;
	private JMenuItem consultarCosecha;
	private JMenuItem eliminarCosecha;
	
	//Menu Rol
	private JMenu rol;
	private JMenuItem crearRol;
	private JMenuItem modificarRol;
	private JMenuItem eliminarRol;
	
	private JMenu archivo;
	private JMenuItem salir;	
	
	private JDialog dialogo;
	
	// Constructor
	public Menu(Ventana ventana){
		
		this.ventana = ventana;
		
		archivo = new JMenu("Archivo");
		salir = new JMenuItem("Salir");
		
		

		//Menu de Terreno
		terreno = new JMenu("Terreno");
		crearTerreno = new JMenuItem("Crear");
		modificarTerreno = new JMenuItem("Modificar");
		consultarTerreno = new JMenuItem("Consultar");
		eliminarTerreno = new JMenuItem("Eliminar");
		terreno.add(crearTerreno);
		terreno.add(modificarTerreno);
		terreno.add(consultarTerreno);
		terreno.add(eliminarTerreno);
		
		//Menu de Bloque
		bloque = new JMenu("Bloque");
		crearBloque = new JMenuItem("Crear");
		modificarBloque = new JMenuItem("Modificar");
		consultarBloque = new JMenuItem("Consultar");
		eliminarBloque = new JMenuItem("Eliminar");
		bloque.add(crearBloque);
		bloque.add(modificarBloque);
		bloque.add(consultarBloque);
		bloque.add(eliminarBloque);
		
		//Menu de Parcela
		parcela = new JMenu("Parcela");
		crearParcela = new JMenuItem("Crear");
		modificarParcela = new JMenuItem("Modificar");
		consultarParcela = new JMenuItem("Consultar");
		eliminarParcela = new JMenuItem("Eliminar");
		parcela.add(crearParcela);
		parcela.add(modificarParcela);
		parcela.add(consultarParcela);
		parcela.add(eliminarParcela);
		
		//Menu de Parcela
		siembra = new JMenu("Siembra");
		crearSiembra = new JMenuItem("Crear");
		modificarSiembra = new JMenuItem("Modificar");
		consultarSiembra = new JMenuItem("Consultar");
		eliminarSiembra = new JMenuItem("Eliminar");
		siembra.add(crearSiembra);
		siembra.add(modificarSiembra);
		siembra.add(consultarSiembra);
		siembra.add(eliminarSiembra);
		
		//Menu de Parcela
		cosecha = new JMenu("Cosecha");
		crearCosecha = new JMenuItem("Crear");
		modificarCosecha = new JMenuItem("Modificar");
		consultarCosecha = new JMenuItem("Consultar");
		eliminarCosecha = new JMenuItem("Eliminar");
		cosecha.add(crearCosecha);
		cosecha.add(modificarCosecha);
		cosecha.add(consultarCosecha);
		cosecha.add(eliminarCosecha);
		
		
		// Menu Rol
		rol = new JMenu("Rol");
		crearRol = new JMenuItem("Crear");
		modificarRol = new JMenuItem("Modificar");
		eliminarRol = new JMenuItem("Eliminar");
		rol.add(crearRol);
		rol.add(modificarRol);
		rol.add(eliminarRol);
		
		
		
		/*------------------------------------------- Eventos ---------------------------------------------*/
		
		//Menu Terreno
		crearTerreno.addActionListener(this);
		modificarTerreno.addActionListener(this);
		consultarTerreno.addActionListener(this);
		eliminarTerreno.addActionListener(this);
		
		//Menu Bloque
		crearBloque.addActionListener(this);
		modificarBloque.addActionListener(this);
		consultarBloque.addActionListener(this);
		eliminarBloque.addActionListener(this);
		
		//Menu Parcela
		crearParcela.addActionListener(this);
		modificarParcela.addActionListener(this);
		consultarParcela.addActionListener(this);
		eliminarParcela.addActionListener(this);
		
		//Menu Siembra
		crearSiembra.addActionListener(this);
		modificarSiembra.addActionListener(this);
		consultarSiembra.addActionListener(this);
		eliminarSiembra.addActionListener(this);
		
		//Menu Cosecha
		crearCosecha.addActionListener(this);
		modificarCosecha.addActionListener(this);
		consultarCosecha.addActionListener(this);
		eliminarCosecha.addActionListener(this);
		
		//Menu Rol
		crearRol.addActionListener(this);
		
		
		salir.addActionListener(this);

		
		
		archivo.add(salir);
		
		super.add(archivo);
		super.add(terreno);
		super.add(bloque);
		super.add(parcela);
		super.add(siembra);
		super.add(cosecha);
		super.add(rol);
		
	}//Fin Constructor
	
	
	//Metodo para generar los Dialogos
	private void crearDialogo(JPanel panel){
		dialogo = null;
		dialogo = new JDialog(ventana,true);
		dialogo.setContentPane( panel );
		dialogo.setTitle("Crear Terreno");
		dialogo.setResizable(false);
		dialogo.pack();
		dialogo.setLocationRelativeTo(ventana);
		dialogo.setVisible(true);
		dialogo.dispose();
	}
	//Fin crearDialogo()
		
	
	/*----------------------------------Eventos-------------------------------------*/
	
	@Override
	public void actionPerformed(ActionEvent e){
		
		//Validacion para Terreno
		if(e.getSource() == crearTerreno){
			crearDialogo( new CrearTerreno() );
		}else if(e.getSource() == modificarTerreno){
			crearDialogo( new EditarTerreno() );
		}
		//Fin de Terreno
		
		
		//Validacion para Bloque
		if(e.getSource() == crearBloque){
			crearDialogo( new CrearBloque() );
		}
		//Fin de Bloque
		
		
		//Validacion para Parcela
		if(e.getSource() == crearParcela){
			crearDialogo( new CrearParcela() );
		}
		//Fin Parcela
		
		//alidacion para Siembra
		if(e.getSource() == crearSiembra){
			crearDialogo( new CrearSiembra() );
		}
		
		
		//Validacion para cosecha
		if(e.getSource() == crearCosecha){
			crearDialogo( new CrearCosecha() );
		}
		
		//Validacion para Rol
		if(e.getSource() == crearRol){
			crearDialogo( new CrearRol() );
		}
		

		
		//Validacion para Salir
		if(e.getSource() == salir ){
			System.exit(0);
		}
		
	}
	
}
