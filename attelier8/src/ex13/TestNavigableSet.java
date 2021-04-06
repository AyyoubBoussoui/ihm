package ex13;

import java.util.Iterator; import java.util.NavigableSet;
import java.util.Set; import java.util.TreeSet;
public class TestNavigableSet {
public static void afficherSet(final Set<String> set) {
Iterator<String> iterator = set.iterator();
while (iterator.hasNext()) {
String element = iterator.next();
System.out.print(element);
if (iterator.hasNext()) {
System.out.print(", ");
} else {
System.out.println("");}}}
public static void main(final String[] args) {
NavigableSet<String> set = new TreeSet<String>();
for (int i = 1; i < 10; i++) {
set.add("" + i);}
System.out.println(set);
System.out.println("ceiling(5)=" + set.ceiling("5"));
System.out.println("floor(5)=" + set.floor("5"));
System.out.println("higher(5)=" + set.higher("5"));
System.out.println("lower(5)=" + set.lower("5"));
System.out.print("Ordre descendant=");
afficherSet(set.descendingSet());
System.out.print("headSet(5)=");
afficherSet(set.headSet("5"));
System.out.print("headSet(5,true)=");
afficherSet(set.headSet("5", true));
System.out.print("subSet(3,5)=");
afficherSet(set.subSet("3", "5"));
System.out.print("subSet(3,true,5,true)=");
afficherSet(set.subSet("3", true, "5", true));
System.out.print("tailSet(5)=");
afficherSet(set.tailSet("5"));
System.out.print("tailSet(5,true)=");
afficherSet(set.tailSet("5", true));
System.out.println("pollFirst()=" + set.pollFirst());
System.out.println("pollLast()=" + set.pollLast());
System.out.println(set);}}
