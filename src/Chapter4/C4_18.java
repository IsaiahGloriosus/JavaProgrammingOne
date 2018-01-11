package Chapter4;

import java.util.Scanner;
    
/**
 * Program to display the major and status as determined by the user
 *
 * @author Anthony Rodriguez
 */
public class C4_18 {
    
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter two characters: ");
        String string1 = input.nextLine();
        char char1 = string1.charAt(0);
        String string2 = input.nextLine();
        char char2 = string2.charAt(0);
        
        if ((char2 != '1') && (char2 != '3') && (char2 != '2') && 
                (char2 != '4')) {
            System.out.println("Invalid input");
            System.exit(0);
        }
        
        switch (char1) {
            case 'M': System.out.println("Mathematics");
                    break;
            case 'C': System.out.println("Computer Science");
                    break;
            case 'I': System.out.println("Information Technology");
                    break;
            default: System.out.println("Invalid input");
                    System.exit(0);
                    break;
        }
        
        switch (char2) {
            case '1': System.out.println("Freshman");
                    break;
            case '2': System.out.println("Sophomore");
                    break;
            case '3': System.out.println("Junior");
                    break;
            case '4': System.out.println("Senior");
                    break;
        }
    }
}
