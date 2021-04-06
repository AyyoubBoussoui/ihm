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
		// Crÿer líensemble triÿ (SortedSet)
		System.out.println("--------------------------");
		SortedSet set = new TreeSet();
		// Ajouter des ÿlÿments ‡ líensemble
		set.add("Python"); set.add("Scala"); set.add("R"); set.add("Java");
		// Itÿrer sur les ÿlÿments de líensemble
		Iterator itt = set.iterator();
		while (itt.hasNext()) {
		// Obtenir líÿlÿment
		Object element = itt.next();
		System.out.println(element.toString());
		}
	}

}
