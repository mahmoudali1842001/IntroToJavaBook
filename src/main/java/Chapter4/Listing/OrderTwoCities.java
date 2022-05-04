
package Chapter4.Listing;
import java.util.Scanner;
public class OrderTwoCities {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first city: ");
        String firstCity=input.nextLine();
        System.out.println("Enter second city: ");
        String secondCity=input.nextLine();
        System.out.print("cities order: ");
        if(firstCity.compareTo(secondCity)<=0) System.out.print(firstCity + " " + secondCity);
        else System.out.print(secondCity + " " + firstCity);
    }
}
