import java.util.Arrays;

public class TypesOfMatrix {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(symmetricPossible(array));
        transpose(array);
    }

    static void transpose(int[][] arr) {
        int[][] arrB = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arrB[i][j] = arr[j][i];
            }
        }
        for (int i = 0; i < arrB.length; i++) {
            System.out.println(Arrays.toString(arrB[i]));
        }
    }
    static boolean symmetricPossible(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i != j && arr[i][j] == arr[j][i]) {
                    return true;
                }
            }
        }
        return false;
    }
}
