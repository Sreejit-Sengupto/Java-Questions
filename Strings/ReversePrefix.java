public class ReversePrefix {
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcd", 'z'));
    }

    static String reversePrefix(String word, char ch) {
        int endIndex = word.indexOf(ch);
        String str = "";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <= endIndex; i++) {
            builder.append(word.charAt(i));
        }
        for (int j = endIndex + 1; j < word.length(); j++) {
            str += word.charAt(j);
        }
        return builder.reverse() + str;
    }
}
