
package Chapter2.Exercises;
import java.util.Scanner;

public class Problem_21 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double amount=input.nextDouble();
        System.out.print("Enter annual interest rate in percentage:");
        double rate=input.nextDouble();
        System.out.print("Enter number of years: ");
        double years=input.nextDouble();
        double futurevalue=amount*Math.pow(1+(rate/1200),12*years);
        System.out.println("Future value is "+futurevalue);
    }
}
