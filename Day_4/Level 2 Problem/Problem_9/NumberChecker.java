import java.util.Scanner;

public class NumberChecker {

    // Method to check whether the number is positive or negative
    public static String isPositive(int num) {
        if (num < 0) {
            return "Negative";
        } else {
            return "Positive";
        }
    }

    // Method to check if the number is even or odd
    public static String isEven(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;  // num1 is greater
        } else if (num1 < num2) {
            return -1; // num1 is less
        } else {
            return 0;  // both are equal
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store 5 numbers
        int[] numbers = new int[5];

        // Take user input for 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Loop through the array and check if each number is positive or negative
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            String positivity = isPositive(num);
            System.out.print("Number " + num + " is " + positivity);

            if (positivity.equals("Positive")) {
                String evenOdd = isEven(num);
                System.out.println(" and it is " + evenOdd + ".");
            } else {
                System.out.println(".");
            }
        }

        // Compare the first and last numbers in the array
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);

        // Display the comparison result
        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == -1) {
            System.out.println("The first number is less than the last number.");
        } else {
            System.out.println("The first and last numbers are equal.");
        }

        scanner.close();  // Close the scanner
}
}