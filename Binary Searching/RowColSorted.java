import java.util.Arrays;

/* Binary Search in an Array sorted row and column wise */
public class RowColSorted {
    public static void main(String[] args) {
        int[][] array = {
                {10, 20, 30, 40},
                {11, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(search(array, 29)));
    }

    static int[] search(int[][] arr, int target) {
        int lb = 0;
        int ub = arr[0].length - 1;

        while (lb < arr.length && ub >= 0) {
            if (arr[lb][ub] == target) {
                return new int[]{lb, ub};
            } else if (arr[lb][ub] < target) {
                lb++;
            } else {
                ub--;
            }
        }
        return new int[]{-1, -1};
    }
}
