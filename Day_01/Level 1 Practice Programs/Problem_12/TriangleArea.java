import java.util.Scanner;

public class TriangleArea{
  public static void main(String[] args){
    final Scanner sc = new Scanner(System.in);
    final int BASE = sc.nextInt();
	final int HEIGHT = sc.nextInt();
	final double AREA_IN_CM = (double)BASE * HEIGHT /2;
	final double AREA_IN_INCH = AREA_IN_CM/2.54;
	final double AREA_IN_FEET = AREA_IN_INCH/12;
	System.out.println("Your area in cm is " + AREA_IN_CM + " while in feet is " + AREA_IN_FEET + " and inches is " + AREA_IN_INCH);
}
}