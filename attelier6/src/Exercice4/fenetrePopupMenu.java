package Exercice4;

import java.awt.event.*; import javax.swing.*;
class fenetrePopupMenu extends JFrame implements ActionListener{
private JPopupMenu popupMenu; private JMenuItem itm1,itm2;
fenetrePopupMenu(){
setTitle("Exemple de Menu surgissant"); setSize(400,120);
/* creation menu surgissant Ville et ses items Rabat et Marrakech */
popupMenu = new JPopupMenu("Ville");
itm1 = new JMenuItem("Rabat"); itm2 = new JMenuItem("Marrakech");
popupMenu.add(itm1); popupMenu.add(itm2);
itm1.addActionListener(this); itm2.addActionListener(this);
addMouseListener(new MouseAdapter(){
public void mouseReleased(MouseEvent ev){
if (ev.isPopupTrigger())
popupMenu.show(ev.getComponent(), ev.getX(), ev.getY());}});}
public void actionPerformed(ActionEvent ev){
Object source = ev.getSource();
System.out.println("Action avec chaine de commande : "+
ev.getActionCommand());
if (source == itm1) System.out.println("*** Action sur Rabat ***");
if (source == itm2) System.out.println("*** Action sur Marrakech ***");}
public static void main(String args[]){
fenetrePopupMenu fen=new fenetrePopupMenu(); fen.setVisible(true);
}}

