package attelier5.ex4;

import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.*;
public class TestJTextField{
JTextField tf1,tf2,tf3;
JButton b1,b2;
TestJTextField(){
JFrame f= new JFrame();
f.setTitle("calcul");
JLabel lb1=new JLabel("entrer un nombre entier:");
JLabel lb2=new JLabel("le resultat est:");
f.setLayout(new GridLayout(7,1));
tf1=new JTextField();
tf1.setBounds(50,50,150,20);
tf2=new JTextField();
tf2.setBounds(50,100,150,20);
tf3=new JTextField();
tf3.setBounds(50,150,150,20);
tf3.setEditable(false);
b1=new JButton("+");
b1.setBounds(50,200,50,50);
b2=new JButton("-");
b2.setBounds(120,200,50,50);
b1.addActionListener(e->{String s1=tf1.getText();
String s2=tf2.getText();
int a=Integer.parseInt(s1);
int b=Integer.parseInt(s2);
int c=0; c=a+b;String result=String.valueOf(c);
tf3.setText(result);});
b2.addActionListener(e->{String s1=tf1.getText();
String s2=tf2.getText();
int a=Integer.parseInt(s1);
int b=Integer.parseInt(s2);
int c=0; c=a-b;String result=String.valueOf(c);
tf3.setText(result);});
f.add(lb1);  f.add(tf1); f.add(lb1);f.add(tf2);f.add(lb2);f.add(tf3);f.add(b1);f.add(b2);
f.setSize(300,300);
f.setLayout(null);
f.setVisible(true);
}

/*
 * public void actionPerformed(ActionEvent e) { String s1=tf1.getText(); String
 * s2=tf2.getText(); int a=Integer.parseInt(s1); int b=Integer.parseInt(s2); int
 * c=0; if(e.getSource()==b1){ c=a+b; }else if(e.getSource()==b2){ c=a-b; }
 * String result=String.valueOf(c); tf3.setText(result); }
 */
public static void main(String[] args) {
new TestJTextField();
} }
