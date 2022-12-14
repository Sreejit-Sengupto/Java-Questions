import java.util.Arrays;

public class FirstLastIndex {
    public static void main(String[] args) {
        int[] array = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(searchRange(array, 8)));
    }

    static int[] searchRange (int[] arr, int target) {
        int[] ansArray = {-1, -1}; // Answer if the element is not present.
        ansArray[0] = search(arr, target, true);  // Storing first index of occurrence.
        ansArray[1] = search(arr, target, false); // Storing last index of occurrence.
        return ansArray;
    }


    /* Simple Binary search algorithm. If we find the target at the middle we just search for it on once on it's left side and once on it's right side */
    static int search (int[] arr, int target, boolean findFirstIndex) {
        int ansIndex = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ansIndex = mid; // If the target is present in the middle there might be a possibility that it may occur before it or after it
                if (findFirstIndex) {
                    end = mid - 1; // For 1st index, checking on left hand side.
                } else {
                    start = mid + 1; // For last index, checking on right side.
                }
            }
        }
        return ansIndex;
    }
}
