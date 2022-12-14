public class BinarySearchSyntax {
    public static void main(String[] args) {
        /* Check your cases here, by changing the array and the target. */
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(binarySearch(array, 6));
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
