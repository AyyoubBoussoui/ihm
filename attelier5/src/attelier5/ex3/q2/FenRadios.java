package attelier5.ex3.q2;

import java.awt.*; import java.awt.event.*; import javax.swing.*;
class FenRadios extends JFrame {
FenRadios(){
setTitle("Exemple de boutons radio"); setSize(400, 100);
Container contenu = getContentPane();
contenu.setLayout(new FlowLayout());
ButtonGroup groupe = new ButtonGroup();
rad1 = new JRadioButton("Radio 1");
groupe.add(rad1); contenu.add(rad1); rad1.addItemListener(ev->{System.out.println("Changement radio 1") ;});
rad1.addActionListener(ev->{System.out.println("Action radio 1") ;}); rad1.setSelected(true);
rad2 = new JRadioButton("Radio 2"); groupe.add(rad2); contenu.add(rad2);
rad2.addItemListener(ev->{System.out.println("Changement radio 2") ;}); rad2.addActionListener(ev->{System.out.println("Action radio 2") ;});
rad3 = new JRadioButton("Radio 3"); groupe.add(rad3); contenu.add(rad3);
rad3.addItemListener(ev->{System.out.println("Changement radio 3") ;}); rad3.addActionListener(ev->{System.out.println("Action radio 3") ;});
etat = new JButton("État"); contenu.add(etat);
etat.addActionListener(ev->{System.out.println ("État RADIOS : " + rad1.isSelected() + " "
		+ rad2.isSelected() + " " + rad3.isSelected());});
}

/*
 * public void itemStateChanged(ItemEvent ev){ Object source = ev.getSource();
 * if (source == rad1) System.out.println("Changement radio 1") ; if (source ==
 * rad2) System.out.println("Changement radio 2") ; if (source == rad3)
 * System.out.println("Changement radio 3") ;} public void
 * actionPerformed(ActionEvent ev){ Object source = ev.getSource(); if (source
 * == etat) System.out.println ("État RADIOS : " + rad1.isSelected() + " " +
 * rad2.isSelected() + " " + rad3.isSelected()); if (source == rad1)
 * System.out.println("Action radio 1") ; if (source == rad2)
 * System.out.println("Action radio 2") ; if (source == rad3)
 * System.out.println("Action radio 3") ;}
 */
private JRadioButton rad1, rad2, rad3; private JButton etat;
public static void main (String args[]){
FenRadios fen = new FenRadios(); fen.setVisible(true);
}

}

