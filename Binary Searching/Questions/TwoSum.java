import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(array, 6)));
    }

    static int[] twoSum (int[] arr, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                if (arr[i] + arr[j] == target) {
                    ans[0] = j;
                    ans[1] = i;
                }
            }
        }
        return ans;
    }
}
