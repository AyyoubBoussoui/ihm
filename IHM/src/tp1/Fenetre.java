package tp1;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame{
	public Fenetre(){
		this.setTitle("My first window");
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		//Instanciation d�un objet JPanel
		JPanel pan = new JPanel();
		//D�finition de sa couleur de fond
		pan.setBackground(Color.ORANGE); // vous pouvez choisir une autre couleur
		//On pr�vient notre JFrame que notre JPanel sera son ContentPane
		this.setContentPane(pan); //ou getContentPane().add(pan) ;
		this.setVisible(true);
		}
	public static void main(String args[]) {
		new Fenetre();
	}
}
