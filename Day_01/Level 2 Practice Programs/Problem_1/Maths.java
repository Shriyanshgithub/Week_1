import java.util.Scanner;
public class Maths{
public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   final int NUM_1 = sc.nextInt();
   final int NUM_2 = sc.nextInt();
   final int REMAINDER = NUM_1 % NUM_2;  
   final int QUOTIENT = NUM_1 / NUM_2;   
  System.out.println("The Quotient is "+ QUOTIENT +" and Reminder is "+ REMAINDER +" of two number "+ NUM_1 +" and " + NUM_2);
}
}