import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factors(20);
    }

    static void factors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i*i <= n; i++) {
            if (n % i == 0) {
                if (i == n/i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int j = list.size() - 1; j>=0; j--) {
            System.out.print(list.get(j) + " ");
        }
    }
}
