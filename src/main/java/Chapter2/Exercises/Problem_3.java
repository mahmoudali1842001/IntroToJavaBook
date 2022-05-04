
package Chapter2.Exercises;
import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of feet: ");
        double feet=input.nextDouble();
        double meter=feet*0.305;
        System.out.println(feet+" feet is "+meter+" meters.");
    }
}
