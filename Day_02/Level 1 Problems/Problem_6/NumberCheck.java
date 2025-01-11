import java.util.Scanner;

public class NumberCheck{
 public static void main(String args[]){
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the number");
  int number = input.nextInt();
  if(number > 0){
     System.out.println(number + " is positive number");
  }
  else if(number < 0){
     System.out.println(number + " is negative number");
  }
  else{
   System.out.println(number + " is Zero");
  }
  
  input.close();
 }
}