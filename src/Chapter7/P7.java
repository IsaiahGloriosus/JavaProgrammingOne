package Chapter7;

import java.util.Scanner;

/**
 * Program to display the average of a list of double values inputed by the user
 *
 * @author Anthony Rodriguez
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("How many numbers will be read: ");
        int s = input.nextInt();
        int[] myArray = new int[s];
        arrayFill(myArray);
        double myAverage = 0;
        System.out.println("The average is " + arrayAverage(myArray, myAverage));
        printArray(myArray);
    }

    /**
     * Method to fill the array
     *
     * @param array list of double values
     */
    public static void arrayFill(int[] array) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter 5 elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
    }

    /**
     * Method to calculate average of the array
     *
     * @param array list of double values
     * @param average average value of the array
     * @return the average of the array
     */
    public static double arrayAverage(int[] array, double average) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        average = total / array.length;
        return average;
    }

    /**
     * Method to print array
     *
     * @param array list of double values
     */
    public static void printArray(int[] array) {
        System.out.println("The contents of the array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
