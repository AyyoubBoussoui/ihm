package attelier3.ex3;

public class ExpressionLambdaRappel {
	// déclarée dans le fichier ExpressionLambdaRappel.java
	public static void main(String[] args) {
	int n1 = 4, n2 = 3, n3 = -1;
	//utilisation d'une expression lambda en argument d'une méthode
	Calculateur carre = x -> x*x;
	Calculateur polynome = x -> 3*x*x + 2*x+7;
	traiter(4, carre);
	traiter(3, polynome);
	}
	public static void traiter(int n, Calculateur cal){
	int rest=cal.calcul(n);
	System.out.println ("Calcul ("+ n +")= "+rest) ;
	}
	}
