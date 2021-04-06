//FlowLayout

package continu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MaFenetre extends JFrame implements ActionListener{
JButton reveButton; JButton foiButton; JButton implicationButton;
JButton butsButton; JButton actionButton;JLabel lab;
public MaFenetre() {
super("Cinq clØs de la rØussite");
setSize(348, 128); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
FlowLayout flo = new FlowLayout(); setLayout(flo);
lab=new JLabel("");
reveButton = new JButton("LE R˚VE");
foiButton = new JButton("LA FOI");
implicationButton = new JButton("L’IMPLICATION");
butsButton = new JButton("LES BUTS");
actionButton = new JButton("L’ACTION");
add(reveButton); add(foiButton); add(implicationButton); add(butsButton);
add(actionButton);add(lab);
reveButton.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==reveButton) lab.setText("LE RVE");
}
public static void main(String[] args) {
MaFenetre f=new MaFenetre();
f.setVisible(true);;
}

}