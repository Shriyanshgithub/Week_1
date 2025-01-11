import java.util.*;
public class Handshakes{
 public static void main(String args[]){
  int number;
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the number");
  number = input.nextInt();
  double possibleHandshake = (number * (number - 1)) / 2 ;
 System.out.println("Possible Handshake : " + possibleHandshake);
}
}