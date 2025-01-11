import java.util.Scanner;
public class ConvertDistance{
  public static void main(String[] args){
	final double DISTANCE_IN_FEET = new Scanner(System.in).nextInt();
	final double DISTANCE_IN_YARD = DISTANCE_IN_FEET/3;
    final double DISTANCE_IN_MILE = DISTANCE_IN_YARD/1760;	
	System.out.println("Your distance in yard is " + DISTANCE_IN_YARD + " while in feet is " + DISTANCE_IN_FEET + " and mile is " + DISTANCE_IN_MILE);
}
}