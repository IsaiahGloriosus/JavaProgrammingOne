package Chapter3;

import java.util.Scanner;

/**
 * Program to display the user's guess on whether the flip of a coin will result
 * in heads or tail
 *
 * @author Anthony Rodriguez
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int integer1 = (int) (Math.random() * 2);
        Scanner input = new Scanner(System.in);
        System.out.println("Heads or Tails? Type 0 for Heads, and 1 for Tails.");
        int guess = input.nextInt();

        if (guess == integer1) {
            System.out.println("Your guess is correct");
        } else {
            System.out.println("Your guess is incorrect");
        }
    }
}
