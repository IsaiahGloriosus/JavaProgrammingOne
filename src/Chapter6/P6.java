package Chapter6;

import java.util.Scanner;

/**
 * Program to convert Dollars to Euros, Pounds, or Yen
 *
 * @author Anthony Rodriguez
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many Euros does a dollar buy? ");
        double E = input.nextDouble();
        System.out.println("How many Pound Sterling does a dollar buy? ");
        double P = input.nextDouble();
        System.out.println("How many Yen does a dollar buy? ");
        double Y = input.nextDouble();

        String response = "";
        do {
            System.out.println("Please enter the number of dollars you want"
                    + " to convert: ");
            double dollars = input.nextDouble();
            System.out.println("Enter 'E' to buy Euros, 'P' to buy Pounds "
                    + "or 'Y' to buy Yen: ");
            String money = input.next();
            if (money.equalsIgnoreCase("E")) {
                double e = calculate(dollars, E);
                System.out.printf("For %.2f dollars, you will get %.2f euros", dollars, e);
            } else if (money.equalsIgnoreCase("P")) {
                double p = calculate(dollars, P);
                System.out.printf("For %.2f dollars, you will get %.2f pounds", dollars, p);
            } else if (money.equalsIgnoreCase("Y")) {
                double y = calculate(dollars, Y);
                System.out.printf("For %.2f dollars, you will get %.2f yen", dollars, y);
            }

            do {
                System.out.println("Are there more conversions to perform: ");
                response = input.next();

                while (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")) {
                    System.out.println("Enter 'yes' to continue or 'no' to stop: ");
                    response = input.next();
                }

            } while (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no"));

        } while (!response.equalsIgnoreCase("no"));

    }

    /**
     * Method to convert currency to dollars
     *
     * @param dollars the amount of dollars we are converting
     * @param currency the currency we are converting
     * @return the amount of dollars the currency is equivalent to
     */
    public static double calculate(double dollars, double currency) {
        if (dollars > 100) {
            return (dollars * 0.95 * currency);
        } else {
            return (dollars * 0.90 * currency);
        }
    }
}
