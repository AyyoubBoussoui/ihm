package ex10.q4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestInterfaceSet {
public static void main(String[] args) {
Set<String> set = new HashSet<String>() ;
// ajout d��l�ment
System.out.println("J�ajoute un : " + set.add("un")) ;
System.out.println("J�ajoute deux : " + set.add("deux")) ;
System.out.println("J�ajoute deux : " + set.add("trois")) ;
System.out.println("J�ajoute deux : " + set.add("quatre")) ;
// ajout d�un doublon : �chec
System.out.println("J�ajoute encore un : " + set.add("un")) ;
// affichage de la taille du set
System.out.println("Taille du set : " + set.size()) ;
// cr�ation d�un Iterator sur cet ensemble
Iterator<String> it = set.iterator() ;
while(it.hasNext()) {
String element = it.next() ;
System.out.println(element) ;
}
// cr�ation de HashSet � partir d�une autre collection
ArrayList<String> liste=new ArrayList<String>();
liste.add("Java");
liste.add("Python");
liste.add("R");
HashSet<String> st=new HashSet<String>(liste);
st.add("Scala");
Iterator<String> i=st.iterator();
while(i.hasNext())
{
System.out.println(i.next());
}
}
}
