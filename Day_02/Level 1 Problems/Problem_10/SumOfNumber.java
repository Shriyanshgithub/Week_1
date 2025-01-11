import java.util.Scanner;

public class SumOfNumber{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number");
  double value = sc.nextDouble();
  double total = 0;
  while(value != 0){
   total = total + value;
   System.out.println("Enter the number again");
   value = sc.nextDouble();
 }
 System.out.println("total of value is " + total);
 sc.close();
 }
}