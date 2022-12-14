import java.util.Arrays;


public class CyclicSort {
    public static void main(String[] args) {
        int[] array = {3, 1, 3, 4, 2};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    /* MY CODE */
    /* FAILS TEST CASE: {3, 1, 3, 4, 2} */
    static void cyclicSort(int[] arr) {
        for (int i = 0; i < arr.length;) {
            if (i == arr[i] - 1) /* If index = element at that index - 1, then increment, else swap. */ {
                i++;
            } else {
                SelectionSort.swap(arr, i, arr[i] - 1);
            }
        }
    }

    /* KUNAL'S CODE */
    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                SelectionSort.swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }
}
