public class PeakInMountain{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 3, 1};
        System.out.println(peakBinary(array));
        int target = 3;
        /* Searching in Mountain array */
        /* First we will search in the ascending part then will search in the descending part */
        int peak = peakBinary(array);
        if (target > peak) {
            System.out.println(binarySearch(array, target, peak + 1, array.length));
        } else {
            System.out.println(binarySearch(array, target, 0, peak));
        }

    }

    /* Using Linear Search */
    /* Here we just traverse over the entire array and get the Largest value */
    static int peakLinear (int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]  > max) {
                max = i;
            }
        }
        return max;
    }

    /* Using Binary Search */
    /* In mountain array basically, the array gets divided into two parts one arranged in ascending order(before/left of the peak element) and one in descending order(after/right of the peak element) */
    static int peakBinary (int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start)/2;

            if (arr[mid] > arr[mid + 1]) { // We compare the mid element with mid + 1 element
                end = mid; // if mid-element > mid + 1 element then it means we are in the descending part of the array. Therefore, we shift our search space to left i.e. by assigning end to mid
            } else {
                start = mid + 1; // if mid-element < mid + 1 element then it means we are in the ascending part of the array. Therefore, we shift our search space to left i.e. by assigning start to mid + 1
            }
        }
        /* After making comparisons our start and end ends up at the same index i.e. of index of the largest element */
        return start; // Hence, we can also return end
    }

    static int binarySearch (int[] arr, int target, int start, int end) {
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
