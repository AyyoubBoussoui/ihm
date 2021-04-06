package continu;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Fenetre extends JFrame {
	// JFrame
	static JFrame f;
	// JButton
	static JButton b1, b2, b3, b4;
	// label pour afficher un texte
	static JLabel l;
	// classe main
	public static void main(String[] args){
	// crÿer un nouveau frame pour stocker le label et le bouton
	f = new JFrame("Panel en BorderLayout");
	// crÿer un label pour afficher un texte
	l = new JLabel("Label");
	// crÿer des nouveaux boutons
	b1 = new JButton("Bouton1");
	b2 = new JButton("Bouton2");
	b3 = new JButton("Bouton3");
	b4 = new JButton("Bouton4");
	// crÿer un panel pour ajouter boutons et un spÿcifique layout manager
	JPanel p = new JPanel(new BorderLayout());
	// add des boutons et un label au panel
	p.add(b1, BorderLayout.NORTH);
	p.add(b2, BorderLayout.SOUTH);
	p.add(b3, BorderLayout.EAST);
	p.add(b4, BorderLayout.WEST);
	p.add(l, BorderLayout.CENTER);
	// set le background du panel
	p.setBackground(Color.red);
	// add le panel au frame
	f.add(p);
	// set la taille du frame
	f.setSize(300, 300);
	f.show();
	}
	}