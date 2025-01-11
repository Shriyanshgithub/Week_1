import java.util.*;
public class Perimeter{
 public static void main(String args[]){
  double side;
 Scanner input = new Scanner(System.in);
 System.out.println("Enter the side");
  side = input.nextDouble();
  double perimeter = 4*side;
 System.out.println("The length of the side is " + side  + " whose perimeter is " + perimeter);
}
}