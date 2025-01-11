import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Get the input number from the user
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Error: The number must be a positive integer.");
            scanner.close();
            return; // Exit the program if not a valid natural number
        }
        int size = number / 2 + 1;
        int[] oddNumbers = new int[size];
        int[] evenNumbers = new int[size];
        
        // Initialize index variables for odd and even arrays
        int oddIndex = 0;
        int evenIndex = 0;

        // Loop through the numbers from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i; // If even, store in even array
            } else {
                oddNumbers[oddIndex++] = i; // If odd, store in odd array
            }
        }

        // Print the odd numbers array
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        // Print the even numbers array
        System.out.print("\nEven numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
