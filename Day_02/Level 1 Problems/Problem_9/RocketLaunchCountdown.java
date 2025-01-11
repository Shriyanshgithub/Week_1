import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the countdown start value: ");
        int counter = input.nextInt();

        for(int i = counter ; i >= 1; i--){
            System.out.println(counter);
            counter--;
            
        }

        System.out.println("Launch!");
        input.close();
    }
}