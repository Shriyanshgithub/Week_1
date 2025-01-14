import java.util.Scanner;

public class YoungestAndTallestFriends {

    // Method to find the youngest among the three friends
    public static String findYoungest(int[] ages, String[] names) {
        int youngestAge = ages[0];
        String youngestFriend = names[0];
        
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = names[i];
            }
        }
        return youngestFriend;
    }

    // Method to find the tallest among the three friends
    public static String findTallest(double[] heights, String[] names) {
        double tallestHeight = heights[0];
        String tallestFriend = names[0];
        
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = names[i];
            }
        }
        return tallestFriend;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define arrays for storing names, ages, and heights
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input age and height for each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter the height (in meters) of " + names[i] + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Find the youngest and tallest friends
        String youngestFriend = findYoungest(ages, names);
        String tallestFriend = findTallest(heights, names);

        // Display the results
        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);

        scanner.close();  // Close the scanner to prevent resource leak
    }
}