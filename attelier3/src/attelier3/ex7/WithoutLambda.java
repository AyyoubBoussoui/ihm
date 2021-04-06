package attelier3.ex7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class WithoutLambda {
public static void main(String[] args) {
JFrame frame = new JFrame("ActionListener Before Java 8");
JButton b = new JButton("Click Here");
b.setBounds(50,100,80,50);
b.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
System.out.println("Hello World!");
}
});
frame.add(b);
frame.setSize(200,200);
frame.setLayout(null);
frame.setVisible(true);
}}