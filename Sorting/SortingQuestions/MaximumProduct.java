package SortingQuestions;

public class MaximumProduct {
    public static void main(String[] args) {
        int[] array = {3,4,5,2};
        System.out.println(maxProduct(array));
    }

    static int maxProduct(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(i != j && (nums[i] - 1)*(nums[j] - 1) > max) {
                    max = (nums[i] - 1)*(nums[j] - 1);
                }
            }
        }
        return max;
    }
}
