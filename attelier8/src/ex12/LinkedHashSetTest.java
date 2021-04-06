package ex12;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
	public static void main(String[] args) {
		Set<String> tree = new LinkedHashSet();
		tree.add("Ahmed");
		tree.add("Omar");
		tree.add("Mohamed");
		tree.add("Lina");
		tree.add("Zakaria");
		tree.add("Hiba");
		//System.out.println(tree.add("Lina"));
		Iterator<String> it = tree.iterator();
		while(it.hasNext())
		System.out.println(it.next());
	}

}
