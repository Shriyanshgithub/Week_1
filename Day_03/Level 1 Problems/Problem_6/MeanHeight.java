import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Define an array to store the heights of the players
        double[] heights = new double[11];
        double sum = 0.0;

        // Get the height of each player from the user
        System.out.println("Enter the heights of 11 football players:");

        for (int i = 0; i < 11; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i]; // Add each height to the sum
        }

        // Calculate the mean height
        double meanHeight = sum / 11;

        // Display the mean height
        System.out.println("\nThe mean height of the football team is: " + meanHeight);

        // Close the scanner
        scanner.close();
    }
}
