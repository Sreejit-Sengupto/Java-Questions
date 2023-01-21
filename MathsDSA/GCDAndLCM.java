public class GCDAndLCM {
    public static void main(String[] args) {
        System.out.println(gdc(9, 18));
        System.out.println(lcm(9, 18));
    }

    static int gdc(int a, int b) {
        if (a == 0) {
            return b;
        }

        return gdc(b%a, a);
    }

    static int lcm(int a, int b) {
        return (a*b)/gdc(a, b);
    }
}
