package tp1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
class MyCanvas extends JComponent {
public void paint(Graphics g) {
g.setColor(Color.orange);
g.drawArc(10, 20, 200, 200, 0, 135);
 g.fillArc(10, 20, 200, 200, 45, 270);
}
}
