
package Chapter4.Listing;
import java.util.Scanner;

public class HexDigit2Dec {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter a hex digit: ");
        String s=input.next();
        if(s.length()>1) System.out.println("you must enter exatly one character.");
        else if(Character.isUpperCase(s.charAt(0))){
            if(s.charAt(0)<='F')System.out.println(s.charAt(0)-'A'+10);
            else System.out.println("invalid input.");
        }
        else 
            System.out.println(s.charAt(0));
    }
}
