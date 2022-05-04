
package Chapter2.Exercises;
import java.util.Scanner;

public class Problem_14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weight=input.nextDouble();
        weight*=0.45359237;
        System.out.println("Enter height in inches: ");
        double height=input.nextDouble();
        height*=0.0254;
        double bmi=weight/(height*height);
        System.out.println("BMI is "+bmi);
        
        
    }
}
