package attelier5.ex5.q4;

import java.awt.*; import java.awt.event.*; import javax.swing.* ;
import javax.swing.event.* ; // utile pour DocumentListener ....
class FenText extends JFrame implements DocumentListener,CaretListener,KeyListener{
public FenText(){
setTitle("Miroir d’un texte");
setSize(300, 110) ;
Container contenu = getContentPane() ;
contenu.setLayout(new FlowLayout() ) ;
saisie = new JTextField(20); contenu.add(saisie);
saisie.getDocument().addDocumentListener(this) ;
saisie.addCaretListener(this);
saisie.addKeyListener(this);
copie = new JTextField(20) ; copie.setEditable(false);
copie.setBackground(Color.gray); contenu.add(copie);}
public void insertUpdate(DocumentEvent e){
String texte = saisie.getText();
copie.setText(texte);
}
public void removeUpdate(DocumentEvent e){
String texte = saisie.getText();
copie.setText(texte);
}
public void changedUpdate(DocumentEvent e)
{}
private JTextField saisie, copie; private JButton bouton;
public static void main(String args[]){
FenText fen = new FenText();
fen.setVisible(true);

}
@Override
public void caretUpdate(CaretEvent e) {
	// TODO Auto-generated method stub
	System.out.println("caret update");
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("key typed");
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("key pressed");
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("key relesed");
}
}


