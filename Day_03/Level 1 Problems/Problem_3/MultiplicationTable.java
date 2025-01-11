import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Get the number for which the multiplication table will be printed
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();

        // Define an array to store the multiplication results
        int[] multiplicationTable = new int[10];

        // Calculate the multiplication table and store it in the array
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }

        // Print the multiplication table in the desired format
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
