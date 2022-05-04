
package Chapter4.Listing;

public class FormatDemo {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n","Degrees","Radians","Sine","Cosine","Tanegnt");
        int degree=30;
        System.out.printf("%-10s%-10.4f%-10.4f%-10.4f%-10.4f\n",degree,Math.toRadians(degree),Math.sin(Math.toRadians(degree)),
                            Math.cos(Math.toRadians(degree)),Math.tan(Math.toRadians(degree)));
        
        degree=60;
        
        System.out.printf("%-10s%-10.4f%-10.4f%-10.4f%-10.4f\n",degree,Math.toRadians(degree),Math.sin(Math.toRadians(degree)),
                            Math.cos(Math.toRadians(degree)),Math.tan(Math.toRadians(degree)));
    }
}