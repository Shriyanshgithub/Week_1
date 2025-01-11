import java.util.*;
public class CalculateBonus{
 public static void main(String args[]){
  //Scanner class 
  Scanner sc = new Scanner(System.in);
   //create an array of service year
  double[] serviceYear = new double[10];
   //create an array of old salary year
  double[] oldSalary = new double[10];
   //create an array of bonus amount
  double[] bonusAmount = new double[10];
   //create an array of new salary
  double[] newSalary = new double[10];
 
   for(int i=0; i< 10; i++){
   System.out.println("Enter the year of sevice of "+(i+1) + " employee");
   serviceYear[i] = sc.nextDouble();
   System.out.println("Enter the salary "+(i+1) + " employee");
   oldSalary[i] = sc.nextDouble();
   }
   
   for(int i=0; i< serviceYear.length ; i++){
    if(serviceYear[i] >= 5){
	 bonusAmount[i] = (oldSalary[i] * 5)/100;
	 newSalary[i] = bonusAmount[i] + oldSalary[i];
	 }
	 else if(serviceYear[i] < 5){
	 bonusAmount[i] = (oldSalary[i] * 2)/100;
	 newSalary[i] = bonusAmount[i] + oldSalary[i];
	 }
	 }
	 
	 
	 double totalBonus = 0 , totalOldSalary = 0 , totalNewSalary = 0;
	 for(int i=0; i<10; i++){
	 totalBonus = totalBonus + bonusAmount[i];
	 totalOldSalary = totalOldSalary + oldSalary[i];
	 totalNewSalary = totalNewSalary + newSalary[i];
	 }
	 System.out.println("Total bonus of employees is " + totalBonus);
	 System.out.println("Total old salary of employees is " + totalOldSalary);
	 System.out.println("Total new salary of employees is " + totalNewSalary);
	}
}	
   
  