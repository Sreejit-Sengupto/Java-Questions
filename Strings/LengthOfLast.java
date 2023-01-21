public class LengthOfLast {
    public static void main(String[] args) {
        String str = "Hello World";
        int count = 0;
        String trimmedStr = str.trim();
        for (int i = trimmedStr.length() - 1; i >=0; i--) {
            if ((int)(trimmedStr.charAt(i)) == 32) {
                break;
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}
