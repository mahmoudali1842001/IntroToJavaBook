
package Chapter2.Exercises;
import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the subtotal and gratuityrate: ");
        double subtotal=input.nextDouble();
        double gratuityrate=input.nextDouble();
        double gratuity=(gratuityrate/100)*subtotal;
        double total=subtotal+gratuity;
        System.out.println("gratuity is: "+gratuity);
        System.out.println("total is "+ total);
    }
}
