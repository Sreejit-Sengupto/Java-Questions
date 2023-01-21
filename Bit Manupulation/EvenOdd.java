public class EvenOdd {
    public static void main(String[] args) {
        int n = 3;
        boolean ans = (n & 1) == 0;
        if (ans) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
