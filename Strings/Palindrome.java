import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("moc"));
    }

    static boolean isPalindrome(String str) {
        if (isEmpty(str)) {
            return true;
        }
        str = str.toLowerCase();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            builder.append(str.charAt(i)); // Adding characters of the original String to the new String.
        }
        return builder.reverse().toString().equals(str); // Reversing the String, then checking if the two Strings are equal or not.
    }


    static boolean Palindrome(String str) {
        if (isEmpty(str)) /* isEmpty() functions checks if the String is empty or null */ {
            return true;
        }
        str = str.toLowerCase();
        int start = 0; // Starting index.
        int end = str.length() - 1; // End index.
        while(start <= end) {
            if (str.charAt(start) != str.charAt(end)) /* If the characters at the start and end index are not same then return false. */ {
                return false;
            } else /* Else, move start ahead by one and move end behind by one. */{
                start++;
                end--;
            }
        }
        return true;
    }

    static boolean checkForPalindrome(String str) {
        if (isEmpty(str)) /* isEmpty() functions checks if the String is empty or null */ {
            return true; // Since, an empty string is also Palindrome therefore, returning true.
        }
        String newStr = ""; // Creating a new String to store the reverse of the original String.
        char ch; // To store the characters of the original String.
        for (int i = str.length() - 1; i >= 0; i--) /* Loop to extract characters from the end. */{
            ch = str.charAt(i);
            newStr += ch; // Adding the characters to get the reverse of the original Strings.
        }
        return newStr.equals(str);
    }
    static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    static void reverseString(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            builder.append(str.charAt(i)); // Adding characters of the original String to the new String.
        }
        builder.reverse();
    }
}
