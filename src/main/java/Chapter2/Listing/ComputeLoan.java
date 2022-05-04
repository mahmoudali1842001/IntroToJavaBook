
package Chapter2.Listing;

import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the annual interset rate: ");
        double annualrate=input.nextDouble();
        System.out.println("enter number of years: ");
        int years=input.nextInt();
        System.out.println("enter loan amount: ");
        double loan=input.nextDouble();
        
        double monthlyrate=annualrate/1200;
        
        double monthlypayment=(loan*monthlyrate)/(1-(1/Math.pow(1+monthlyrate,12*years )));
        double totalpayment=monthlypayment*years*12;
        System.out.println("monthlypayment: "+monthlypayment);
        System.out.println("totalpayment: "+totalpayment);
    }
}
