import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        // Create scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize arrays to store the names, ages, and heights of the friends
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take input for age and height of each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height (in cm) of " + friends[i] + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Find the youngest friend
        int youngestAge = ages[0];
        String youngestFriend = friends[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = friends[i];
            }
        }

        // Find the tallest friend
        double tallestHeight = heights[0];
        String tallestFriend = friends[0];
        for (int i = 1; i < 3; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = friends[i];
            }
        }

        // Display the results
        System.out.println("\nThe youngest friend is " + youngestFriend + " with age " + youngestAge + ".");
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " cm.");

        // Close the scanner
        scanner.close();
    }
}
