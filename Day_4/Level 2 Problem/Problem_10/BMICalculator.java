import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI for each person and populate the BMI column
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInCm = data[i][1];
            double heightInMeters = heightInCm / 100;  // Convert height to meters
            double bmi = weight / (heightInMeters * heightInMeters);  // BMI calculation
            data[i][2] = bmi;  // Store BMI in the third column
        }
    }

    // Method to determine the BMI status of each person
    public static String[] determineBMIStatus(double[][] data) {
        String[] statuses = new String[10];  // Array to store BMI status of each person

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        return statuses;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a 2D array to store weight (kg), height (cm), and BMI
        double[][] data = new double[10][3];  // 10 rows and 3 columns

        // Take user input for weight and height for each person
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            System.out.print("Weight (in kg): ");
            data[i][0] = scanner.nextDouble();  // Store weight in the first column

            System.out.print("Height (in cm): ");
            data[i][1] = scanner.nextDouble();  // Store height in the second column
        }

        // Calculate BMI for each person
        calculateBMI(data);

        // Determine BMI status for each person
        String[] statuses = determineBMIStatus(data);

        // Display the results
        System.out.println("\nResults:");
        System.out.println("Person\tWeight (kg)\tHeight (cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%s\n", 
                               i + 1, data[i][0], data[i][1], data[i][2], statuses[i]);
        }

        scanner.close();  // Close the scanner to prevent resource leak
   }
}