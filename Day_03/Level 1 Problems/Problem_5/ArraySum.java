import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
		//Take input from user
		
		int number = scanner.nextInt();
		int[] arr = new int[3];
		
		for(int i=6; i<9; i++){
		arr[i-6] = number*i;
		}
		
		for(int i= 0;i<arr.length; i++){
		System.out.println(number + " * " + (i+6) + " = " + arr[i]);
		}
	}
}	
	