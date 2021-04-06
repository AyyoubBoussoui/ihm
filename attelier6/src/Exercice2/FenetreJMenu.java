package Exercice2;

import java.awt.event.*;
import javax.swing.*;

class FenetreJMenu extends JFrame {
	public FenetreJMenu() {
		setTitle("Exemple díitems de menu");
		setSize(400, 200);
		/* crÿation barre des menus */
		barreMenus = new JMenuBar();
		setJMenuBar(barreMenus);
		/* crÿation du menu Ville avec 2 items boutons radio: Rabat et Marrakech */
		ville = new JMenu("Ville");
		barreMenus.add(ville);
		rba = new JRadioButtonMenuItem("Rabat");
		ville.add(rba);
		rba.addActionListener(e -> {
			Object source = e.getSource();
			if (source == rba) System.out.println("** Action option Rabat **");
		});
		rba.addItemListener(e -> {
			Object source = e.getSource();
			if (source == rba) System.out.println("*** Item option Rabat ***");
			System.out.print("Options sÿlectionnÿes : ");
			if (rba.isSelected())
				  System.out.print(" Rabat");
			System.out.println();
		});
		rak = new JRadioButtonMenuItem("Marrakech");
		ville.add(rak);
		rak.addActionListener(e -> {
			Object source = e.getSource();
			if (source == rak) System.out.println("** Action option Marrakech **");
		});
		rak.addItemListener(e -> {
			Object source = e.getSource();
			if (source== rak) System.out.println("*** Item option Marrakech ***");
			System.out.print("Options sÿlectionnÿes : ");
			if (rak.isSelected()) System.out.print(" Marrakech");
			System.out.println();
		});
		ButtonGroup groupe = new ButtonGroup();
		groupe.add(rba);
		groupe.add(rak);
		/* crÿation menu Catÿgorie et ses cases ‡ cocher */
		cat = new JMenu("Catÿgorie");
		barreMenus.add(cat);
		mag = new JCheckBoxMenuItem("Magnifique");
		cat.add(mag);
		mag.addActionListener(e -> {
			Object source = e.getSource();
			if (source == mag) System.out.println("** Action option Magnifique **");
		});
		mag.addItemListener(e -> {
			Object source = e.getSource();
			if (source ==mag) System.out.println("*** Item option Magnifique ***");
			System.out.print("Options sÿlectionnÿes : ");
			if (mag.isSelected()) System.out.print(" Magnifique");
			System.out.println();
		});
		tour = new JCheckBoxMenuItem("Touristique");
		cat.add(tour);
		tour.addActionListener(e -> {
			Object source = e.getSource();
			if (source == tour)
				System.out.println("** Action option Touristique **");
		});
		tour.addItemListener(e -> {
			Object source = e.getSource();
			if (source == tour)
				System.out.println("*** Item option Touristique ***");
			System.out.print("Options sÿlectionnÿes : ");
			if (tour.isSelected())
				System.out.print(" Touristique");
			System.out.println();
		});
	}

	/*
	 * public void actionPerformed(ActionEvent e) { Object source = e.getSource();
	 * if (source == rba) System.out.println("** Action option Rabat **"); if
	 * (source == rak) System.out.println("** Action option Marrakech **"); if
	 * (source == mag) System.out.println("** Action option Magnifique **"); if
	 * (source == tour) System.out.println("** Action option Touristique **"); }
	 * 
	 * public void itemStateChanged(ItemEvent e) { Object source = e.getSource(); if
	 * (source == rba) System.out.println("*** Item option Rabat ***"); if (source
	 * == rak) System.out.println("*** Item option Marrakech ***"); if (source ==
	 * mag) System.out.println("*** Item option Magnifique ***"); if (source ==
	 * tour) System.out.println("*** Item option Touristique ***");
	 * System.out.print("Options sÿlectionnÿes : "); if (rba.isSelected())
	 * System.out.print(" Rabat"); if (rak.isSelected())
	 * System.out.print(" Marrakech"); if (mag.isSelected())
	 * System.out.print(" Magnifique"); if (tour.isSelected())
	 * System.out.print(" Touristique"); System.out.println(); }
	 */
	private JMenuBar barreMenus;
	private JMenu ville, cat;
	private JRadioButtonMenuItem rba, rak;
	private JCheckBoxMenuItem mag, tour;

	public static void main(String args[]) {
		FenetreJMenu fen = new FenetreJMenu();
		fen.setVisible(true);
	}
}
