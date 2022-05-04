
package Chapter2.Exercises;
import java.util.Scanner;

public class Problem_20 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter balance and interest rate: ");
        double balance=input.nextDouble();
        double interestrate=input.nextDouble();
        double interest=balance*(interestrate/1200.0);
        System.out.println("The interest is "+interest);
    }
}
