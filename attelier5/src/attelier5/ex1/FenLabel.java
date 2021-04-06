package attelier5.ex1;

import java.awt.*; import java.awt.event.*; import javax.swing.* ;
class FenLabel extends JFrame {
public FenLabel(){
setTitle("Essai Etiquettes"); setSize(300, 120) ;
Container contenu = getContentPane() ;
contenu.setLayout(new FlowLayout() ) ;
bouton = new JButton("Compteur") ;
bouton.addActionListener(e->{nbClics++; compte.setText("Nombre de clics sur Compteur = "+nbClics);});
contenu.add(bouton) ;
nbClics = 0 ;
compte = new JLabel("Nombre de clics sur Compteur = "+ nbClics);
contenu.add(compte);
JLabel label = new JLabel("<html><font color=red size=4><i>Ce label a <br>deux lignes</i><html>");
contenu.add(label);
}

/*
 * public void actionPerformed(ActionEvent e){ nbClics++;
 * compte.setText("Nombre de clics sur Compteur = "+nbClics); }
 */
private JButton bouton; private JLabel compte; private int nbClics;
public static void main (String args[]){
FenLabel fen = new FenLabel();
fen.setVisible(true);
}
}