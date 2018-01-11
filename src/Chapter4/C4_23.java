package Chapter4;
    
import java.util.Scanner;

/**
 * Program to display a payroll statement based on user input
 *
 * @author Anthony Rodriguez
 */
public class C4_23 {
    
    /**
     * Main Method
     * 
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter employee's first name: ");
        String name = input.nextLine();
        System.out.println("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.println("Enter hourly pay rate: ");
        double payrate = input.nextDouble();
        System.out.println("Enter federal tax withholding: ");
        double federaltax = input.nextDouble();
        System.out.println("Enter state tax withholding rate: ");
        double statetax = input.nextDouble();
        
        double grosspay = hours * payrate;
        double deduction1 = grosspay * federaltax;
        double deduction2 = grosspay * statetax;
        double totaldeduction = deduction1 + deduction2;
        double netpay = grosspay - totaldeduction;
        System.out.println("Employee Name: " + name);
        System.out.printf("Hours worked: %4.2f %n", hours);
        System.out.printf("Pay rate: $%4.2f %n", payrate);
        System.out.printf("Gross pay: $%4.2f %n", grosspay);
        System.out.printf("Deductions:  %n");
        System.out.printf("  Federal Withholding: $%4.2f %n", deduction1);
        System.out.printf("  State Withholding: $%4.2f %n", deduction2);
        System.out.printf("  Total Deduction: $%4.2f %n", totaldeduction);
        System.out.printf("Net Pay: $%4.2f %n", netpay);
    }
}
