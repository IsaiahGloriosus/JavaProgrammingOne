package Chapter5;

import java.util.Scanner;

/**
 * Program to display a string inputed by the user in reverse order
 *
 * @author Anthony Rodriguez
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = input.nextLine();
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println("The reversed string is: " + reverse);
    }
}
