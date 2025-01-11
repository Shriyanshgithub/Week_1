import java.util.*;

public class Bonus {
	public static void main(String[] args){
		final String name = "Zara";
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		int years = sc.nextInt();
		if(years > 5){
			int bonus = salary * 5/100;
			System.out.println("Salary with bonus is: " + salary + bonus);
		}else{
			System.out.println("Not eligible for bonus");
		}
	}
}