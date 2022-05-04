
package Chapter2.Exercises;
import java.util.Scanner;

public class Problem_22 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the amount of cents: ");
        int money=input.nextInt();
        int dollars=money/100;
        int cents=money%100;
        System.out.println(money+" cents are: "+dollars+" dollars, and "+cents+" cents.");
    }
}
