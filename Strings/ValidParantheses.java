public class ValidParantheses {
    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }

    static boolean isValid(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == '{' || s.charAt(i) == '}' || s.charAt(i) == '[' || s.charAt(i) == ']') {
                if (i % 2 != 0) {
                    if (s.charAt(i) == ')' && s.charAt(i - 1) == '(' || s.charAt(i) == '}' && s.charAt(i - 1) == '{' || s.charAt(i) == ']' && s.charAt(i - 1) == '[') {
                        count++;
                    }
                } else {
                    count++;
                }
            }
        }
        return count == s.length();
    }
}
