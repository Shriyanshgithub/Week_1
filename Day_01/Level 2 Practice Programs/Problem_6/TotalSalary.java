import java.util.Scanner;
public class TotalSalary{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
	int SALARY = sc.nextInt();
	int BONUS = sc.nextInt();
	int TOTAL = SALARY + BONUS;
  System.out.println("The salary is INR " + SALARY + " and bonus is INR " + BONUS + " . Hence Total Income is INR " + TOTAL); 
}
}