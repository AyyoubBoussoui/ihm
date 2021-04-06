package ex14;

import java.util.Collection; import java.util.HashMap;
import java.util.Iterator; import java.util.Map;
import java.util.Map.Entry; import java.util.Set;
public class TestMap{
public static void main(String[] args) {
Map<Integer, String> map = new HashMap<Integer, String>();
map.put(2, "Java"); map.put(3, "Scala");
map.put(4, "Ruby"); map.put(1, "Python");
//Nous rﾘcupﾘrons un Set contenant des entiers
Set<Integer> setInt = map.keySet();
//Utilisation d置n itﾘrateur gﾘnﾘrique
Iterator<Integer> it = setInt.iterator();
System.out.println("Parcours d置ne Map avec keySet : ");
while(it.hasNext()){
int key = it.next();
System.out.println("Valeur pour la clﾘ " + key + " = " + map.get(key));
}
System.out.println("-----------------------------------");
Set<Map.Entry<Integer, String>> setEntry = map.entrySet();
//Utilisation d置n iterateur gﾘnﾘrique
Iterator<Map.Entry<Integer, String>> itEntry = setEntry.iterator();
System.out.println("Parcours d置ne Map avec setEntry : ");
while(itEntry.hasNext()){
Map.Entry<Integer, String> entry = itEntry.next();
System.out.println("Valeur pour la clﾘ " + entry.getKey() + " = "
+ entry.getValue());}
System.out.println("-----------------------------------");
Collection<String> col = map.values();
Iterator<String> itString = col.iterator();
System.out.println("Parcours de la liste des valeurs d置ne Map avec values : ");
while(itString.hasNext()){
String value = itString.next();
System.out.println("Valeur : " + value);}
System.out.println("-----------------------------------");}
}