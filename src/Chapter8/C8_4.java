package Chapter8;

/**
 * Program that displays employees and their total hours
 *
 * @author Anthony Rodriguez
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        char[][] days = {
            {' ', ' ', 'S', 'M', 'T', 'W', 'T', 'F', 'S', 'T'}};
        int[][] matrix = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}};
        for (int row = 0; row < days.length; row++) {
            for (int column = 0; column < days[row].length; column++) {
                System.out.print("\t" + days[row][column]);
            }
            System.out.println();
        }
        int total = 0;
        for (int row = 0; row < matrix.length; row++) {
            System.out.print("\t" + "employee " + row);
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print("\t" + matrix[row][column] + " ");
                total += matrix[row][column];
            }
            System.out.println("\t" + total);
            total = 0;
        }
    }
}
