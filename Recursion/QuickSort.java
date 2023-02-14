import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {5,7,6,3,1,2,4};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int mid = start  + (end - start) / 2;
        int pivot = arr[mid];

        /* Getting the pivot to the correct position */
        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }

            while (arr[end] > pivot) {
                end--;
            }

            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

            quickSort(arr, low, end);
            quickSort(arr, start, high);
        }
    }
}
