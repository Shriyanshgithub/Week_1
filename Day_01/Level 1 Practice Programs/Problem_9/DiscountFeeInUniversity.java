import java.util.*;
public class DiscountFeeInUniversity{
 public static void main(String args[]){
  double fee , discountPercent;
  Scanner input = new Scanner(System.in);
 System.out.println("enter the fee");
  fee = input.nextDouble();
 System.out.println("enter the discount");
  discountPercent = input.nextDouble();
 double discountAmount = (fee*discountPercent)/100.0;
 System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + (fee - discountAmount));
}
}
  