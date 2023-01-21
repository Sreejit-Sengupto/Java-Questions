package SortingQuestions;



import java.util.ArrayList;
import java.util.List;

class AllNumbersDisappeard {
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 5, 7};
        System.out.println(findDisappearedNumbers(array));
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        int i = 0;
        while(i < nums.length) {
            if(nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }

        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

