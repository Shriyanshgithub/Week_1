import java.util.Random;

public class VotingEligibility {

    // Method to generate random ages for n students
    public static int[] generateAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) - 10; // Generates random ages from -10 to 80
        }

        return ages;
    }

    // Method to check voting eligibility and return a 2D array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            results[i][0] = Integer.toString(age);

            if (age < 0) {
                results[i][1] = "Cannot Vote (Invalid Age)";
            } else if (age >= 18) {
                results[i][1] = "True (Can Vote)";
            } else {
                results[i][1] = "False (Cannot Vote)";
            }
        }

        return results;
    }

    // Method to display the 2D array in a tabular format
	public static void displayResults(String[][] results) {
		// Print table header
		System.out.println("Age       | Voting Eligibility");
		System.out.println("-------------------------------");

		// Print table rows
		for (String[] row : results) {
			System.out.println(row[0] + "        | " + row[1]);
		}
	}


    public static void main(String[] args) {
        int numberOfStudents = 10;

        // Generate random ages for students
        int[] ages = generateAges(numberOfStudents);

        // Check voting eligibility
        String[][] votingResults = checkVotingEligibility(ages);

        // Display the results
        displayResults(votingResults);
    }
}