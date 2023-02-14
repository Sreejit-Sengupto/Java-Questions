import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] first = {1, 2, 3};
        int[] second = {2, 5, 6};
        System.out.println(Arrays.toString(mergeArrays(first, second)));
    }

    static int[] mergeSort(int[] arr) {

        /* Base condition, return the array when only one element is left. */
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        /* Split the array in two halves. */
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        /* Merge the two arrays. */
        return mergeArrays(left, right);
    }

    static int[] mergeArrays(int[] first, int[] second) {
        int[] ans = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length) {
            if (first[i] <= second[j]) {
                ans[k] = first[i];
                i++;
            } else {
                ans[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            ans[k] = first[i];
            k++;
            i++;
        }

        while (j < second.length) {
            ans[k] = second[j];
            k++;
            j++;
        }
        return ans;
    }

    static void mergeInPlace(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }
        int mid = start + (end - start) / 2;
        mergeInPlace(arr, start, mid);
        mergeInPlace(arr, mid, end);

        merge(arr, start, mid, end);
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int[] ans = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                ans[k] = arr[i];
                i++;
            } else {
                ans[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            ans[k] = arr[i];
            i++;
            k++;
        }

        while (j < end) {
            ans[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < ans.length; l++) {
            arr[start + l] = ans[l];
        }
    }
}
