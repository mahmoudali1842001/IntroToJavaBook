
package Chapter2.Listing;
import java.util.Scanner;


public class ComputeArea {
    
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double radius=input.nextDouble();
        double area  = radius*radius*3.14159;
        
        System.out.println("area of circle with radius: "+radius+" is: "+area);
    }
    
  
    
}
