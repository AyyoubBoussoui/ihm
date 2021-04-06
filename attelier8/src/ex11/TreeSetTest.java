package ex11;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		Set<String> tree = new TreeSet();
		tree.add("Ahmed");
		tree.add("Omar");
		tree.add("Mohamed");
		tree.add("Lina");
		tree.add("Zakaria");
		tree.add("Hiba");
		Iterator<String> it = tree.iterator();
		while(it.hasNext())
		System.out.println(it.next());
		// Question2
		// Cr�er l�ensemble tri� (SortedSet)
		System.out.println("--------------------------");
		SortedSet set = new TreeSet();
		// Ajouter des �l�ments � l�ensemble
		set.add("Python"); set.add("Scala"); set.add("R"); set.add("Java");
		// It�rer sur les �l�ments de l�ensemble
		Iterator itt = set.iterator();
		while (itt.hasNext()) {
		// Obtenir l��l�ment
		Object element = itt.next();
		System.out.println(element.toString());
		}
	}

}
