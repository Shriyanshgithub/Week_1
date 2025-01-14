import java.util.*;
public class RandomNumberAnalysis {

    // Method to generate an array of random 4-digit numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];

        for (int i = 0; i < size; i++) {
            // Generate a random number between 1000 and 9999
            randomNumbers[i] = 1000 + (int)(Math.random() * 9000);
        }

        return randomNumbers;
    }

    // Method to find average, min, and max of an array of numbers
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); // Generate 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(size);

        // Find average, min, and max values of the random numbers
        double[] results = findAverageMinMax(randomNumbers);

        // Display the results
        System.out.println("Generated 4-digit random numbers:");
        for (int num : randomNumbers) {
            System.out.println(num);
        }

        System.out.println("\nResults:");
        System.out.printf("Average: %.2f\n", results[0]);
        System.out.println("Minimum: " + (int)results[1]);
        System.out.println("Maximum: " + (int)results[2]);
   }
}