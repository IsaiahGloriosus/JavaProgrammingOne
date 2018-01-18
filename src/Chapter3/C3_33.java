package Chapter3;

import java.util.Scanner;

/**
 * Program to display which price is better between two packages
 *
 * @author Anthony Rodriguez
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();
        double price1perpound = price1 / weight1;
        double price2perpound = price2 / weight2;

        if (price1perpound < price2perpound) {
            System.out.println("Package 1 has a better price.");
        } else if (price1perpound > price2perpound) {
            System.out.println("Package 2 has a better price.");
        } else {
            System.out.println("Two packages have the same price.");
        }
    }
}
