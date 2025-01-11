import java.util.*;
public class SimpleInterest{
 public static void main(String args[]){
  int Principle , timeInHour;
  double rate;
  Scanner sc = new Scanner(System.in);
   Principle = sc.nextInt();
   timeInHour = sc.nextInt();
   rate = sc.nextDouble();
 double Simple_Interest = (Principle * rate * timeInHour)/100.0;
 System.out.println("The Simple Interest is " + Simple_Interest + " for Principal " + Principle + ",Rate of Interest " + rate + " and Time " + timeInHour);
}
}