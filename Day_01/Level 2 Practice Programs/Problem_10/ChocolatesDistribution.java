import java.util.*;
public class ChocolatesDistribution{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int numberOfchocolates = sc.nextInt();
  int numberOfChildren = sc.nextInt();
  int result = (numberOfchocolates / numberOfChildren);
 System.out.println(" The number of chocolates each child gets is " + result + " and the number of remaining chocolates are " + (numberOfchocolates % numberOfChildren));
}
} 