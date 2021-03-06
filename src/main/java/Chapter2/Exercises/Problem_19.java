
package Chapter2.Exercises;
import java.util.Scanner;

public class Problem_19 {
    public static double dist(double x1,double y1,double x2,double y2)
    {
        return Math.pow((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2),0.5);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the coordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3: ");
        double x1=input.nextDouble();
        double y1=input.nextDouble();
        double x2=input.nextDouble();
        double y2=input.nextDouble();
        double x3=input.nextDouble();
        double y3=input.nextDouble();
        
        double s1=dist(x1, y1, x2, y2);
        double s2=dist(x3, y3, x2, y2);
        double s3=dist(x1, y1, x3, y3);
        
        double s=(s1+s2+s3)/2;
        double area=Math.pow(s*(s-s1)*(s-s2)*(s-s3), 0.5);
        System.out.println("The area of the triangle is "+area);
        
    }
}
