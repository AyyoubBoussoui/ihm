package attelier8.ex6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayToArrayList {
public static void main(final String[] args) {
String[] tableau = { "Java", "Python", "R", "Scala"};
List<String> liste = new ArrayList<String>();
System.out.println("Contenu du tableau");
for (String str : tableau) {
System.out.print(" " + str);
}
liste = Arrays.asList(tableau);
System.out.println("\nContenu de la liste");
for (String str : liste) {
System.out.print(" " + str);
}
System.out.println("\n");
tableau[0] = "Java 13";
System.out.println("\nContenu de la liste");
for (String str : liste) {
System.out.print(" " + str);
}
liste.add("Ruby");
System.out.println("\nContenu du tableau");
for (String str : tableau) {
System.out.print(" " + str);
}
}}