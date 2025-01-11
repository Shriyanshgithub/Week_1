import java.util.Scanner;
public class Maths{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int RES_1 = A + B * C;
    int RES_2 = A * B + C;
    int RES_3 = C + A / B;
    int RES_4 = A % B + C;   
  System.out.println("The results of Int Operations are "+ RES_1 +" ,"+ RES_2 +" , "+ RES_3 +" and " + RES_4);
}
}