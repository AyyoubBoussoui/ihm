package attelier3.lesinterfaces;

public class Test {
public static void main(String args[]) {
// lambda expression with multiple arguments
// Anonymous Runnable
StringConcat s1 = new StringConcat(){
@Override
public String sconcat(String a, String b) {
return a+b;
}
};
/*no parameter*/
MyFunctionalInterfac msg = () -> {
return "Hello";
};
System.out.println(msg.sayHello());
StringConcat s = (str1, str2) -> str1 + str2;
/*functionnal interface single parameter*/
MyFunctionalInterface f = (num) -> num+5;
System.out.println(f.incrementByFive(22));
/*multiple parameter***********************************/
/*with lamdas expressions*/
System.out.println("Result: "+s.sconcat("Hello ", "World"));
/*without lamdas*/
System.out.println("Result: "+s1.sconcat("Hello ", "World1"));
/******************************************/
/*more statement */
Sayable person = (message)-> {
String str1 = "I would like to say, ";
String str2 = str1 + message;
return str2;
};
System.out.println(person.say("Time is precious."));
}
interface Sayable{
String say(String message);
}
interface MyFunctionalInterface {
public int incrementByFive(int a);
}
interface MyFunctionalInterfac {
public String sayHello( );
}
interface StringConcat {
public String sconcat(String a, String b);
}
}