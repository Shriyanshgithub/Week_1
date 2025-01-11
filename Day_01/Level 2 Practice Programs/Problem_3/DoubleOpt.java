import java.util.Scanner;
public class DoubleOpt{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  double A = sc.nextDouble();
  double B = sc.nextDouble();
  double C = sc.nextDouble();
  double RES_1 = A + B * C;
  double RES_2 = A * B + C;
    double RES_3 = C + A / B;
    double RES_4 = A % B + C;	
System.out.println("The results of Int Operations are "+ RES_1 +" ,"+ RES_2 +" , "+ RES_3 +" and "+ RES_4);
}
}