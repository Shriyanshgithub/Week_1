import java.util.Scanner;
public class TemperatureConversion{
  public static void main(String[] args){
   final Scanner sc = new Scanner(System.in);
  final double FAHRENHEIT = sc.nextDouble();
  final double CELSIUS = (FAHRENHEIT - 32) * 5/9;
  System.out.println("The "+ FAHRENHEIT +" fahrenheit is "+ CELSIUS +" celsius");
}
}