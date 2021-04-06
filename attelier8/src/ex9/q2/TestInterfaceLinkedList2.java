package ex9.q2;

import java.util.* ;
public class TestInterfaceLinkedList2{
public static void main (String args[]){
Scanner Clavier= new Scanner(System.in);
LinkedList<String> liste = new LinkedList<String>() ;
//on ajoute a la liste tous les mots lus clavier
System.out.print ("Donnez une liste des mots (Tapez vide pour finir)") ;
while (true){
String s = Clavier.nextLine();
if (s.length() == 0) break ;
liste.add (s) ;
}
System.out.println ("Liste des mots saisis :") ;
ListIterator<String> it = liste.listIterator() ;
while (it.hasNext()) System.out.print (it.next() + " ") ;
System.out.println () ;
System.out.println ("Liste des mots saisis a l’envers :") ;
it = liste.listIterator(liste.size()) ; // iterateur en fin de liste
while (it.hasPrevious()) System.out.print (it.previous() + " ") ;
System.out.println () ;
}
}