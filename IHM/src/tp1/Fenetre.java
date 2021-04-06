package tp1;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame{
	public Fenetre(){
		this.setTitle("My first window");
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		//Instanciation díun objet JPanel
		JPanel pan = new JPanel();
		//Dÿfinition de sa couleur de fond
		pan.setBackground(Color.ORANGE); // vous pouvez choisir une autre couleur
		//On prÿvient notre JFrame que notre JPanel sera son ContentPane
		this.setContentPane(pan); //ou getContentPane().add(pan) ;
		this.setVisible(true);
		}
	public static void main(String args[]) {
		new Fenetre();
	}
}
