import java.util.Scanner;

public class Quadratic {

    // Method to calculate and find the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        // Calculate the discriminant (delta)
        double delta = Math.pow(b, 2) - 4 * a * c;

        // If delta is negative, return an empty array as no real roots exist
        if (delta < 0) {
            return new double[0];  // Empty array to indicate no real roots
        }

        // If delta is zero, there is only one real root
        if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};  // Return one root
        }

        // If delta is positive, there are two real roots
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);
        
        // Return both roots
        return new double[]{root1, root2};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Call the method to find the roots
        double[] roots = findRoots(a, b, c);

        // Display the roots or the message indicating no real roots
        if (roots.length == 0) {
            System.out.println("The equation has no real roots.");
        } else if (roots.length == 1) {
            System.out.println("The equation has one real root: " + roots[0]);
        } else {
            System.out.println("The equation has two real roots: " + roots[0] + " and " + roots[1]);
        }

        scanner.close();  // Close the scanner to prevent resource leak
  }
}