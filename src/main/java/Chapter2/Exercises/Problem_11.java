
package Chapter2.Exercises;
import java.util.Scanner;

public class Problem_11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double population=312_032_486;
        System.out.println("Enter the number of years: ");
        double years=input.nextLong();
        double newpopulation=population+(60*60*24*365*years/7.0)-(60*60*24*365*years/13.0)+(60*60*24*365*years/45);
        System.out.println("The new population is "+(long)newpopulation);        
    }
}
