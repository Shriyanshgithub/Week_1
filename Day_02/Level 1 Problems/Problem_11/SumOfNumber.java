import java.util.Scanner;

public class SumOfNumber{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the number");
 double number = sc.nextDouble();
 double total = 0;
 while(true){
 if(number == 0 || number < 0){
   break;
 }
 total = total + number;
 System.out.println("Enter the number again");
 number = sc.nextDouble();
}
System.out.println("total of number is " + total);
}
}