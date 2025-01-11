import java.util.Scanner;
public class CalculatePrice{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
	 int unitPrice = sc.nextInt();
	int Quantity = sc.nextInt();
      int TOTAL = unitPrice * Quantity;	
	System.out.println("The total purchase price is INR " + TOTAL + " if the quantity " + Quantity + " and unit price is INR " + unitPrice);
}
}