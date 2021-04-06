package tp1;

import javax.swing.JFrame;

public class TestGraphics2D {
public static void main(String[] a) {
JFrame f = new JFrame();
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setBounds(30, 30, 300, 300);
f.getContentPane().add(new MyCanvas());
f.setVisible(true);
}
}
