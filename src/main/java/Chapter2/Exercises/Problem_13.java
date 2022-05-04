
package Chapter2.Exercises;
import java.util.Scanner;
     
public class Problem_13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the monthly saving amount: ");
        double money=input.nextDouble();
         money=money*0.00417+100;
         System.out.println("After the sixth month, the account value is $"+money);
         money+=100;
         money+=money*0.00417;
         System.out.println("After the sixth month, the account value is $"+money);
         money+=100;
         money+=money*0.00417;
         System.out.println("After the sixth month, the account value is $"+money);
         money+=100;
         money+=money*0.00417;
         money+=100;
         money+=money*0.00417;
         money+=100;
         money+=money*0.00417;
         
        System.out.println("After the sixth month, the account value is $"+money);
    }
}
