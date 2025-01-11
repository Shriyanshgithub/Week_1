import java.util.Scanner;
public class TemperatureConversion{
  public static void main(String[] args){
   final Scanner sc = new Scanner(System.in);
   final double CELSIUS = sc.nextDouble();
   final double FAHRENHEIT = CELSIUS * 9/5 + 32;
  System.out.println("The "+ CELSIUS +" celsius is "+ FAHRENHEIT +" fahrenheit");
}
}