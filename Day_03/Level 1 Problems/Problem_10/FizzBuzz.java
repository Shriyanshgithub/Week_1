import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Get the input number from the user
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            scanner.close();
            return; // Exit the program if input is invalid
        }

        // Create a String array to store the results
        String[] results = new String[number + 1]; // Array size should be number + 1 to include the number itself

        // Loop from 0 to the input number and apply FizzBuzz logic
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";  // For multiples of both 3 and 5
            } else if (i % 3 == 0) {
                results[i] = "Fizz";      // For multiples of 3
            } else if (i % 5 == 0) {
                results[i] = "Buzz";      // For multiples of 5
            } else {
                results[i] = String.valueOf(i); // For other numbers, store the number itself
            }
        }

        // Loop through the results array and print each element in the required format
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
