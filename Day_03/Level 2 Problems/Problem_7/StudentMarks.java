import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        double[][] marks = new double[numStudents][3]; 
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1));

            // Input marks for Physics, Chemistry, and Maths for each student
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                do {
                    System.out.print("Enter " + subject + " marks (out of 100): ");
                    marks[i][j] = scanner.nextDouble();
                    if (marks[i][j] < 0 || marks[i][j] > 100) {
                        System.out.println("Please enter valid marks between 0 and 100.");
                    }
                } while (marks[i][j] < 0 || marks[i][j] > 100);
            }

            // Calculate percentage
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300) * 100;

            // Calculate grade based on percentage
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 60) {
                grades[i] = "B";
            } else if (percentages[i] >= 40) {
                grades[i] = "C";
            } else {
                grades[i] = "D";
            }
        }

        // Display the marks, percentage, and grades of each student
        System.out.println("\nDetails of all students:");
        System.out.printf( "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf( (i + 1) + “, ”  marks[i][0] + “, ” + marks[i][1] + “, ” + marks[i][2] + “, ”  + percentages[i] + “, ” + grades[i]);
        }

        // Close the scanner
        scanner.close();
    }
}