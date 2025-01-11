import java.util.*;
public class HeightConversion{
 public static void main(String atgs[]){
  double height, heightInFeet, heightInInches;
  Scanner input = new Scanner (System.in);
  System.out.println("Enter the height");
  height = input.nextDouble();
  heightInFeet = height * 0.0328084;
  heightInInches = height * 0.394;
  System.out.println(" Your Height in cm is " + height + "while in feet is " + heightInFeet + " and inches is " + heightInInches);
}
}

 
  