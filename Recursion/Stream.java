public class Stream {
    public static void main(String[] args) {
        System.out.println(skip("abcdag"));
        System.out.println(skipWord("apple", "aaapplebb"));
    }

    static void skipCharacter(String ans, String org) {
        if (org.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char extracted = org.charAt(0);

        if (extracted == 'a') {
            skipCharacter(ans, org.substring(1));
        } else {
            skipCharacter(ans + extracted, org.substring(1));
        }
    }

    static String skip(String original) {
        if (original.isEmpty()) {
            return "";
        }

        char extracted = original.charAt(0);
        if (extracted == 'a') {
            return skip(original.substring(1));
        } else {
            return extracted + skip(original.substring(1));
        }
    }

    static String skipWord(String word, String str) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.startsWith(word)) {
            return skipWord(word, str.substring(word.length()));
        } else {
            return str.charAt(0) + skipWord(word, str.substring(1));
        }
    }
}
