import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));
        sumTriangle(array);
    }

    static void sumTriangle(int[] arr) {
        if (arr.length == 1) {
            return;
        }
        int[] newArray = new int[arr.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = arr[i] + arr[i + 1];
        }
        System.out.println(Arrays.toString(newArray));
        sumTriangle(newArray);
    }
}
