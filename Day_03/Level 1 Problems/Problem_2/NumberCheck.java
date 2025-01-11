import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define an array to store 5 numbers
        int[] numbers = new int[5];
        
        // Taking input for 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        // Loop through the array to check each number
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is positive and even.");
                } else {
                    System.out.println(num + " is positive and odd.");
                }
            } else if (num < 0) {
                System.out.println(num + " is negative.");
            } else {
                System.out.println(num + " is zero.");
            }
        }
        
        // Compare the first and last elements
        if (numbers[0] == numbers[4]) {
            System.out.println("The first and last elements are equal.");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("The first element is greater than the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
