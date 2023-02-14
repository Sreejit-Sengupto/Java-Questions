package Questions;

public class SumOfSquare {
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(100));
    }

    static boolean judgeSquareSum(int c) {
        int start = 0;
        int end = (int)(Math.sqrt(c));

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPerfectSquare(c - mid*mid)) {
                return true;
            }

            if (c >= (c - mid*mid)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    static boolean isPerfectSquare(int n) {
        for (int i = 0; i <= n; i++) {
            if (i*i == n) {
                return true;
            }
        }
        return false;
    }
}
