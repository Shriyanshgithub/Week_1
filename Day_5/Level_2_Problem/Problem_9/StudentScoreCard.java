import java.util.Random;

public class StudentScoreCard {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Maths for all students
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; // 3 subjects (PCM) for each student

        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(81) + 20; // Random score between 20 and 100
            }
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateTotalAveragePercentage(int[][] scores, int numStudents) {
        double[][] results = new double[numStudents][3]; // 3 columns: total, average, percentage

        for (int i = 0; i < numStudents; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100; // out of 300 marks

            // Storing the results in the 2D array (total, average, percentage)
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Rounded to 2 decimal places
        }

        return results;
    }

    // Method to calculate grades based on percentage
    public static String[] calculateGrades(double[][] results, int numStudents) {
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            double percentage = results[i][2];

            if (percentage >= 90) {
                grades[i] = "A+";
            } else if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B+";
            } else if (percentage >= 60) {
                grades[i] = "B";
            } else if (percentage >= 50) {
                grades[i] = "C";
            } else {
                grades[i] = "F";
            }
        }

        return grades;
    }

    // Method to display the scorecard of all students
    public static void displayScoreCard(int[][] scores, double[][] results, String[] grades, int numStudents) {
        // Printing the header for the scorecard
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Grade");
        System.out.println("---------------------------------------------------------------------------------");

        // Printing the scorecard for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10s%-10d%-10d%-10d%-10.2f%-10.2f%-10s\n", 
                              "Student " + (i + 1), 
                              scores[i][0], scores[i][1], scores[i][2], 
                              results[i][0], results[i][1], 
                              grades[i]);
        }

        System.out.println("---------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        int numStudents = 5; // Number of students

        // Generate random scores for students
        int[][] scores = generateScores(numStudents);

        // Calculate total, average, and percentage
        double[][] results = calculateTotalAveragePercentage(scores, numStudents);

        // Calculate grades based on percentage
        String[] grades = calculateGrades(results, numStudents);

        // Display the scorecard
        displayScoreCard(scores, results, grades, numStudents);
    }
}
