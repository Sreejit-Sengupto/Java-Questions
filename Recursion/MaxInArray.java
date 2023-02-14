public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4000,100,500};
        System.out.println(max(arr, 0));
    }

    static int max(int[] arr, int index) {
        if (index == arr.length) {
            return arr[arr.length - 1];
        }

        if (index < arr.length - 1 && arr[index] > arr[index + 1]) {
            int temp = arr[index];
            arr[index] = arr[index + 1];
            arr[index + 1] = temp;
        }

        return max(arr, index + 1);
    }
}
