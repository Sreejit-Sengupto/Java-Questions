/* *** QUESTION ***
    Calculate the sum of diagonal of the user entered Matrix.
*/
import java.util.Arrays;
import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        /* Input the Matrix from the user. */
        Scanner input = new Scanner (System.in);
        System.out.println("SQUARE MATRIX ONLY!!");
        System.out.print("Enter the size of Row and Column of the Array: ");
        int row = input.nextInt();
        int[][] array = new int[row][row];
        System.out.println("Enter your elements: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Entering element in" + " " + i + " " + "row and" + " " + j + " " + "column");
                array[i][j] = input.nextInt();
            }
        }

        /* Displaying the entered Matrix. */
        System.out.println("Your entered Array is: ");
        for (int[] element : array) {
            System.out.println(Arrays.toString(element));
        }

        /* Printing the sum. */
        System.out.println(diagonalSum(array, 3));
    }

    static int diagonalSum (int[][] mat, int row) {
        int sum = 0;
        int midIndex = (mat.length - 1)/2; // Getting the middle element in the Matrix.
        if (row % 2 == 0) /* If it is matrix with even numbers of row and columns then there will be no common middle element */ {
            sum = mainDiagonalSum(mat) + offDiagonalSum(mat);
            System.out.println("Sum of the diagonal elements of the entered Array is: " + sum);
        } else {
            sum = mainDiagonalSum(mat) + offDiagonalSum(mat) - mat[midIndex][midIndex]; // Removing the common middle element.
            System.out.println("Sum of the diagonal elements of the entered Array is: " + sum);
        }
        return sum;
    }
    static int mainDiagonalSum (int[][] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i][i]; // The row and column value of the main diagonal is always the same.
        }
        return sum;
    }

    static int offDiagonalSum (int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][(arr.length - 1) - i]; // In off diagonal the value of column is the array length - 1 - the value of the row.
        }
        return sum;
    }
}
