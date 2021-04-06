package attelier9;

import javax.swing.* ;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
class Application extends JFrame implements ActionListener, ItemListener,
ListSelectionListener{
private JPanel contenu ;
private JRadioButton bouton1;
private JRadioButton bouton2;
private JRadioButton bouton3;
private JRadioButton bouton4;
private String m="carree";
private JComboBox selection;
private GridBagConstraints affichage;
private DefaultListModel listModel ;
private JList textes;
private String message="Salam tout le monde";
private JTextField text_ajout;
private JButton ajouter;
public String getMessage(){
return message;
}
public String getforme(){
return m;
}
public String getcolor(){
Object valeur = selection.getSelectedItem() ;
return ((String)valeur);
}
public Application (){
setTitle("Atelier: Application en Java Swing") ;
setSize (465,453) ;
contenu =new JPanel();
GridBagLayout g = new GridBagLayout() ;
contenu.setLayout (g) ;
//**********************
//GridBag Layout
//**********************
GridBagConstraints forme_label= new GridBagConstraints() ;
GridBagConstraints c_1= new GridBagConstraints() ;
GridBagConstraints c_2= new GridBagConstraints() ;
GridBagConstraints c_3= new GridBagConstraints() ;
GridBagConstraints c_4= new GridBagConstraints() ;
GridBagConstraints couleur_label= new GridBagConstraints() ;
GridBagConstraints couleur_sel= new GridBagConstraints() ;
affichage= new GridBagConstraints() ;
GridBagConstraints texte_select= new GridBagConstraints() ;
GridBagConstraints ajout_l= new GridBagConstraints() ;
GridBagConstraints ajout_field= new GridBagConstraints() ;
GridBagConstraints validation= new GridBagConstraints() ;
forme_label.fill = GridBagConstraints.BOTH ;
c_1.fill = GridBagConstraints.BOTH ;
c_2.fill = GridBagConstraints.BOTH ;
c_3.fill = GridBagConstraints.BOTH ;
c_4.fill = GridBagConstraints.BOTH ;
couleur_label.fill = GridBagConstraints.BOTH ;
couleur_sel.fill = GridBagConstraints.BOTH ;
affichage.fill = GridBagConstraints.BOTH ;
texte_select.fill = GridBagConstraints.BOTH ;
ajout_l.fill = GridBagConstraints.BOTH ;
ajout_field.fill = GridBagConstraints.BOTH ;
validation.fill = GridBagConstraints.BOTH ;
//check box
forme_label.gridx = 0 ;
forme_label.gridy = 0 ;
forme_label.gridwidth = 1;
forme_label.gridheight = 1 ;
forme_label.weightx = 10 ;
forme_label.weighty = 10 ;

c_1.gridx = 0;
c_1.gridy = 1 ;
c_1.gridwidth = 1 ;
c_1.gridheight =1 ;
c_1.weightx = 10 ;
c_1.weighty = 10 ;

c_2.gridx = 0 ;
c_2.gridy = 2 ;
c_2.gridwidth = 1 ;
c_2.gridheight =1 ;
c_2.weightx = 10 ;
c_2.weighty = 10 ;

c_3.gridx = 0 ;
c_3.gridy = 3 ;
c_3.gridwidth = 1 ;
c_3.gridheight =1 ;
c_3.weightx = 10 ;
c_3.weighty = 10 ;

c_4.gridx = 0 ;
c_4.gridy = 3 ;
c_4.gridwidth = 1 ;
c_4.gridheight =1 ;
c_4.weightx = 10 ;
c_4.weighty = 10 ;
//couleur
couleur_label.gridx = 0 ;
couleur_label.gridy = 4 ;
couleur_label.gridwidth = 1 ;
couleur_label.gridheight =1 ;
couleur_label.weightx = 10 ;
couleur_label.weighty = 10 ;
couleur_sel.gridx = 0 ;
couleur_sel.gridy = 5 ;
couleur_sel.gridwidth = 1 ;
couleur_sel.gridheight =1 ;
couleur_sel.weightx = 10 ;
couleur_sel.weighty = 10 ;
//affichage du resultat
affichage.gridx = 1 ;
affichage.gridy = 0 ;
affichage.gridwidth = 7 ;
affichage.gridheight =6 ;
affichage.weightx = 60 ;
affichage.weighty = 60 ;
//selection du texte
texte_select.gridx = 0 ;
texte_select.gridy = 6 ;
texte_select.gridwidth = 8 ;
texte_select.gridheight = 2 ;
texte_select.weightx = 80 ;
texte_select.weighty = 40 ;
//ajout du texte à la liste
ajout_l.gridx = 0 ;
ajout_l.gridy = 8 ;
ajout_l.gridwidth = 8 ;
ajout_l.gridheight = 1 ;
ajout_l.weightx = 80 ;
ajout_l.weighty = 10 ;
ajout_field.gridx = 0 ;
ajout_field.gridy = 9 ;
ajout_field.gridwidth = 8 ;
ajout_field.gridheight = 1 ;
ajout_field.weightx = 80 ;
ajout_field.weighty = 10 ;
//validation de l’ajout
validation.gridx = 0 ;
validation.gridy = 10 ;
validation.gridwidth = 8 ;
validation.gridheight = 1 ;
validation.weightx = 80 ;
validation.weighty = 10 ;
//affichage
Affichage affiche = new Affichage(this);
contenu.add(affiche,affichage);
affiche.setBackground(Color.white);
//forme
JLabel Forme_l = new JLabel("Forme");
contenu.add(Forme_l, forme_label);
ButtonGroup formes = new ButtonGroup() ;
bouton1 = new JRadioButton("Carre",true);
bouton2 = new JRadioButton("Cercle");
bouton3 = new JRadioButton("Triangle");
bouton4 = new JRadioButton("Pentagon");
bouton1.addActionListener(e->{Object source = e.getSource() ;
if (source == bouton1){ m="carree"; repaint();}});
bouton2.addActionListener(this);
bouton3.addActionListener(this);
bouton4.addActionListener(this);
formes.add(bouton1);
formes.add(bouton2);
formes.add(bouton3);
formes.add(bouton4);
contenu.add(bouton1, c_1);
contenu.add(bouton2, c_2);
contenu.add(bouton3, c_3);
contenu.add(bouton4, c_4);
//couleur
JPanel pann = new JPanel();
String[] couleurs = {"Bleu","Vert","Rouge"};
JLabel couleur_l = new JLabel("Couleur");
selection = new JComboBox(couleurs);
selection.addActionListener(this);
selection.addItemListener(this);
contenu.add(couleur_l, couleur_label);
pann.add(selection);
contenu.add(pann, couleur_sel);
//Liste
JPanel pan = new JPanel();
listModel = new DefaultListModel();
listModel.addElement("Salam SIR FSTG 2020");
listModel.addElement("Good new Year 2020");
listModel.addElement("Good luck in Exams");
listModel.addElement("Changez la couleur");
textes = new JList(listModel) ;
JScrollPane scroll= new JScrollPane(textes);
textes.addListSelectionListener(this) ;
BoxLayout box = new BoxLayout(pan, BoxLayout.Y_AXIS); pan.setLayout(box);
pan.add(scroll);
contenu.add(pan, texte_select);
//texte a ajouter
JPanel pan_texte = new JPanel();
JLabel texte_label = new JLabel("Ajouter un texte possible:");
contenu.add(texte_label, ajout_l);
text_ajout = new JTextField(40) ;
pan_texte.add(text_ajout);
contenu.add(pan_texte, ajout_field);
//validation
JPanel pannel = new JPanel();
ajouter = new JButton("Ajouter");
pannel.add(ajouter);
ajouter.addActionListener(this);
contenu.add(pannel, validation);
//autre
this.getContentPane().add(contenu);
}
@Override
public void actionPerformed(ActionEvent ev) {
Object source = ev.getSource() ;
//if (source == bouton1){ m="carree"; repaint();}
if (source == bouton2){ m="cercle"; repaint();}
if (source == bouton3){ m="traingle"; repaint();}
 if (source == bouton4){ m="pentagon"; repaint();} 
if(source == ajouter){
System.out.println(" hello");
String texte = text_ajout.getText();
listModel.addElement(texte); }
}
public void itemStateChanged(ItemEvent e){
repaint();
}
@Override
public void valueChanged(ListSelectionEvent e) {
if (!e.getValueIsAdjusting()){
Object valeur = textes.getSelectedValue();
System.out.println((String) valeur);
message=((String)valeur);
repaint();
}
}
//*****************************
//Main
//*****************************
public static void main (String args[]){
Application app = new Application() ;
app.setVisible(true) ;
}
}

