package attelier3.ex5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestLambda{
public static void main(String[] args) {
List<Produit> liste=new ArrayList<Produit>();
//Adding Products
liste.add(new Produit(1,"HP",3000f));
liste.add(new Produit(3,"Mac",20000f));
liste.add(new Produit(2,"Dell",4000f));
System.out.println("Tri sur la base du nom ...");
// implémentation de l'expression lambda
Collections.sort(liste,(p1,p2)->{
return p1.name.compareTo(p2.name);
});
for(Produit p:liste){
System.out.println(p.id+" "+p.name+" "+p.price);
}
}
}