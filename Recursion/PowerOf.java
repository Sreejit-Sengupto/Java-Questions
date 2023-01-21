public class PowerOf {
    public static void main(String[] args) {
//        System.out.println(powerOfTwo(18, 0));
//        System.out.println(powerOfFour(1, 0));
        System.out.println(function(1));
    }

    static boolean powerOfTwo(int n, int i) {
        if (Math.pow(2, i) > n) {
            return false;
        }
        if (n != 1 && n % 2 != 0) {
            return false;
        }
        if (n == Math.pow(2, i)) {
            return true;
        }
        return powerOfTwo(n, i + 1);
    }

    static boolean powerOfFour(int n, int i) {
        if (Math.pow(4, i) > n) {
            return false;
        }

        if (Math.pow(4, i) == n) {
            return true;
        }
        return powerOfFour(n, i + 1);
    }

    static boolean function(int n) {
        int i = 0;
        while((int)(Math.pow(4, i)) <= n) {
            if ((int)(Math.pow(4,i)) == n) {
                return true;
            }
            i++;
        }
        return false;
    }
}
