package vistas;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Ventana extends JFrame {
	
	//Atributos
	
	public static JPanel panel;
	
	
	// Constructores
	public Ventana(){
		panel =new JPanel();
		
		try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			/*SynthLookAndFeel look = new SynthLookAndFeel();
			look.load(Ventana.class.getResourceAsStream("lookAndFeel.xml"),Ventana.class);
			UIManager.setLookAndFeel(look);*/
        } catch (Exception ex) { }
		
		super.setContentPane(panel);
		super.setTitle("SIPCOFFEE");
		super.setVisible(true);
		super.pack();
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setIconImage(new ImageIcon(getClass().getResource("img/grano.png")).getImage() );
		
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
