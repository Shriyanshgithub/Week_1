import java.util.*;
public class Calculator{
 public static void main(String args[]){
  Double number1 , number2;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number 1");
  number1 = sc.nextDouble();
  System.out.println("Enter the number 2");
  number2 = sc.nextDouble();
  double addition = number1 + number2;
  double substraction = number1 - number2;
  System.out.println("addition, subtraction, multiplication and division division value of 2 numbers " + number1 + " and " + number2 + " is " + (number1 + number2) + " , " + (number1 - number2) + " , " + (number1 * number2) + " and "  + (number1 / number2));
}
}