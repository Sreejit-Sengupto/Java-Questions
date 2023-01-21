package SortingQuestions;

public class BadVersion {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }

    static int firstBadVersion(int n) {
        int start = 0;
        int end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    static boolean isBadVersion(int n) {
        int random = (int)(Math.floor(Math.random() * 2) + 1);
        return random == 2;
    }
}


