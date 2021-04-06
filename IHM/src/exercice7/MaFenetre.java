package exercice7;

import javax.swing.* ; // pour JFrame
public class MaFenetre extends JFrame{
JButton reveButton; JButton foiButton; JButton implicationButton;
JButton butsButton; JButton actionButton;
public MaFenetre () {// constructeur
super("Cinq clØs de la rØussite");
setSize(348, 128);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
reveButton = new JButton("LE R˚VE");
foiButton = new JButton("LA FOI");
implicationButton = new JButton("L’IMPLICATION");
butsButton = new JButton("LES BUTS");
actionButton = new JButton("L’ACTION");
JPanel pane = new JPanel();
BoxLayout box = new BoxLayout(pane, BoxLayout.Y_AXIS);
pane.setLayout(box); pane.add(reveButton); pane.add(foiButton);
pane.add(implicationButton); pane.add(butsButton); pane.add(actionButton);
add(pane);
pack();
}
public static void main(String[] args){
	new MaFenetre();
}
}