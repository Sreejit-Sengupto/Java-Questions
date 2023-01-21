import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {0,2,1,2,0};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void bubbleSort(int[] arr) {
        boolean isSwapped; // To check if the array is already sorted.

        /* Run the pass till Length - 1 */
        for (int i = 0; i < arr.length; i++) {
            isSwapped = false;

            /* for loop to compare the adjacent elements and swap them if element at 'j' is less 'j - 1' */
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSwapped = true; // Changing isSwapped to true if swapping is happening, to ensure the array is not sorted
                }
            }

            /* If the array is already sorted: Do not check for next Passes */
            if (!isSwapped) {
                break;
            }
        }
    }
}