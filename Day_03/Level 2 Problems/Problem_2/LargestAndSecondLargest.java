import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        //Scanner class for user input
        Scanner scanner = new Scanner(System.in);
        
        //take user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Define the array size (max digits to store)
        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        
        // Initialize index for the array
        int index = 0;
        
        while (number != 0 && index < maxDigits) {
            digits[index] = number % 10;  
            number /= 10;  
            index++; 
        }

        // Initialize variables for largest and second largest digits
        int largest = -1;
        int secondLargest = -1;

        // Loop to find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        if (secondLargest != -1) {
            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("There is no second largest digit.");
        }

        // Close the scanner
        scanner.close();
    }
}
