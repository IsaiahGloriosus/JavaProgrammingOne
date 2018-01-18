package Chapter5;

import java.util.Scanner;

/**
 * Program to display the total number of "yes" votes, "no" votes, invalid
 * votes, and total votes
 *
 * @author Anthony Rodriguez
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 'Y' to vote yes, 'N' to vote no, 'Q' to quit "
                + "voting.");
        String string1 = input.nextLine();
        char vote = string1.charAt(0);
        int yesVotes = 0;
        int noVotes = 0;
        int invalidVotes = 0;

        while ((vote != 'Q') && (vote != 'q')) {
            if ((vote == 'Y') || (vote == 'y')) {
                yesVotes++;
            } else if ((vote == 'N') || (vote == 'n')) {
                noVotes++;
            } else {
                System.out.println("INVALID CODE: ");
                invalidVotes++;
            }
            System.out.println("Enter 'Y' to vote yes, 'N' to vote no, 'Q' to quit "
                    + "voting.");
            string1 = input.nextLine();
            vote = string1.charAt(0);
        }
        int totalVotes = yesVotes + noVotes + invalidVotes;
        System.out.println("The number of 'yes' votes is " + yesVotes + ", the "
                + "number of 'no' votes is " + noVotes + ", the total number of "
                + "invalid votes is " + invalidVotes + " and the total number "
                + "of votes is " + totalVotes);
    }
}
