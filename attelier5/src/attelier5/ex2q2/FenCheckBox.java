package attelier5.ex2q2;

import java.awt.* ;
import java.awt.event.* ;
import javax.swing.* ;
class FenCheckBox extends JFrame {
public FenCheckBox(){
setTitle("Exemple de cases ‡ cocher") ;
setSize(600, 300) ;
Container contenu = getContentPane() ;
contenu.setLayout (new FlowLayout()) ;
coche1 = new JCheckBox("case 1") ; contenu.add(coche1) ;
coche2 = new JCheckBox("case 2") ; contenu.add(coche2) ;
coche1.addItemListener(e->{if (e.getSource() == coche1) {
	if (e.getStateChange() == 1)
		lbl1.setText("case 1 cochÿe");
		else
		lbl1.setText("case 1 níest pas cochÿe");
		}});
coche2.addItemListener(e->{ 
	if (e.getStateChange() == 1)
		lbl2.setText("case 2 cochÿe");
		else
		lbl2.setText("case 2 níest pas cochÿe");
		});
// labels
lbl1 = new JLabel("case 1 níest pas cochÿe");
lbl2 = new JLabel("case 2 níest pas cochÿe");
lbl1.setForeground(Color.red);
lbl2.setForeground(Color.blue);
contenu.add(lbl1);contenu.add(lbl2);
};

/*
 * public void itemStateChanged(ItemEvent e) { // if the state of checkbox1 is
 * changed if (e.getSource() == coche1) { if (e.getStateChange() == 1)
 * lbl1.setText("case 1 cochÿe"); else lbl1.setText("case 1 níest pas cochÿe");
 * } // if the state of checkbox2 is changed else { if (e.getStateChange() == 1)
 * lbl2.setText("case 2 cochÿe"); else lbl2.setText("case 2 níest pas cochÿe");
 * } }
 */
JCheckBox coche1, coche2;
JLabel lbl1, lbl2;

public static void main (String args[]){
FenCheckBox fen = new FenCheckBox();
fen.setVisible(true);
}
}

