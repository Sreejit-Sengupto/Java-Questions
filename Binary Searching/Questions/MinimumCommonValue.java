package Questions;

public class MinimumCommonValue {
    public static void main(String[] args) {
        int[] arr1 = {2,4};
        int[] arr2 = {1,2};
        System.out.println(getCommons(arr1, arr2));
    }

    static int getCommons(int[] nums1, int[] nums2) {
        int index = 0;
        while (index < nums2.length) {
            int start = 0;
            int end = nums1.length - 1;
            int target = nums2[index];
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (nums1[mid] == target) {
                    return target;
                } else if (nums1[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            index++;
        }
        return -1;
    }
}
