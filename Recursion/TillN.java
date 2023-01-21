public class TillN {
    public static void main(String[] args) {
        System.out.println(product(5));
        System.out.println(sum(5));
    }

    // Or factorial of a number
    static int product(int n) {
        if (n == 1) {
            return 1;
        }
        return n * product(n - 1);
    }

    static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}
