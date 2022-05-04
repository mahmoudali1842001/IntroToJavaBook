
package Chapter4.Listing;
import java.util.Scanner;

public class ComputeAngles {
    public static double dist(double x1,double y1,double x2,double y2){
        return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the three points: ");
        double x1=input.nextDouble();
        double y1=input.nextDouble();
        double x2=input.nextDouble();
        double y2=input.nextDouble();
        double x3=input.nextDouble();
        double y3=input.nextDouble();
        
        double c=dist(x1, y1, x2, y2);
        double a=dist(x2, y2, x3, y3);
        double b=dist(x1, y1, x3, y3);
        
        double A=Math.toDegrees(Math.acos((a*a-b*b-c*c)/(-2*b*c)));
        double B=Math.toDegrees(Math.acos((b*b-a*a-c*c)/(-2*a*c)));
        double C=Math.toDegrees(Math.acos((c*c-b*b-a*a)/(-2*b*a)));
        
        System.out.println("A: "+ (int)(A*100)/100.0);
        System.out.println("B: "+ (int)(B*100)/100.0);
        System.out.println("C: "+ (int)(C*100)/100.0);
        
    }
}
