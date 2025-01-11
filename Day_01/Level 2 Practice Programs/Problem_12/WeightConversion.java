import java.util.*;
public class WeightConversion{
 public static void main(String args[]){
   double weight;
  Scanner sc = new Scanner(System.in);
  weight = sc.nextDouble();
  double WeightInPound = weight/2.2;
 System.out.println(" The weight of the person in pound is " + WeightInPound +" and in kg is " + weight);
}
}