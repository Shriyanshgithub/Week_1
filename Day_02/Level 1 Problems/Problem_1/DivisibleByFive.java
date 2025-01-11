import java.util.Scanner;
public class DivisibleByFive {
    public static void main(String[] args) {
       //Scanner class
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        //take input from user
        int number = input.nextInt();
        if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5.");
        } else {
            System.out.println(number + " is not divisible by 5.");
        }
        input.close(); //close the file or input stream that input was reading
    }
}
