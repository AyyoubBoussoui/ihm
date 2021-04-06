package continu;
import javax.swing.JFrame;

import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Insets;
import java.awt.Dimension;
public class swingBoxLayoutAxis {
public static void main(String[] args) {
// Create and set up a frame window
JFrame.setDefaultLookAndFeelDecorated(true);
JFrame frame = new JFrame("Exemple BoxLayout manager X_AXIS");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Set the panel to add buttons
JPanel panel = new JPanel();
// Set the BoxLayout to be X_AXIS: from left to right
//BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);//(1)
// Set the Boxayout to be Y_AXIS from top to down
BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);//(2)
panel.setLayout(boxlayout);
// Set border for the panel
panel.setBorder(new EmptyBorder(new Insets(150, 200, 150, 200)));
//panel.setBorder(new EmptyBorder(new Insets(50, 80, 50, 80)));
// Define new buttons
JButton jb1 = new JButton("Bouton 1");
JButton jb2 = new JButton("Bouton 2");
JButton jb3 = new JButton("Bouton 3");
// Add buttons to the frame
panel.add(jb1);
panel.add(jb2);
panel.add(jb3);
//Set size for the frame
//frame.setSize(300, 300);
//Set the window to be visible as the default to be false
frame.add(panel);
frame.pack();
frame.setVisible(true);
}
}