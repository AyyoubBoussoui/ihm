package ex10;

import java.util.HashSet;
import java.util.Iterator;
public class TestCollection {
public static void main(String[] args) {
//CrØation de HashSet et ajout d’ØlØments
HashSet<Object> hs = new HashSet<Object>();
Object table=new Object[5];
hs.add("Marrakech");
hs.add(2020);
hs.add(6);
hs.add(7);
table=hs.clone();
System.out.println(table);
System.out.println("Une premiŁre liste d’ØlØments: "+hs);
System.out.println("Affichage par iterator: ");
Iterator<Object> it = hs.iterator();
while(it.hasNext())
System.out.println(it.next());
// Suppression d’un ØlØment spØcifique de HashSet
hs.remove(7);
System.out.println("AprŁs avoir appelØ la mØthode remove(object): "+hs);
HashSet<Object> hs1=new HashSet<Object>();
hs1.add("Java");
hs1.add("Python");
hs.addAll(hs1);
System.out.println("Liste mise à jour: "+hs);
//Suppression de tous les nouveaux ØlØments de HashSet
hs.removeAll(hs1);
System.out.println("AprŁs avoir appelØ la mØthode removeAll(): "+hs);
// Suppression de tous les ØlØments disponibles dans l’ensemble
hs.clear();
System.out.println("AprŁs avoir invoquØ la mØthode clear(): "+hs);
}
}
