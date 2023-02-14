public class Subsets {
    public static void main(String[] args) {
        subsets("", "abc");
    }

    static void subsets(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subsets(p, up.substring(1));
        subsets(p + ch, up.substring(1));
    }
}
