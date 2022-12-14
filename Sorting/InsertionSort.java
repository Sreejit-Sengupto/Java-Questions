import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {4, 5, 1, 2, 3};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) /* We keep checking on the left if the element on the left is smaller we swap, else we break because the elements on the left are already sorted. */ {
                if (arr[j] < arr[j - 1]) {
                    SelectionSort.swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
}
