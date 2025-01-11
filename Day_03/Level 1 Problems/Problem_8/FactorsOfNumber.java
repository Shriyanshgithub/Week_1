import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find the factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // If i is a factor, store it in the factors array
                factors[index++] = i;

                // If the index reaches the maxFactor, double the size of the array
                if (index == maxFactor) {
                    maxFactor *= 2;
                    // Create a temporary array to store the current factors
                    int[] temp = new int[maxFactor];

                    // Copy the contents of the factors array into the temp array
                    System.arraycopy(factors, 0, temp, 0, factors.length);

                    // Assign the temp array back to factors
                    factors = temp;
                }
            }
        }

        // Display the factors
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
