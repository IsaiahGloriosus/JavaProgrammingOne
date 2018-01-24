package Chapter7;

import java.util.Scanner;

/**
 * Program to assign and display letter grades from each student
 *
 * @author Anthony Rodriguez
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int s = input.nextInt();
        int[] scores = new int[s];

        System.out.println("Enter test scores: ");
        for (int i = 0; i < s; i++) {
            scores[i] = input.nextInt();
        }

        double max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= (max - 10)) {
                System.out.println("Student " + i + "score is " + scores[i]
                        + "and grade is A");
            } else if (scores[i] >= (max - 20)) {
                System.out.println("Student " + i + "score is " + scores[i]
                        + "and grade is B");
            } else if (scores[i] >= (max - 30)) {
                System.out.println("Student " + i + "score is " + scores[i]
                        + "and grade is C");
            } else if (scores[i] >= (max - 40)) {
                System.out.println("Student " + i + "score is " + scores[i]
                        + "and grade is D");
            } else {
                System.out.println("Student " + i + "score is " + scores[i]
                        + "and grade is F");
            }
        }
    }
}
