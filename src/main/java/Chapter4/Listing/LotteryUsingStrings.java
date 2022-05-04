
package Chapter4.Listing;
import java.util.Scanner;

public class LotteryUsingStrings {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        String lottery=(""+(int)(Math.random()*10)+(int)(Math.random()*10));
        lottery="16";
        System.out.print("Enter two digit guess: ");
        String guess=input.next();
        System.out.println("lottery number is: "+ lottery);
        if(lottery.equals(guess))
            System.out.println("Exact match: you win $10000.");
        else if(lottery.charAt(0)==guess.charAt(1)&&lottery.charAt(1)==guess.charAt(0))
            System.out.println("Match all digits: you win $3000.");
        else if(lottery.charAt(0)==guess.charAt(0)||
                lottery.charAt(0)==guess.charAt(1)||
                lottery.charAt(1)==guess.charAt(0)||
                lottery.charAt(1)==guess.charAt(1)
                )
            System.out.println("Match one digit: you win $1000");
        else 
            System.out.println("Sorry: No match");
        
        
    }
}
