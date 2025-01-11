import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        //Intialize Scanner class
        Scanner scanner = new Scanner(System.in);
        
        // take user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        
        // Initialize index for the array
        int index = 0;
        
        while (number != 0) {
            // If index reaches maxDigits, resize the array
            if (index == maxDigits) {
                // Increase the size of the array by 10
                maxDigits += 10;
                // Create a temporary array of the new size
                int[] temp = new int[maxDigits];
                // Copy the existing digits array to the new temp array
                System.arraycopy(digits, 0, temp, 0, digits.length);
                // Assign the temp array back to digits
                digits = temp;
            }
            
            // Store the last digit of the number
            digits[index] = number % 10;
            number /= 10;  // Remove the last digit from the number
            index++;  // Increment the index
        }

        // Initialize variables for largest and second largest digits
        int largest = -1;
        int secondLargest = -1;

        // Loop through the array to find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        if (secondLargest != -1) {
            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("There is no second largest digit.");
        }
        scanner.close();
    }
}
