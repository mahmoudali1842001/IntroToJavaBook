
package Chapter2.Exercises;
import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of pounds: ");
        double pounds=input.nextDouble();
        double kilos=pounds*0.454;
        System.out.println(pounds+" pounds are "+kilos+" kilos.");
    }
}
