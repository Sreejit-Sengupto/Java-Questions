public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse2(1257));
        System.out.println(isPalindrome(12321));
    }

    static int reverse(int n, int base) {
        if (n%10 == n) {
            return n;
        }
        return (n%10)*base + reverse(n/10, base /= 10);
    }


    static int reverse2(int n) {
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }
    static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        return (n%10)*(int)(Math.pow(10, digits - 1)) + helper(n/10, digits - 1);
    }

    static boolean isPalindrome(int n) {
        return n == reverse2(n);
    }
}
