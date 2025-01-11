public class StudentFee{
 public static void main(String args[]){
 int Fee = 125000;
 int DiscountPercent = 10;
 double DiscountAmount = ((double)Fee * (double)DiscountPercent)/100;
 double DiscountFee = Fee - (double)DiscountAmount;
 System.out.println("The discount amount is INR" + DiscountAmount + " and final discounted fee is INR" + DiscountFee);
}
}
