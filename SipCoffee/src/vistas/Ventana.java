package vistas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Ventana extends JFrame {
	
	public static JPanel panel;
	// Constructores
	public Ventana(){
		
		
		panel =new JPanel();
		
		try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {}
		
		super.setContentPane(panel);
		super.setTitle("SIPCOFFEE");
		super.setVisible(true);
		super.pack();
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	
	public Ventana(String title){
		
		panel =new JPanel();
		
		try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) { } 
		
		super.setContentPane(panel);
		super.setTitle(title);
		super.pack();
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


}
