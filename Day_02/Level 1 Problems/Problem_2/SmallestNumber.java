import java.util.Scanner;
public class SmallestNumber {
    public static void main(String[] args) {
       //Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
       //Take input 1 from user
        int number1 = scanner.nextInt();
        System.out.print("Enter second number: ");
       //Take input 2 from user
        int number2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        //Take input 3 from user
        int number3 = scanner.nextInt();
        if (number1 <= number2 && number1 <= number3) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }
        //close scanner object
        scanner.close();
    }
}
