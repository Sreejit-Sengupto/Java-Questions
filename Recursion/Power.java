public class Power {
    public static void main(String[] args) {
        power(2,3);
    }

    static void power(int a, int b) {
        if (b == 0) {
            return;
        }
        int sum = 1;
        sum *= a;
        int temp = sum;
        System.out.println(temp);
        power(sum, b - 1);
    }
}
