package Chapter7;

import java.util.Scanner;

/**
 * Program to determine if two lists are strictly identical or not
 *
 * @author Anthony Rodriguez
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter list1: ");
        int one = input.nextInt();
        int[] firstlist = new int[one];
        for (int i = 0; i < one; i++) {
            firstlist[i] = input.nextInt();
        }
        System.out.println("Enter list2: ");
        int two = input.nextInt();
        int[] secondlist = new int[two];
        for (int i = 0; i < two; i++) {
            secondlist[i] = input.nextInt();
        }
        equals(firstlist, secondlist);
    }

    /**
     * Method will return true if both lists are identical or false if they are
     * not
     *
     * @param list1 first list of integers
     * @param list2 second list of integers
     * @return true if lists are identical; false if lists are not
     */
    public static boolean equals(int[] list1, int[] list2) {
        if (java.util.Arrays.equals(list1, list2)) {
            System.out.println("Two lists are strictly identical");
            return true;
        } else {
            System.out.println("Two lists are not strictly identical");
            return false;
        }
    }
}
