
package Chapter2.Exercises;
import java.util.Scanner;

public class Problem_8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the offset from GMT: ");
        long offset=input.nextLong();
        long millis=System.currentTimeMillis();
        long seconds=millis/1000;
        long minutes=seconds/60;
        seconds%=60;
        long hours=minutes/60;
        minutes%=60;
        hours%=24;
        hours= (hours+offset)%24;
        System.out.println("current time is: "+ hours+":"+minutes+":"+seconds);
    }
}
