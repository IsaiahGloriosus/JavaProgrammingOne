package Chapter4;
    
import java.util.Scanner;

/**
 * Program to compare 2 bids for a construction project, and display the best bid
 *
 * @author Anthony Rodriguez
 */
public class P4 {
    
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args){
        String bidderOne, bidderTwo;
        int hoursWorkedOne, hoursWorkedTwo;
        double bidderOnePrice, bidderTwoPrice, costOne, costTwo;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the first bidder's name: ");
        bidderOne = input.next();
        System.out.println("Please enter the second bidder's name: ");
        bidderTwo = input.next();
        System.out.println("Please enter the first bidder's required hours: ");
        hoursWorkedOne = input.nextInt();
        System.out.println("Please enter the second bidder's required hours: ");
        hoursWorkedTwo = input.nextInt();
        System.out.println("Please enter the first bidder's hourly pay rate: ");
        bidderOnePrice = input.nextDouble();
        System.out.println("Please enter the second bidder's hourly pay rate: ");
        bidderTwoPrice = input.nextDouble();
        
        costOne = hoursWorkedOne * bidderOnePrice;
        costTwo = hoursWorkedTwo * bidderTwoPrice;
        
        if(costOne < costTwo){
            System.out.printf("Winner is %s with his total price of $%.2f", bidderOne, costOne);
        }
        else if(costOne > costTwo){
            System.out.printf("Winner is %s with his total price of $%.2f", bidderTwo, costTwo);
        }
        else if (costOne == costTwo){
            if (hoursWorkedOne < hoursWorkedTwo){
                System.out.printf("Winner is %s with his total price of $%.2f" +
                        " and his required time of %1d hours", bidderOne, costOne, hoursWorkedOne);
            }
            else if(hoursWorkedOne  > hoursWorkedTwo){
                System.out.printf("Winner is %s with his total price of $%.2f" +
                        " and his required time of %1d hours", bidderTwo, costTwo, hoursWorkedTwo);
            }
            else{
                System.out.printf("Both %s and %s have identical bids.\n" + 
                        "Their cost per hour is: $%.2f and their required time is " +
                        "%1d hours \n", bidderOne, bidderTwo, costOne, hoursWorkedOne);
            }
        }
    }
}
