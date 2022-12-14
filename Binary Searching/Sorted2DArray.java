import java.util.Arrays;

/* Binary Search on Sorted 2D Array */
public class Sorted2DArray {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}

        };
        System.out.println(Arrays.toString(search(array, 6)));
    }
    /* Binary Search: To perform Binary Search on the provided Row*/
    static int[] binarySearch (int[][] array, int row /* Row on which search is to be performed */, int start /* start position for search in the row */, int end /* End position for search in the row */, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == array[row][mid]) {
                return new int[]{row, mid};
            } else if (target < array[row][mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search (int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;

        // Check if the Array has is empty or not
        if (cols == 0) {
            return new int[]{-1, -1};
        } /* If there is only one row in the Matrix the perform simple Binary search on the row */
            else if (rows == 1) {
            return binarySearch(arr, 0, 0, cols - 1, target);
        }

        /* Binary search on 2D Array */
        int rowStart = 0;
        int rowEnd = rows - 1;
        int midCol = cols/2; // Middle column on which we will perform Binary search.

        /* While we have more than 2 rows left */
        while (rowStart < (rowEnd - 1)) {
            int mid = rowStart + (rowEnd - rowStart) / 2; // Middle row for targeting middle element in the middle column.
            if (arr[mid][midCol] == target) {
                return new int[]{mid, midCol}; // Returning if middle element in the middle column = target.
            } /* Else reducing our search space */
            else if (arr[mid][midCol] < target) {
                rowStart = mid; // If target > middle element then neglecting rows before middle element.
            } else {
                rowEnd = mid; // If target < middle element then neglecting rows after middle element.
            }
        }

        /* When we have 2 rows left */

        /* Target is present in the middle column */
        if (arr[rowStart][midCol] == target) {
            return new int[]{rowStart, midCol};
        } else if (target == arr[rowStart + 1][midCol]) {
            return new int[]{rowStart + 1, midCol};
        } /* Target present before middle column in the first row */
        else if (target <= arr[rowStart][midCol - 1]) {
            return binarySearch(arr, rowStart, 0, midCol - 1, target);
        } /* Target present after middle column in the first row */
        else if (target >= arr[rowStart][midCol + 1] && target < arr[rowStart][cols - 1]) {
            return binarySearch(arr, rowStart, midCol + 1, cols - 1, target);
        } /* Target present before middle column in the second row */
        else if (target <= arr[rowStart + 1][midCol - 1]) {
            return binarySearch(arr, rowStart + 1, 0, midCol - 1, target);
        } /* Target present after middle column in the second row */
        else {
             return binarySearch(arr, rowStart + 1, midCol + 1, cols - 1, target);
        }
    }
}
