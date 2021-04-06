package Exercice3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup; import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
public class TestJMenuItem2 implements ActionListener,ItemListener{
JMenu fichierMenu, editer, divers;
JMenuItem it1,it2; JRadioButtonMenuItem it3,it4;
JTextArea ta;
JCheckBoxMenuItem it5, it6;
TestJMenuItem2(){
JFrame f = new JFrame("Exemple d�items de menu");
JMenuBar mb = new JMenuBar();
// Cr�ation des menus
JMenu fichierMenu = new JMenu("Fichier");
//affecter le raccourci alt+F
fichierMenu.setMnemonic(KeyEvent.VK_F);
JMenu editer = new JMenu("Editer");
//affecter le raccourci alt+E
editer.setMnemonic(KeyEvent.VK_E);
JMenu divers = new JMenu("Divers");
//affecter le raccourci alt+D
divers.setMnemonic(KeyEvent.VK_D);
//Cr�ation des items de menu
it1 = new JMenuItem("Ouvrir",'O');
//affecter l�acc�l�rateur ctrl+r
it1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,
ActionEvent.CTRL_MASK));
it2 = new JMenuItem("Fermer",'F');
//Cr�ation des items boutons radio
it3 = new JRadioButtonMenuItem("Nouveau");
//s�lectionner une option par d�faut.
it3.setSelected(true);
// ou directement: it3 = new JRadioButtonMenuItem("Nouveau",true);
it4 = new JRadioButtonMenuItem("Imprimer");
ButtonGroup groupe = new ButtonGroup();
groupe.add(it3);groupe.add(it4);
//Cr�ation des items cases � cocher
it5 = new JCheckBoxMenuItem("Enregistrer");
//cocher une case par d�faut.
it5.setSelected(true);
//ou directement: it5 = new JCheckBoxMenuItem("Enregistrer",true);
it6 = new JCheckBoxMenuItem("Quitter");
fichierMenu.add(it1); fichierMenu.add(it2);
fichierMenu.addSeparator();
fichierMenu.add(it3); fichierMenu.add(it4);
fichierMenu.addSeparator();
fichierMenu.add(it5); fichierMenu.add(it6);
mb.add(fichierMenu); mb.add(editer); mb.add(divers);
it1.addActionListener(this);
it2.addActionListener(this);
it3.addActionListener(this);
it4.addActionListener(this);
it5.addActionListener(this);
it6.addActionListener(this);
ta=new JTextArea();
ta.setBounds(5,5,360,320);
f.add(ta);
f.setJMenuBar(mb); f.setSize(400,400); f.setLayout(null);
f.setVisible(true);
}
public static void main(String args[]){ new TestJMenuItem2();}
@Override
public void itemStateChanged(ItemEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	ta.setText("HI I'am "+ e.getActionCommand());
	
} }
