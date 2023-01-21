package SortingQuestions;

import java.util.Arrays;

public class Parity {
    public static void main(String[] args) {
        int[] array = {3,1,4,2};
        System.out.println(Arrays.toString(sortByParity2(array)));
    }

    static int[] sortByParity(int[] arr) {
        int indexCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isEven(arr[i])) {
                swap(arr, indexCounter, i);
                indexCounter++;
            }
        }
        return arr;
    }

    static int[] sortByParity2(int[] nums) {
        int evenIndex = 0;
        int oddIndex = 1;
        for (int i = 0; i < nums.length; i++) {
            if (isEven(nums[i]) && evenIndex < nums.length) {
                swap(nums, evenIndex, i);
                evenIndex += 2;
            } else if (!isEven(nums[i]) && oddIndex < nums.length) {
                swap(nums, oddIndex, i);
                oddIndex += 2;
            }
        }
        return nums;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
