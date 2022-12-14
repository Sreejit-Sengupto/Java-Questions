/* *** QUESTION ***
 https://leetcode.com/problems/keep-multiplying-found-values-by-two/description/
 */
public class KeepMultiplying {
    public static void main(String[] args) {

    }

    static int findFinalValue(int[] nums, int original) {
        sort(nums);
        for(int i = 0; i < nums.length; i++) {
            int ans = binarySearch(nums, original);
            if(ans != -1) {
                original *= 2;
            }
        }
        return original;
    }

    static void sort(int[] arr) {
        boolean isSwapped;
        for(int i = 0; i < arr.length; i++) {
            isSwapped = false;
            for(int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped) {
                break;
            }
        }
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(target == arr[mid]) {
                return mid;
            } else if(target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
