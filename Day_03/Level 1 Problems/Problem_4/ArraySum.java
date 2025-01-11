import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Define an array to store up to 10 values and initialize variables
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Infinite loop to allow multiple user inputs
        while (true) {
            // Prompt the user to enter a number
            System.out.print("Enter a number (enter 0 or a negative number to stop): ");
            double number = scanner.nextDouble();

            // Check if the user entered 0 or a negative number, or if the array is full
            if (number <= 0 || index >= 10) {
                break;
            }

            // Store the number in the array and increment the index
            numbers[index] = number;
            index++;
        }

        // Calculate the sum of the numbers entered
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display the numbers and the total sum
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        // Display the total sum of the numbers
        System.out.println("\nTotal sum: " + total);

        // Close the scanner
        scanner.close();
    }
}
