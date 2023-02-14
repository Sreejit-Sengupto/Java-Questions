import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, -1, 2};
        sort(array, array.length - 1, 0);
        System.out.println(Arrays.toString(array));
    }

    static void sort(int[] arr, int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            if (arr[col] > arr[col + 1]) {
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            sort(arr, row, col + 1);
        }
        else {
            sort(arr, row - 1, 0);
        }
    }
}
