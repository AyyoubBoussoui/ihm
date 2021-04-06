package attelier3.ex7.q2;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WithLambda {
public static void main(String[] args) {
JFrame frame = new JFrame("ActionListener with Java 8");
JButton b = new JButton("Click Here");
b.setBounds(50,100,80,50);
b.addActionListener(e -> System.out.println("Hello World!"));
frame.add(b);
frame.setSize(200,200);
frame.setLayout(null);
frame.setVisible(true);
}
}
