public class IthBit {
    public static void main(String[] args) {
        System.out.println(ithBit(13, 4));
    }

    static int ithBit(int n, int bit) {
        int mask = 1 << (bit - 1);
        int ans = n & mask;
        if (ans != 0) {
            while (ans > 0) {
                if ((ans & 1) == 1) {
                    return ans;
                }
                ans >>= 1;
            }
        }
        return ans;
    }
}
