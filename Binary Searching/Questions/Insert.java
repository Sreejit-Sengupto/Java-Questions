public class Insert {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr, 2));
    }

    static int searchInsert (int[] nums, int target) {
        if (nums.length == 1) {
            if (target > nums[0]) {
                return 1;
            } else {
                return 0;
            }
        }
        int start = 0;
        int end = nums.length - 1;
        boolean isAscending = nums[start] < nums[end];
         while (start <= end) {
             int mid = start + (end - start)/2;

             if (target == nums[mid]) {
                 return mid;
             }

             if (isAscending) {
                 if (target < nums[mid]) {
                     end = mid - 1;
                 } else {
                     start = mid + 1;
                 }
             } else {
                 if (target < nums[mid]) {
                     start = mid + 1;
                 }
             }
         }
         return start; // You can also return end
    }
}
