public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(5));
        System.out.println(sqrt(5));
    }

    static double sqrt (int x) {
        int start = 1;
        int end = x;

        while (start <= end) {
            int mid  = start + (end - start)/2;

            if (mid <= x/mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }

    static boolean isPerfectSquare (int n) {
        double sqrt = sqrt(n);
        return sqrt == n/sqrt;
    }
}
