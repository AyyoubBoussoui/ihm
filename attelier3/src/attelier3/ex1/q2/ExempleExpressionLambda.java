package attelier3.ex1.q2;

public class ExempleExpressionLambda {
	// déclarée dans le fichier ExempleExpressionLambda.java
	
	public static void main(String[] args) {
	int n1 = 4, n2 = 3;
	/*
	Calculateur carre = new Calculateur(){
	public int calcul(int n){
	return n*n;}
	};*/
	Calculateur carre=x -> x*x; //une expression lambda
	int res=carre.calcul(n1);
	System.out.println("Carre de "+n1+"="+res) ;
	System.out.println("Carre de "+n2+"="+carre.calcul(n2)) ;
	Calculateur poly=x -> x*x+x-1; //une autre expression lambda
	int p=poly.calcul(n1);//wooooow
	System.out.println("Polynôme de "+n1+"="+p) ;
	System.out.println("Polynôme de "+n2+"="+poly.calcul(n2)) ;
	}
	}