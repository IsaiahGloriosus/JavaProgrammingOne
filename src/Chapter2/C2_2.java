package Chapter2;

import java.util.Scanner;

/**
 * Program to display the area and volume of a cylinder
 *
 * @author Anthony Rodriguez
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = radius * radius * 3.14;
        double volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
