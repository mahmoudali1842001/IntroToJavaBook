
package Chapter2.Exercises;
import java.util.Scanner;

public class Problem_23 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the driving distance:");
        double distance=input.nextDouble();
        System.out.print("Enter miles per gallon:");
        double efficiency=input.nextDouble();
        double gallons=distance/efficiency;
        System.out.print("Enter price per gallon: ");
        double gallonprice=input.nextDouble();
        double totalprice=gallons*gallonprice;
        System.out.println("The cost of driving is "+totalprice);
    }
}
