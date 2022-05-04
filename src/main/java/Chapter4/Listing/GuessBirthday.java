
package Chapter4.Listing;
import java.util.Scanner;

public class GuessBirthday {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        String set1="1 3 5 7  11 13 15 17 19 21 23 25 27 29 31";
        String set2="2 3 6 7 10 11 14 15 18 19 22 23 26 27 30 31";
        String set3="4 5 6 7 12 13 14 15 20 21 22 23 28 29 30 31";
        String set4="8 9 10 11 12 13 14 15 24 25 26 27 28 29 30 31";
        String set5="16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31";
        
        int month=0;
        System.out.println("in set1 ? ");
        System.out.println(set1);
        int day=input.nextInt();
        if(day==1) month+=1;
        
        System.out.println("in set2 ? ");
        System.out.println(set2);
        day=input.nextInt();
        if(day==1) month+=2;
        
        System.out.println("in set3 ? ");
        System.out.println(set3);
        day=input.nextInt();
        if(day==1) month+=4;
        
        System.out.println("in set4 ? ");
        System.out.println(set4);
        day=input.nextInt();
        if(day==1) month+=8;
        
        System.out.println("in set5 ? ");
        System.out.println(set5);
        day=input.nextInt();
        if(day==1) month+=16;   
        
        System.out.println("month: "+ month);
    }
}
