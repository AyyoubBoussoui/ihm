package ex9;

import java.util.* ;
public class TestInterfaceLinkedList{
public static void main (String args[]){
LinkedList<String> liste = new LinkedList<String>() ;
System.out.print("Liste en A : ") ;
afficher(liste) ;
liste.add("Rabat") ;
liste.add("Casa") ; // ajouts en fin de liste
System.out.print("Liste en B : ") ;
afficher(liste);
ListIterator<String> it = liste.listIterator() ;
it.next() ; // on se place sur le premier element
it.add("Essaouira") ; it.add("Casa") ; // et on ajoute deux elements
System.out.print("Liste en C : ") ;
afficher(liste) ;
it = liste.listIterator() ;
it.next() ; // on progresse d’un element
it.add("Casa") ; it.add("Marrakech") ; // et on ajoute deux elements
System.out.print("Liste en D : ") ;
afficher(liste) ;
it = liste.listIterator(liste.size()) ; // on se place en fin de liste
while (it.hasPrevious()){ // on recherche le dernier Casa
String ch = it.previous() ;
if (ch.equals("Casa")){
it.remove() ; // et on le supprime
break ;
}
}
System.out.print("Liste en E : ") ;
afficher(liste) ;
it = liste.listIterator() ;
it.next() ; it.next() ; // on se place sur le deuxieme element
it.set("x") ; // qu’on remplace par "x"
System.out.print("Liste en F : ") ;
afficher(liste) ;
}
public static void afficher(LinkedList<String> l){
ListIterator<String> iter = l.listIterator();
while (iter.hasNext())
System.out.print (iter.next() + " ") ;
System.out.println () ;
}
}