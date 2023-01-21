public class BinarySearchSyntax {
    public static void main(String[] args) {
        /* Check your cases here, by changing the array and the target. */
        int[] array = {1, 2, 3, 4, 5, 6, 8, 9, 10, 14, 16, 19, 22, 23, 25, 26, 27, 29, 31, 34, 35, 36, 38, 39, 40, 45, 46, 48, 50, 51, 52, 57, 59, 60, 61, 63, 67, 68, 69, 71, 75, 76, 77, 79, 81, 82, 83, 86, 87, 88, 90, 92, 93, 94, 95, 96, 98, 99, 100};
        System.out.println(binarySearch(array, 93));
    }

    static int binarySearch (int[] arr, int target) {
        int start = 0; // Start position of search space.
        int end = arr.length - 1; // End position of search space.

        boolean isAscending = arr[start] < arr[end]; // Checking the manner in which the array is sorted.

        /* Algorithm for Binary Search */
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target == arr[mid]) {
                return mid;
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
             }
        }
        return -1;
    }
}
