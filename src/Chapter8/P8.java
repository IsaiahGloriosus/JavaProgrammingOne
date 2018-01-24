package Chapter8;

import java.util.Scanner;

/**
 * Program to display a two-dimensional array of employees and how much they
 * earned each day
 *
 * @author Anthony Rodriguez
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[][] salesmen = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0}};
        char input1 = ' ';
        char input2 = ' ';
        String input3 = " ";
        int row = 0;
        int column = 0;
        do {
            System.out.println("Enter the salesmen ID as A, B, C, or D ");
            input1 = input.next().charAt(0);
            System.out.println("Enter the day as M, T, W, T, F ");
            input2 = input.next().charAt(0);
            if ((input1 == 'A') && (input2 == 'M')) {
                row = 0;
                column = 0;
            } else if ((input1 == 'A') && (input2 == 'T')) {
                row = 0;
                column = 1;
            } else if ((input1 == 'A') && (input2 == 'W')) {
                row = 0;
                column = 2;
            } else if ((input1 == 'A') && (input2 == 'T')) {
                row = 0;
                column = 3;
            } else if ((input1 == 'A') && (input2 == 'F')) {
                row = 0;
                column = 4;
            } else if ((input1 == 'B') && (input2 == 'M')) {
                row = 1;
                column = 0;
            } else if ((input1 == 'B') && (input2 == 'T')) {
                row = 1;
                column = 1;
            } else if ((input1 == 'B') && (input2 == 'W')) {
                row = 1;
                column = 2;
            } else if ((input1 == 'B') && (input2 == 'T')) {
                row = 1;
                column = 3;
            } else if ((input1 == 'B') && (input2 == 'F')) {
                row = 1;
                column = 4;
            } else if ((input1 == 'C') && (input2 == 'M')) {
                row = 2;
                column = 0;
            } else if ((input1 == 'C') && (input2 == 'T')) {
                row = 2;
                column = 1;
            } else if ((input1 == 'C') && (input2 == 'W')) {
                row = 2;
                column = 2;
            } else if ((input1 == 'C') && (input2 == 'T')) {
                row = 2;
                column = 3;
            } else if ((input1 == 'C') && (input2 == 'F')) {
                row = 2;
                column = 4;
            } else if ((input1 == 'D') && (input2 == 'M')) {
                row = 3;
                column = 0;
            } else if ((input1 == 'D') && (input2 == 'T')) {
                row = 3;
                column = 1;
            } else if ((input1 == 'D') && (input2 == 'W')) {
                row = 3;
                column = 2;
            } else if ((input1 == 'D') && (input2 == 'T')) {
                row = 3;
                column = 3;
            } else {
                row = 3;
                column = 4;
            }
            System.out.println("Enter the amount of the sale ");
            salesmen[row][column] = input.nextDouble();
            System.out.println("More data? Enter Y for more or N for no");
            input3 = input.nextLine();
        } while (input3 != "N");
    }
}
