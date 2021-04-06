package exercice7;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class Fenetre extends JFrame {
// JFrame
static JFrame f;
// JButton
static JButton b1, b2, b3, b4;
// label pour afficher un texte
static JLabel l;
// classe main
public static void main(String[] args){
// crÿer un nouveau frame pour stocker le label et le bouton
f = new JFrame("Panel");
// crÿer un label pour afficher un texte
l = new JLabel("Label");
// crÿer des nouveaux boutons
b1 = new JButton("Bouton 1");
b2 = new JButton("Bouton 2");
b3 = new JButton("Bouton 3");
b4 = new JButton("Bouton 4");
// crÿer un panel pour ajouter des boutons, label et un layout manager
JPanel p = new JPanel();
//set le BoxLayout
p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
//add les boutons et le label au panel
p.add(b1);
p.add(b2);
p.add(b3);
p.add(b4);
p.add(l);
//set le background du panel
p.setBackground(Color.red);
//add le panel au frame
f.add(p);
//set la taille du frame
f.setSize(300, 300);
f.show();
}
}
