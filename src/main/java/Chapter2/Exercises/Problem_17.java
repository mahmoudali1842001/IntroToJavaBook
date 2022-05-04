
package Chapter2.Exercises;
import java.util.Scanner;

public class Problem_17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58F and 41°F: ");
        double fahrenheit=input.nextDouble();
        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        double speed=input.nextDouble();
        double temp=35.74 + 0.6215*fahrenheit - 35.75*Math.pow(speed, 0.16) + 0.4275*fahrenheit*Math.pow(speed, 0.16);
        System.out.print("The wind chill index is "+temp);
        
    }
}
