package Chapter2;
    
import java.util.Scanner;

/**
 * Program to display the price of a meal, the tax, the tip, and the total cost
 *
 * @author Anthony Rodriguez
 */
public class P2 {
    
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of meal, price of drink, and price of desert: ");
        double meal = input.nextDouble();
        double drink = input.nextDouble();
        double desert = input.nextDouble();
        double total = meal + drink + desert;
        double tax = total * 0.10;
        double tip = (total + tax) * 0.15;
        double totalcost = total + tax + tip;
        System.out.println("The price of food is $" + total + ", the tax is $" 
                + tax + ", the tip is $" + tip + ", the total cost is $" + totalcost);
    }
}
