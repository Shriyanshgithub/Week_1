import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a natural number: ");
      int n = sc.nextInt();
        
      if (n <= 0) {
         System.out.println("Please enter a positive integer.");
        } else {
            int sumUsingLoop = 0;
            int sumUsingFormula = n * (n + 1) / 2;

            int i = 1;
            while (i <= n) {
                sumUsingLoop += i;
                i++;
            }

          System.out.println("Sum using while loop: " + sumUsingLoop);
          System.out.println("Sum using formula: " + sumUsingFormula);
           if (sumUsingLoop == sumUsingFormula) {
              System.out.println("Both results are correct.");
            } 
         else {
                System.out.println("There is a discrepancy between the results.");
            }
        }
        sc.close();
    }
}
