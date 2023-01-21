public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println(binary(array, 5, 0, array.length - 1));
    }

    static int binary(int[] arr, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if (target == arr[mid]) {
            return mid;
        }

        if (target < arr[mid]) {
            return binary(arr, target, start, mid - 1);
        }

        return binary(arr, target, mid + 1, end);
    }
}
