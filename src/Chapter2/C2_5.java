package Chapter2;

import java.util.Scanner;

/**
 * Program to display the gratuity and total
 *
 * @author Anthony Rodriguez
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityrate = input.nextDouble();
        double x = gratuityrate / 100;
        double gratuity = subtotal * x;
        double total = subtotal + gratuity;
        System.out.println("The gratuity is $" + gratuity + "and total is $" + total);
    }
}
