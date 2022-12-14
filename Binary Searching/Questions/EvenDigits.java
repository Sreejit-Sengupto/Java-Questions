public class EvenDigits {
    public static void main(String[] args) {
        int[] array = {555, 901, 482, 1771};
        System.out.println(findNumbers(array));
    }

    static int findNumbers (int[] arr) {
        int count = 0;
        for (int element : arr) {
            if (hasEvenDigits(element)) {
                count++;
            }
        }
        return count;
    }

    static boolean hasEvenDigits (int num) {
        int count  = 0;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            count ++;
        }
        return count % 2 == 0;
    }
}
