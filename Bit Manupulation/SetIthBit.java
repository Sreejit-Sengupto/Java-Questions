public class SetIthBit {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(setBit(86, 4)));
    }

    static int setBit(int n, int bit) {
        int mask = 1 << (bit - 1);
        return n | mask;
    }
}
