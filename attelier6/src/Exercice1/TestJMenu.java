package Exercice1;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;
public class TestJMenu{
JMenu menu, editer, divers;
JMenuItem it1,it2, it3, sousMenu, it4, it5;
JTextArea ta; //(1)
TestJMenu(){
JFrame f = new JFrame("Menu des langages");
JMenuBar mb = new JMenuBar();
//CrØation des menus
/* menu = new JMenu(); menu.setText("Langages"); */
// ou directement:
menu = new JMenu("Langages");
//affecter le raccourci alt+L
menu.setMnemonic(KeyEvent.VK_L);//ou tt simplement: menu.setMnemonic(’L’);
editer = new JMenu("Editer");
divers = new JMenu("Divers");
sousMenu = new JMenu("Java");
//CrØer les items de menu
it1 = new JMenuItem("Python");//affecter le raccourci alt+P
//affecter l’accØlØrateur ctrl+P
it1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,
ActionEvent.CTRL_MASK));
it2 = new JMenuItem("R");//affecter le raccourci alt+R
it3 = new JMenuItem("Scala"); //affecter le raccourci alt+S
it4 = new JMenuItem("Java Swing");
it5 = new JMenuItem("JavaFX");
menu.add(it1);
menu.add(it2);
menu.addSeparator(); //ou: menu.insertSeparator(2);
menu.add(it3);
sousMenu.add(it4);
sousMenu.add(it5);
menu.add(sousMenu);
mb.add(menu); mb.add(editer); mb.add(divers);
f.setJMenuBar(mb);

ta=new JTextArea();
ta.setBounds(5,5,360,320);
f.add(ta);
it1.addActionListener(e->{
ta.setText("Langage de programmation "+e.getActionCommand());
// ou it1.getText()
});
it2.addActionListener(e->{
ta.setText("Langage de programmation "+e.getActionCommand());
// ou it1.getText()
});
it3.addActionListener(e->{
ta.setText("Langage de programmation "+e.getActionCommand());
// ou it1.getText()
});
it4.addActionListener(e->{
ta.setText("Langage de programmation "+e.getActionCommand());
// ou it1.getText()
});
it5.addActionListener(e->{
ta.setText("Langage de programmation "+e.getActionCommand());
// ou it1.getText()
});

//(1)
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String args[])
{
new TestJMenu();
}
}