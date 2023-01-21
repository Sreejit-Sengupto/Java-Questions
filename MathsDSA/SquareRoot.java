public class SquareRoot {
    public static void main(String[] args) {
        System.out.printf("%.2f", sqrt(122));
    }

    static double sqrt(int n) {
        int start = 0;
        int end = n;

        double root = 0.0;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid*mid == n) {
                return mid;
            } else if (mid*mid > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        double increment_value = 0.1;

        for (int i = 0; i < 2; i++) {
            while (root*root <= n) {
                root += increment_value;
            }

            root -= increment_value;
            increment_value /= 10;
        }
        return root;
    }
}
