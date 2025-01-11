public class CalculateProfit{
  public static void main(String args[]){
   int costPrice = 129, sellPrice = 191, profit;
   double profitPercentage;
   profit = sellPrice - costPrice;
   profitPercentage = (profit/costPrice)*100;
  System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellPrice + "\n" + "The Profit is INR " + profit + " and the Profit Percentage is "+ profitPercentage);
}
}