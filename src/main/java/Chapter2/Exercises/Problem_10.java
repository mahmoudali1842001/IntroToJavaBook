
package Chapter2.Exercises;
import java.util.Scanner;

public class Problem_10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double water=input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initialtemp=input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finaltemp=input.nextDouble();
        double energy=water*(finaltemp-initialtemp)*4184;
        System.out.print("The energy needed is "+energy);
        
        
    }
}
