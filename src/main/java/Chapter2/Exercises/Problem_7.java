
package Chapter2.Exercises;
import java.util.Scanner;

public class Problem_7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        double minutes=input.nextDouble();
        double days=minutes/(60*24);
        double years=days/365;
        days%=365;
        System.out.println(minutes+" minutes are "+(long)years+" years, and " +(long)days+" days!");
    }
}
