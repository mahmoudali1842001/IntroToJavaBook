
package Chapter2.Exercises;
import java.util.Scanner;

public class Problem_16 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the length of the side: ");
        double side=input.nextDouble();
        double area=3.0*Math.sqrt(3)*side*side/2.0;
        System.out.println("The area of the hexagon is "+area);
    }
}
