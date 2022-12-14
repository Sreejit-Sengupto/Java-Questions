public class TotalNegatives {
    public static void main(String[] args) {
        int[][] array = {
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        };
        System.out.println(nosNegative(array));
    }

    static int nosNegative (int[][] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
