public class NumberOfZeros {
    public static void main(String[] args) {
        System.out.println(zeros(100020003));
    }

    static int zeros(int n) {
        return helper(n, 0);
    }

    static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }

        if (n%10 == 0) {
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }
}
