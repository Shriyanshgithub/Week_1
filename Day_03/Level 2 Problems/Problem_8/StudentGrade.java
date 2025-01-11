import java.util.*;
public class StudentGrade{
public static void main(String args[]){
 Scanner scanner = new Scanner(System.in);
 int student = scanner.nextInt();
 
double[] physics = new double[student];
double[] chemistry = new double[student];
double[] math = new double[student];

double[] percentage = new double[student];
String[] grades = new String[student];

for(int i=0; i<student; i++){

 System.out.println("Enter the marks of student " + (i+1) + " in Physics");
 physics[i] = scanner.nextDouble();
 while (physics[i] < 0) {
                System.out.print("Invalid marks. Enter positive value: ");
                physics[i] = scanner.nextDouble();
            }

 
 System.out.println("Enter the marks of student " + (i+1) + " in Chemistry");
 chemistry[i] = scanner.nextDouble();

  while (chemistry[i] < 0) {
                System.out.print("Invalid marks. Enter positive value: ");
                chemistry[i] = scanner.nextDouble();
            }
 
 System.out.println("Enter the marks of student " + (i+1) + " in Math");
 math[i] = scanner.nextDouble();

  while (math[i] < 0) {
                System.out.print("Invalid marks. Enter positive value: ");
                math[i] = scanner.nextDouble();
            }

  percentage[i] = (physics[i] + chemistry[i] + math[i])/3;
  System.out.println("Percentage of Student" + (i+1)+ " is " + percentage[i]);
  
    if (percentage[i] >= 80) {
                grades[i] = "A";
            } else if (percentage[i] >= 70) {
                grades[i] = "B";
            } else if (percentage[i] >= 60) {
                grades[i] = "C";
            } else if (percentage[i] >= 50) {
                grades[i] = "D";
            } else if (percentage[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
}
 
 for(int i=0; i<student; i++){
  System.out.printf("Student "+ (i + 1)+ " physics mark " +  physics[i] + " chemistry mark " + chemistry[i] + "math mark " +  math[i] + " Percentage " +  percentage[i] + "grade " + grades[i]);
  }
 }
} 

