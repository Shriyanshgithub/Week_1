import java.util.*;
public class CountStringLength{
 //Call the method to calculate string length using exception
 public static int lengthOfStringUsingException(String str){
  int size = 0;
  
  //Handle and catch the exception using try catch block
  try{
    //This block give StringIndexOutOfBoundsException
      for(int i=0; i<Integer.MAX_VALUE; i++){
	     char ch = str.charAt(i);
		   size++;
		}
	}
  catch(StringIndexOutOfBoundsException e){
        return size;
	}
  return 0;
 }
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the string");
 //Take input from user
 String str = sc.nextLine().trim();
 
 int lengthOfString = lengthOfStringUsingException(str);
 System.out.println("Length of string " + str + " is " + lengthOfString);
 
 } 
}