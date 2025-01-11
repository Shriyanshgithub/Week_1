import java.util.*;

class SumOfDigits {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      int[] arr = new int[10];
      for(int i=0; i<arr.length; i++){
        //take input from user
        arr[i] = input.nextInt();
       }
      for(int i=0; i<arr.length; i++){
        if(arr[i]<0){
          System.out.println("Invalid age");
         }
       else if(arr[i] >=18){
        System.out.println("The student with the age "+ arr[i]+ " can vote");
      }
   else{
    System.out.println("The student with the age "+ arr[i]+ " cannot vote");
   }
}
input.close();
}
}
      
      