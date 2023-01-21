import java.util.Arrays;

public class SwapCharacters {
    public static void main(String[] args) {
        char[] array = {'h','e','l','l','o'};
        reverse(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    static void reverse(char[] arr, int start, int end) {
        if (start > end) {
            return;
        }
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start + 1, end - 1);
    }
}
