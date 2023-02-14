import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        permute("", "abc");
        System.out.println(permuteInList("", "abc"));
    }

    static void permute(String p, String up) {
        // Base condition
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String last = p.substring(i, p.length());
            permute(first + ch + last, up.substring(1));
        }
    }

    static ArrayList<String> permuteInList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String last = p.substring(i, p.length());
            ans.addAll(permuteInList(first + ch + last, up.substring(1)));
        }
        return ans;
    }
}
