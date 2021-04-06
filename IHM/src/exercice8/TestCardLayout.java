package exercice8;

import java.awt.CardLayout; import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; import javax.swing.JButton;
import javax.swing.JFrame; import javax.swing.JPanel;
public class TestCardLayout extends JPanel implements ActionListener{
CardLayout card = new CardLayout(50, 50); // Crÿer le layout
public TestCardLayout() {
setLayout(card); JButton button;
for(int i = 1; i <= 6; i++) {
add(button = new JButton(" Appuyer " + i), "Card" + i);
button.addActionListener(this);
}
}
public void actionPerformed(ActionEvent e) {
card.next(this); }// Switch to the next card}
public static void main(String[] args) {
JFrame f = new JFrame(" Exemple CardLayout Manager ");
f.setBounds(30, 30, 300, 300);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.getContentPane().add(new TestCardLayout());
f.setVisible(true);
}
}