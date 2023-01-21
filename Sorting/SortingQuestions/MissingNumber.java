package SortingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static SortingQuestions.AP.sort;

class MissingNumber {
    public static void main(String[] args) {
        int[] array = {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
        int[] brr = {20,21,22,23,24,25,26,27,28,29,30};
        System.out.println(missingNumbers(array, brr));
    }
    static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        for(int j = 0; j < nums.length; j++) {
            if(nums[j] != j) {
                return j;
            }
        }
        return nums.length;
    }

    static List<Integer> missingNumbers(int[] arr, int[] brr) {
        List<Integer> ans = new ArrayList<>();
        boolean notContains;
        for(int i = 0; i < brr.length; i++) {
            notContains = false;
            for(int j = 0; j < arr.length; j++) {
                if(brr[i] == arr[j]) {
                    notContains = false;
                    break;
                } else {
                    notContains = true;
                }
            }
            if (notContains) {
                ans.add(brr[i]);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int minimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static void sort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }
}
