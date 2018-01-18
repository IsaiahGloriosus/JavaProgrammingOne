package Chapter6;

import java.util.Scanner;

/**
 * Program to determine whether or not the password inputed by the user is valid
 *
 * @author Anthony Rodriguez
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = input.nextLine();
        if (isValid(password)) {
            System.out.print("Valid Password");
        } else {
            System.out.print("Invalid Password");
        }
    }

    /**
     * Method to check if the password inputed is valid or invalid
     *
     * @param password the password we are checking
     * @return valid or invalid
     */
    public static boolean isValid(String password) {
        int length = password.length();
        int counter = 0;
        if (length < 8) {
            System.out.println("A password must consist of at least eight characters");
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                System.out.println("A password must consist of only letters and digits");
                return false;
            }
        }
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                ++counter;
            }
        }
        if (counter < 2) {
            System.out.println("A password must contain at least two digits");
            return false;
        }
        return true;
    }
}
