/* *** QUESTION ***
    Calculate the sum of the diagonals and return their absolute difference.
*/

public class DiagonalDifference {
    public static void main(String[] args) {
        int[][] array = {
                {11, 2, 4},
                {4, 5, 6},
                {10, 8, -12}
        };
        System.out.println(absoluteDifference(mainDiagonalSum(array), offDiagonalSum(array)));
    }

    static int absoluteDifference (int a, int b) {
        int diff = a - b;
        if (diff < 0) {
            return -diff; // Multiply by -1 if the difference is negative.
        }
        return diff;
    }

    static int mainDiagonalSum (int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
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
