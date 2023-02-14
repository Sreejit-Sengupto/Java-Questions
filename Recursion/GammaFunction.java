public class GammaFunction {
    public static void main(String[] args) {
        System.out.println(gamma(4));
    }

    static int gamma(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        return (n - 1) * gamma(n - 1);
    }
}


