package Chapter3;

import java.util.Scanner;

/**
 * Program to display which number is greater than, less than, or equal to the
 * other number, among other things
 *
 * @author Anthony Rodriguez
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double firstnumber = input.nextDouble();
        double secondnumber = input.nextDouble();

        if (firstnumber < secondnumber) {
            System.out.println("The first number is less than the second.");
        }
        if (firstnumber > secondnumber) {
            System.out.println("The first number is greater than the second.");
        }
        if (firstnumber == secondnumber) {
            System.out.println("The first number is equal to the second.");
        }
        if (firstnumber <= secondnumber) {
            System.out.println("The first number is less than or equal to the second.");
        }
        if (firstnumber != secondnumber) {
            System.out.println("The first number is not equal to the second.");
        }

        if (secondnumber == 0) {
            System.out.println("Cannot divide by zero.");
        } else if ((firstnumber / secondnumber) < 1) {
            System.out.println("Proper fraction");
        } else {
            System.out.println("improper fraction.");
        }

        if (firstnumber >= 90) {
            System.out.println("A");
        } else if (firstnumber >= 80) {
            System.out.println("B");
        } else if (firstnumber >= 70) {
            System.out.println("C");
        } else if (firstnumber >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        if ((secondnumber >= 1) && (secondnumber <= 100)) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
    }
}
