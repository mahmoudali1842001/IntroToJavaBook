
package Chapter2.Listing;

import java.util.Scanner;


public class ShowCurrentTime {
    public static void main(String[] args) {
        
        long totalseconds=System.currentTimeMillis();
        totalseconds/=1000;
        int seconds=(int)totalseconds%60;
        long totalminutes=totalseconds/60;
        int minutes=(int)totalminutes%60;
        long totalhours=totalminutes/60;
        int hours=(int)totalhours%24;
        
        System.out.println("time is: "+ hours+":"+minutes+":"+seconds);
    }
}
