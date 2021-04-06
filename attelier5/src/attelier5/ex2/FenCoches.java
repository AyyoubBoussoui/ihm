package attelier5.ex2;

import java.awt.*; import java.awt.event.*; import javax.swing.*;
class FenCoches extends JFrame{
public FenCoches(){
setTitle("Exemple de cases à cocher") ;
setSize(400, 100) ;
Container contenu = getContentPane() ;
contenu.setLayout(new FlowLayout()) ;
coche1 = new JCheckBox("case 1") ; contenu.add(coche1) ;
coche1.addActionListener(ev->{Object source = ev.getSource() ;
if (source == coche1) System.out.println ("Action case 1") ;
if (source == coche2) System.out.println ("Action case 2") ;
if (source == etat)
System.out.println ("État CASES : " + coche1.isSelected() + " "+coche2.isSelected());}) ;
coche2 = new JCheckBox("case 2") ; contenu.add(coche2) ;
coche2.addActionListener(ev->{Object source = ev.getSource() ;
if (source == coche1) System.out.println ("Action case 1") ;
if (source == coche2) System.out.println ("Action case 2") ;
if (source == etat)
System.out.println ("État CASES : " + coche1.isSelected() + " "+coche2.isSelected());}) ;
etat = new JButton("État") ; contenu.add(etat) ;
etat.addActionListener(ev->{Object source = ev.getSource() ;
if (source == coche1) System.out.println ("Action case 1") ;
if (source == coche2) System.out.println ("Action case 2") ;
if (source == etat)
System.out.println ("État CASES : " + coche1.isSelected() + " "+coche2.isSelected());}) ;}

/*
 * public void actionPerformed(ActionEvent ev){ Object source = ev.getSource() ;
 * if (source == coche1) System.out.println ("Action case 1") ; if (source ==
 * coche2) System.out.println ("Action case 2") ; if (source == etat)
 * System.out.println ("État CASES : " + coche1.isSelected() +
 * " "+coche2.isSelected()); }
 */
private JCheckBox coche1, coche2 ;
private JButton etat;
public static void main(String args[]){
FenCoches fen = new FenCoches() ;
fen.setVisible(true);
}

}


