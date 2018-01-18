package Chapter4;

import java.util.Scanner;

/**
 * Program to display whether or not one string is a substring of the other
 * string
 *
 * @author Anthony Rodriguez
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string s1: ");
        String string1 = input.nextLine();
        System.out.println("Enter string s2: ");
        String string2 = input.nextLine();

        if (string1.contains(string2)) {
            System.out.println(string2 + "is a substring of" + string1);
        } else {
            System.out.println(string2 + "is not a substring of" + string1);
        }
    }
}
