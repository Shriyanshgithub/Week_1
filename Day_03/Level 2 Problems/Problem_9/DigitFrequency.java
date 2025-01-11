import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        int[] digitFrequency = new int[10];

        // Process each digit in the number
        while (number != 0) {
            // Extract the last digit of the number
            int digit = (int) (number % 10);

            // Increment the corresponding frequency count
            digitFrequency[digit]++;

            // Remove the last digit from the number
            number /= 10;
        }

        // Display the frequency of each digit
        System.out.println("\nFrequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (digitFrequency[i] > 0) {
                System.out.println("Digit " + i + ": " + digitFrequency[i] + " time(s)");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
