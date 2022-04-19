
package Chapter2.Exercises;
import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the radius and the length of the cylinder: ");
        double radius=input.nextDouble();
        double length=input.nextDouble();
        double area=Math.PI*radius*radius;
        double volume=area*length;
        System.out.println("area of the cylinder is: "+(int)((area)*100)/100.0);
        System.out.println("volume of the cylender is: "+(int)(volume*100)/100.0);
    }
}
