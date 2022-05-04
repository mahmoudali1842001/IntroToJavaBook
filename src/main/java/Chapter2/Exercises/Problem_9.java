
package Chapter2.Exercises;
import java.util.Scanner;

public class Problem_9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the initial and final velocities and elapsed time: ");
        double initialvelocity=input.nextDouble();
        double finalvelocity=input.nextDouble();
        double time=input.nextDouble();
        double acceleration=(finalvelocity-initialvelocity)/time;
        System.out.println("Acceleration is: "+(int)(acceleration*1000.0)/1000.0);
                
        
    }
}
