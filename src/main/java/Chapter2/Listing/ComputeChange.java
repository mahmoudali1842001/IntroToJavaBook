
package Chapter2.Listing;

import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the amount of money: ");
        double money=input.nextDouble(); //15.56
        int remaining=(int)(money*100+1e-8); // 1556
        int dollars=remaining/100;
        remaining%=100;
        int quarters=remaining/25;
        remaining%=25;
        int dimes=remaining/10;
        remaining%=10;
        int nickles=remaining/5;
        remaining%=5;
        int cents=remaining;
        System.out.println("dollars: "+dollars);
        System.out.println("quarters:"+quarters);
        System.out.println("dimes: "+dimes);
        System.out.println("nickles: "+nickles);
        System.out.println("cents: "+cents);
        
        
        
    }
}
