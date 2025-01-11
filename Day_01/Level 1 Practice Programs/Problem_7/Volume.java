import java.util.*;
public class Volume{
public static void main(String args[]){
 int radius = 6378;
 double radiusInMiles = radius * 1.6;
 double volumeInKm = (4/3)* 3.14 * Math.pow(radius,3);
 double volumeInmiles = (4/3)* 3.14 * Math.pow(radiusInMiles,3);
 System.out.println("The volume of earth in cubic kilometers is " + volumeInKm + " and cubic miles is " + volumeInmiles);

}
}