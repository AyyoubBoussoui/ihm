package attelier3.ex6.q2;


public class Java8Tester {
public static void main(String args[]){
Java8Tester tester = new Java8Tester();
//avec dØclaration de type
MathOperation addition = (int a, int b) -> a + b;
//sans dØclaration de type
MathOperation subtraction = (a, b) -> a - b;
//avec instruction return et les accolades
MathOperation multiplication = (int a, int b) -> { return a * b; };
//sans instruction return et sans les accolades
MathOperation division = (int a, int b) -> a / b;
System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
System.out.println("10 / 5 = " + tester.operate(10, 5, division));
//avec parenthŁses
Salutation greet2 = (message) ->
System.out.println("Salam " + message);
//sans parenthŁses
Salutation greet1 = message ->
System.out.println("Salam " + message);
greet1.direMessage("FSTG");
greet2.direMessage("UCAM");
}
interface MathOperation {
int operation(int a, int b);
}
interface Salutation {
void direMessage(String message);
}
private int operate(int a, int b, MathOperation mathOperation){
return mathOperation.operation(a, b);
}
}