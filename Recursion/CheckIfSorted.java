public class CheckIfSorted {
    public static void main(String[] args) {
        int[] array = {1, 2, 56, 4};
        System.out.println(isSorted(array, 0));
    }

    static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }

        return arr[i] < arr[i + 1] && isSorted(arr, i + 1);
    }
}
