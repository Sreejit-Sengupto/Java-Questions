public class PowOfTwo {
    public static void main(String[] args) {
        System.out.println(powOfTwo(16));
    }

    static boolean pow(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count == 1;
    }

    static boolean powOfTwo(int n) {
        return (n & n - 1) == 0;
    }
}
