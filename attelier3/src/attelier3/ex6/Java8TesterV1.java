package attelier3.ex6;

public class Java8TesterV1 {
public static void main(String args[]){
//avec déclaration de type
MathOperation addition = (int a, int b) -> a + b;
//sans déclaration de type
MathOperation subtraction = (a, b) -> a - b;
//avec instruction return et les accolades
MathOperation multiplication = (int a, int b) -> { return a * b; };
//sans instruction return et sans les accolades
MathOperation division = (int a, int b) -> a / b;
System.out.println("10 + 5 = " + addition.operation(10, 5));
System.out.println("10 - 5 = " + subtraction.operation(10, 5));
System.out.println("10 x 5 = " + multiplication.operation(10, 5));
System.out.println("10 / 5 = " + division.operation(10, 5));
//avec parenthèses
Salutation greet2 = (message) ->
System.out.println("Salam " + message);
//sans parenthèses
Salutation greet1 = message ->
System.out.println("Salam " + message);
greet1.direMessage("FSTG");
greet2.direMessage("UCAM");
}}
