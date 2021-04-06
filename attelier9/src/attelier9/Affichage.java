package attelier9;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Affichage extends JPanel {
public Application app;
public Affichage(Application a){
this.app=a;
}
public void paintComponent(Graphics g){
super.paintComponent(g) ;
//message à afficher
g.drawString(app.getMessage(), 20, 20);
// couleur du forme
switch(app.getcolor()){
case "Bleu": g.setColor(Color.blue); break;
case "Vert": g.setColor(Color.green); break;
case "Rouge": g.setColor(Color.red);break;
}
//dimensions du triangle
int[] x ={160,160,70,160};
int[] y ={70,160,160,70};
//forme à afficher
switch(app.getforme()){
case "carree": g.drawRect(70, 70,100, 100); break;
case "traingle": g.drawPolygon(x, y, 3); break;
case "cercle": g.drawOval(70, 70,100,100);break;
case "Pentagon":g.drawPolygon(x, y, 6);break;
}
}
}