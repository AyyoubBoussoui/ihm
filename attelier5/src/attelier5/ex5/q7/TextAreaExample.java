package attelier5.ex5.q7;
import javax.swing.*;
import java.awt.event.*;
public class TextAreaExample implements ActionListener{
JLabel l1,l2;
JTextArea area;
JButton b;
TextAreaExample(){
JFrame f= new JFrame();
l1=new JLabel();
l1.setBounds(50,25,100,30);
l2=new JLabel();
l2.setBounds(160,25,100,30);
//area=new JTextArea("Ecrivez ici");//(1)
 area=new JTextArea(30,30);
area.setToolTipText("InsØrez un texte");///(2)
/*
// zone de texte multiligne en utilisant les balises HTML
String s1 = "<html> ceci est une zone de texte multiligne <br>
veuillez y ajouter du texte <br> il a 30 lignes <br>
il a 30 colonnes </html>";
// dØfinir le texte de l’info-bulle
area.setToolTipText(s1);
*/
area.setBounds(20,75,250,200);
b=new JButton("Compter les mots");
b.setBounds(100,300,200,30);
b.addActionListener(this);
f.add(l1);f.add(l2);f.add(area);f.add(b);
f.setSize(450,450);
f.setLayout(null);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e){
String text=area.getText();
String words[]=text.split("\\s");
l1.setText("Mots: "+words.length);
l2.setText("CaractŁres: "+text.length());
}
public static void main(String[] args) {
new TextAreaExample();
}
}