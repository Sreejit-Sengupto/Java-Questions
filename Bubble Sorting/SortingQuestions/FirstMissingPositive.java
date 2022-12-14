package SortingQuestions;

class FirstMissingPositive {
    public static void main(String[] args) {
        int[] array = {1, 2, 0};
        System.out.println(firstMissingPositive(array));
    }
    static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }

        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1) {
                return index + 1;
            }
        }
        return nums.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
