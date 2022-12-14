public class DoubleExists {
    public static void main(String[] args) {
        int[] array = {2, 6, 5, 5, 13, 11};
        System.out.println(checkIfExists(array));
    }
    static boolean checkIfExists (int[] arr) {
        int count = 0;

        /* Catching an element of the array using 'i' */
        for (int i = 0; i < arr.length; i++) {
            /* Comparing other elements of the array with 'i' using 'j' */
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue; // Continue for the same elements.
                } if (arr[i] == 0 && arr[j] == 0) {
                    return true;
                } else {
                    if (arr[i] == 2 * arr[j]) {
                        count++; // Increasing count if double found.
                    }
                }
            }
        }
        return count > 0;
    }
}
