package Chapter7;

import java.util.Scanner;

/**
 * Program to output the smallest number out of a list of other numbers
 *
 * @author Anthony Rodriguez
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[] values = new double[10];
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextDouble();
        }
        double smallest = values[0];
        System.out.println("The minimum number is: " + min(values, smallest));
    }

    /**
     * Method that will find the smallest element in a double array
     *
     * @param array the array of double values
     * @param min the smallest value
     * @return the smallest value
     */
    public static double min(double[] array, double min) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        return min;
    }
}
