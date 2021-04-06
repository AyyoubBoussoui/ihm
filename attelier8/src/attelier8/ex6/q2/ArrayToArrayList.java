package attelier8.ex6.q2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrayToArrayList {
public static void main(final String[] args) {
String[] tableau = { "Java", "Python", "R", "Scala" };
List<String> liste = new ArrayList<String>();
Collections.addAll(liste, tableau);
System.out.println("Contenu du tableau :");
for (String str : tableau) {
System.out.print(" " + str);
}
System.out.println("\nContenu de la liste :");
for (String str : liste) {
System.out.print(" " + str);
}
tableau[0] = "Java 13";
liste.add("Ruby");
System.out.println("\nContenu du tableau aprŁs la modification et l’ajout : ");
for (String str : tableau) {
System.out.print(" " + str);
}
System.out.println("\nContenu de la liste aprŁs la modification et l’ajout :");
for (String str : liste) {
System.out.print(" " + str);
}
}
}