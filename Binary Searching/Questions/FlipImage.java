import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
        int[][] array = {
                {1, 1, 0, 0},
                {1, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 0, 1, 0}
        };
        flipAndInvertImage(array);
        for (int[] element : array) {
            System.out.println(Arrays.toString(element));
        }
    }

    static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            flipArray(image[i]);
        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                } else if (image[i][j] == 1) {
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
    static int[] flipArray (int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
