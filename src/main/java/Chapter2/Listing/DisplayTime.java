
package Chapter2.Listing;

import java.util.Scanner;


public class DisplayTime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int seconds=input.nextInt();
        int minutes=seconds/60;
        int remainingseconds=seconds%60;
        System.out.println("the current time is: "+minutes+" minutes, and "+remainingseconds+" seconds");
    }
}
