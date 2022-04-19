
package Chapter2.Exercises;
import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a degree in celsius: ");
        double celsius=input.nextDouble();
        double fahrenheit=(9.0/5)*celsius+32;
        System.out.println(celsius+" celsius is "+fahrenheit+" fahrenheit.");
              
    }
            
}
