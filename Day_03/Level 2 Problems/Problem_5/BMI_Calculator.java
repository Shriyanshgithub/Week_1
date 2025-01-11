import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        // Create scanner for input
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        // Create arrays to store height, weight, BMI, and weight status of persons
        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] weightStatuses = new String[numPersons];

        // Take input for the weight and height of the persons
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1));

            System.out.print("Enter weight (kg): ");
            weights[i] = scanner.nextDouble();

            System.out.print("Enter height (m): ");
            heights[i] = scanner.nextDouble();

            
            bmis[i] = weights[i] / (heights[i] * heights[i]);

            if (bmis[i] < 18.5) {
                weightStatuses[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] < 24.9) {
                weightStatuses[i] = "Normal weight";
            } else if (bmis[i] >= 25 && bmis[i] < 29.9) {
                weightStatuses[i] = "Overweight";
            } else {
                weightStatuses[i] = "Obese";
            }
        }
        System.out.println("\nDetails of all persons:");
        System.out.printf( "Person", "Weight (kg)", "Height (m)", "BMI", "Weight Status");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf( (i + 1), weights[i], heights[i], bmis[i], weightStatuses[i]);
        }

        scanner.close();
    }
}
