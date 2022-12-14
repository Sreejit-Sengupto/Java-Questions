public class GuessNumber {
    public static void main(String[] args) {
        System.out.println(guessNumber(1, 1));
    }

    /* Simple binary search algorithm, instead of array just search from 1 till n */
    static int guessNumber (int n, int pick) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (mid < pick) {
                start = mid + 1;
            } else if (mid > pick) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
