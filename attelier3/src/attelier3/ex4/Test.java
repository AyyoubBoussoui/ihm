package attelier3.ex4;

import java.util.ArrayList;
import java.util.Collections;
class Test
{
public static void main(String args[])
{
// Cr�ation d'un ArrayList avec des �l�ments
// {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
ArrayList<Integer> liste = new ArrayList<Integer>();
for(var i=1;i<=10;i++) liste.add(i);
// Utilisation de l'expression lambda pour imprimer tous les �l�ments
// de liste
System.out.println("Affichage de tous les �l�ments de liste");
liste.forEach(n -> System.out.println(n));
// Utilisation de l'expression lambda pour imprimer les �l�ments pairs
// de liste
System.out.println("Affichage de tous les �l�ments pairs de liste");
liste.forEach(n -> { if (n%2 == 0) System.out.println(n); });
//Utilisation de l'expression lambda pour imprimer les �l�ments divisibles
// par 3 de liste
System.out.println("Affichage de tous les �l�ments divisibles par3 de liste");
liste.forEach(n -> { if (n%3 == 0) System.out.println(n); });
Collections.sort(liste, (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
System.out.println("�l�ments de la liste apr�s tri:" + liste);

}
}