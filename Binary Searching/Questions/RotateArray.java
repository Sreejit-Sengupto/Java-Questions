package Questions;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        rotate(array, 3);
    }

    static void rotate(int[] nums, int k) {
        int[] ans = new int[nums.length];
        int index = k - 1;
        while (index >= 0) {
            for (int i = 0; i < k; i++) {
                ans[i] = nums[nums.length - 1 - index];
                index--;
            }
        }

        for (int i = 0; i < nums.length - k; i++) {
            ans[k + i] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }

    static void sort(int[] arr, int start) {
        boolean swap;
        for (int i = start; i < arr.length; i++) {
            swap = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swap = true;
                }
            }
            if(!swap) {
                break;
            }
        }
    }
}
