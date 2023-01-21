public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

    static boolean isHappy(int n) {
        int sum = 0;
        if (n == 1) {
            return true;
        }
        if (n < 1) {
            return false;
        }
        while (n > 0) {
            int rem = n % 10;
            sum = (int)(sum + Math.pow(rem, 2));
            n /= 10;
        }
        isHappy(sum);
        return true;
    }
}
