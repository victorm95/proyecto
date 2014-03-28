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
import vistas.rol.AdminRol;
import vistas.siembra.CrearSiembra;
import vistas.terreno.AdminTerreno;
import vistas.terreno.EditarTerreno;

public class Menu extends JMenuBar implements ActionListener {

	// Componentes Graficos
	Ventana ventana;
	
	//Menu Terreno
	private JMenu terreno;
	private JMenuItem adminTerreno;
	
	//Menu Bloque
	private JMenu bloque;
	private JMenuItem adminBloque;
	
	//Menu Parcela
	private JMenu parcela;
	private JMenuItem adminParcela;
	
	//Menu Siembra
	private JMenu siembra;
	private JMenuItem adminSiembra;
	
	//Menu Cosecha
	private JMenu cosecha;
	private JMenuItem adminCosecha;
	
	//Menu Rol
	private JMenu rol;
	private JMenuItem adminRol;
	
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
		adminTerreno = new JMenuItem("Administrar");
		terreno.add(adminTerreno);
		
		//Menu de Bloque
		bloque = new JMenu("Bloque");
		adminBloque = new JMenuItem("Administrar");
		bloque.add(adminBloque);
		
		//Menu de Parcela
		parcela = new JMenu("Parcela");
		adminParcela = new JMenuItem("Administrar");
		parcela.add(adminParcela);
		
		//Menu de Parcela
		siembra = new JMenu("Siembra");
		adminSiembra = new JMenuItem("Administrar");
		siembra.add(adminSiembra);
		
		//Menu de Parcela
		cosecha = new JMenu("Cosecha");
		adminCosecha = new JMenuItem("Administrar");
		cosecha.add(adminCosecha);
		
		
		// Menu Rol
		rol = new JMenu("Rol");
		adminRol = new JMenuItem("Administrar");
		rol.add(adminRol);
		
		
		/*------------------------------------------- Eventos ---------------------------------------------*/
		
		//Menu Terreno
		adminTerreno.addActionListener(this);
		
		//Menu Bloque
		adminBloque.addActionListener(this);
		
		//Menu Parcela
		adminParcela.addActionListener(this);
		
		//Menu Siembra
		adminSiembra.addActionListener(this);
		
		//Menu Cosecha
		adminCosecha.addActionListener(this);
		
		//Menu Rol
		adminRol.addActionListener(this);
		
		
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
		dialogo.setTitle("Administrar");
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
		if(e.getSource() == adminTerreno){
			crearDialogo( new AdminTerreno() );
		}
		//Fin de Terreno
		
		
		//Validacion para Bloque
		if(e.getSource() == adminBloque){
			crearDialogo( new CrearBloque() );
		}
		//Fin de Bloque
		
		
		//Validacion para Parcela
		if(e.getSource() == adminParcela){
			crearDialogo( new CrearParcela() );
		}
		//Fin Parcela
		
		//alidacion para Siembra
		if(e.getSource() == adminSiembra){
			crearDialogo( new CrearSiembra() );
		}
		
		
		//Validacion para cosecha
		if(e.getSource() == adminCosecha){
			crearDialogo( new CrearCosecha() );
		}
		
		//Validacion para Rol
		if(e.getSource() == adminRol){
			crearDialogo( new AdminRol() );
		}
		

		//Validacion para Salir
		if(e.getSource() == salir ){
			System.exit(0);
		}
		
	}
	
}