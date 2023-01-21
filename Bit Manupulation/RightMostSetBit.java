public class RightMostSetBit {
    public static void main(String[] args) {
        int n = 4;
//        String ans = Integer.toBinaryString((n & -n));
//        System.out.println(ans.substring(0, 1));

        System.out.println((n & -n));
    }
}
