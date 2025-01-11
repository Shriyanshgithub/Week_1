import java.util.*;
public class ReverseDigit{
 public static void main(String args[]){
   //Initialize Scanner class
   Scanner sc = new Scanner(System.in);
   // take user input
   System.out.print("Enter a number: ");
   int number = sc.nextInt();

   int count = 0;
   int n = number;
    //while loop
    while(n!=0){
      n = n/10;
      count++;
     }

   int[] arr = new int[count];
   for(int i =0; i<count; i++){
     arr[i] = number % 10;
      number = number/10;
    }
 
    for(int i =0 ; i<arr.length; i++){
      System.out.print(arr[i] + " , ");
     }
  sc.close();
  }
}
   
   