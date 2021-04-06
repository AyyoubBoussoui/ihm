package attelier3.ex1;

public class ExempleAnonyme {
	// déclarée dans le fichier ExempleAnonyme.java
	public static void main(String[] args) {
	int n1 = 4, n2 = 3;
	Calculateur carre = new Calculateur(){
	public int calcul(int n){
	return n*n;}
	};
	int res=carre.calcul(n1);
	System.out.println("Carre de "+n1+"="+res) ;
	System.out.println("Carre de "+n2+"="+carre.calcul(n2)) ;
	}
	}