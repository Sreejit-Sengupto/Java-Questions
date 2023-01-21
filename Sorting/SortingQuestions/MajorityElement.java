package SortingQuestions;

public class MajorityElement {
    public static void main(String[] args) {
        int[] array = {1,2,2,3,3,3,4,6,7,7,7,7,7,7,7,7};
        System.out.println(majorityElement(array));
    }

    static int majorityElement(int[] arr) {
        sort(arr);
        int max = arr.length/2;
        int ans = 0;
        int start = 0;
        int end = lastIndex(arr, arr[0]);
        int count = 0;
        while (start < arr.length && end < arr.length) {
            end = lastIndex(arr, arr[start]);
            count = (end - start) + 1;

            if (count > max) {
                ans = arr[start];
            }
            start = end + 1;
        }
        return ans;
    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - 1 - i;
            int maxIndex = getMax(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }

    static int getMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = 0; i <= end; i++) {
            if(arr[i] > arr[start]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int lastIndex(int[] arr, int n) {
        sort(arr);
        int ans = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == n) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}
