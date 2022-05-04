
package Chapter2.Listing;

import java.util.Scanner;


public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double Fahrenheit=input.nextDouble();
        System.out.println("degree in celsius is: "+ (5.0/9)*(Fahrenheit-32.0));
    }
}
