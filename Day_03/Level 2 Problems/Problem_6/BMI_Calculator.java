import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        // Create scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

         double[][] personData = new double[numPersons][3];
        String[] weightStatus = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter details for person " + (i + 1));

            // Get the weight
            double weight;
            do {
                System.out.print("Enter weight (kg): ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Please enter a positive value for weight.");
                }
            } while (weight <= 0);

            // Get the height (must be a positive value)
            double height;
            do {
                System.out.print("Enter height (m): ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Please enter a positive value for height.");
                }
            } while (height <= 0);

            // Store the weight and height
            personData[i][0] = weight;
            personData[i][1] = height;

            // Calculate BMI and store
            personData[i][2] = weight / (height * height);

            // Determine weight status based on BMI
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

                System.out.println("\nDetails of all persons:");
        System.out.printf("Person", "Weight (kg)", "Height (m)", "BMI", "Weight Status");

        for (int i = 0; i < numPersons; i++) {
            System.out.printf( (i + 1) + “, ” + personData[i][0] + “,” + personData[i][1]+ “, ” +  personData[i][2] + “ , ” weightStatus[i]);
        }

        // Close the scanner
        scanner.close();
    }
}