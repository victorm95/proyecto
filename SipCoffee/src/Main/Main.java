package Main;

import vistas.Ventana;
import vistas.menu.Menu;

public class Main {

	private static Ventana ventana;
	private static Menu menu;
	
	public static void main(String[] args) {
		ventana = new Ventana();
		menu = new Menu(ventana);
		
		ventana.setJMenuBar(menu);
		ventana.pack();
		ventana.setLocationRelativeTo(null);
	}

}
