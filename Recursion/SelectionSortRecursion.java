import java.util.Arrays;

public class SelectionSortRecursion {
    public static void main(String[] args) {
        int[] array = {4, 5, 8, 7, 2};
        sort(array, array.length, 0, 0);
        System.out.println(Arrays.toString(array));
    }

    static void sort(int[] arr, int row, int col, int max) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            if (arr[col] > arr[max]) {
                sort(arr, row, col + 1, col);
            }
            else {
                sort(arr, row, col + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] = temp;
            sort(arr, row - 1, 0, 0);
        }
    }
}
