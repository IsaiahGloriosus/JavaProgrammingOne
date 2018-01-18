package Chapter5;

import java.util.Scanner;

/**
 * Program that allows the user to play rock, paper, scissors with the computer
 *
 * @author Anthony Rodriguez
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int computerGuess;
        int playerGuess;
        int compCount = 0;
        int playerCount = 0;
        do {
            System.out.print("Enter scissors(0), rock(1), or paper(2):");
            playerGuess = input.nextInt();
            computerGuess = (int) (Math.random() * 3);
            switch (playerGuess) {
                case 0:
                    if (computerGuess == 0) {// it's a tie
                        System.out.println("The computer is scissors. You are scissors. It is a draw");
                    }
                    if (computerGuess == 1) {// you lose
                        System.out.println("The computer is rock. You are scissors. You lost");
                        compCount++;
                    }
                    if (computerGuess == 2) {// you win
                        System.out.println("The computer is paper. You are scissors. You win");
                        playerCount++;
                    }
                    break;
                case 1:
                    if (computerGuess == 0) {// you win
                        System.out.println("The computer is scissors. You are rock. You win");
                        playerCount++;
                    }
                    if (computerGuess == 1) {// it's a tie
                        System.out.println("The computer is rock. You are rock. It is a draw");
                    }
                    if (computerGuess == 2) {// you lose
                        System.out.println("The computer is paper. You are rock. You lost");
                        compCount++;
                    }
                    break;
                case 2:
                    if (computerGuess == 0) { // you lose
                        System.out.println("The computer is scissors. You are paper. You lost");
                        compCount++;
                    }
                    if (computerGuess == 1) {// you win
                        System.out.println("The computer is rock. You are paper. You win");
                        playerCount++;
                    }
                    if (computerGuess == 2) {// it's a tie
                        System.out.println("The computer is paper. You are paper. It is a draw");
                    }
                    break;
            }
        } while ((playerCount <= 2) && (compCount <= 2));

        if (playerCount > 2) {
            System.out.println("You won more than two times.");
        } else {
            System.out.println("The computer won more than two times");
        }
    }
}
