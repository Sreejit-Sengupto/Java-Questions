import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {4, 5, 1, 2, 3};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - 1 - i; // Get the last index for the largest element to be placed.
            int maxIndex = getMax(arr, 0, lastIndex); // Get the index of the largest element.
            swap(arr, maxIndex, lastIndex); // Swap the values.
        }
    }

    static void swap(int[] arr, int first, int end) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[first];
            arr[first] = arr[end];
            arr[end] = temp;
        }
    }

    static int getMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[start]) {
                max = i;
            }
        }
        return max;
    }
}
