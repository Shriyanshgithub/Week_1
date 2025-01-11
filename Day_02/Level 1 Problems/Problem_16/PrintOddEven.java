import java.util.*;
public class PrintOddEven{
 public static void main(String args[]){
 // Create a Scanner Object
 Scanner sc = new Scanner(System.in);
 // Get input value for number
 System.out.println("Enter the number");
 int number = sc.nextInt();
 for(int i = 1; i<=number; i++){
  if(i % 2 == 0){
  System.out.println(i+ " is even ");
  }
 else{
    System.out.println(i+" is odd ");
 }
}
sc.close();
 }
}