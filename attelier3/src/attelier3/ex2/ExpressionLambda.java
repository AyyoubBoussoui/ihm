package attelier3.ex2;

public class ExpressionLambda {
	// déclarée dans le fichier ExpressionLambda.java
	public static void main(String[] args) {
	int n1=4, n2=3, n3=-1;
	//une expression lambda constituée d'un bloc
	Calculateur complique = x -> { if (x>0 && 2*(x/2)==x) return x;
	else if (x>0) return x+1;
	else return -x;
	};
	//int res=complique.calcul(n1);
	System.out.println("Complique de "+ n1 +"="+complique.calcul(n1)) ;
	System.out.println("Complique de "+ n2 +"="+complique.calcul(n2));
	System.out.println("Complique de "+ n3 +"="+complique.calcul(n3));
	
	}
	}