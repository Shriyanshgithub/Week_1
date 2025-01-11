import java.util.Scanner;

public class FindFactors {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Loop from 1 to the number (exclusive)
        for (int i = 1; i < number; i++) {
            // Check if the number is divisible by i (i.e., i is a factor)
            if (number % i == 0) {
                System.out.println(i);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
