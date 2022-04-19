
package Chapter2;

import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double purchaseamount=input.nextDouble();
        double tax=purchaseamount*0.06;
        System.out.println("tax is: "+ (int)(tax*100)/100.0);
    }
}
