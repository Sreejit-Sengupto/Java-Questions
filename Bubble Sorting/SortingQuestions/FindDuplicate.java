package SortingQuestions;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(array));
    }

//    static int findDuplicate(int[] nums) {
//        // Sorting the array using cycle sort
//        int i = 0;
//        while(i < nums.length) {
//            if (nums[i] != i + 1) {
//                int correctIndex = nums[i] - 1;
//                if (nums[i] != nums[correctIndex]) {
//                    swap(nums, i, correctIndex);
//                } else {
//                    return nums[i];
//                }
//            } else {
//                i++;
//            }
//        }
//        return -1;
//    }

    static int findDuplicate(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            if (arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
        return arr[arr.length - 1];
    }

    static void swap(int[] arr, int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
    }
}
