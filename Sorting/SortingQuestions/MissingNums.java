package SortingQuestions;

public class MissingNums {
    public static void main(String[] args) {
        int[] array = {1,2,1,3,3,3,4,5,4,5};

    }

    static int missing(int[] arr, int[] brr) {
        sort(arr);
        sort(brr);
        return 0;
    }
    static int frequency(int[] arr, int n) {
        int count = 0;
        for (int i = indexOfMax(arr) + 1; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;
            }
        }
        return count + 1;
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - minimum(arr);
            if (arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
    }

    static int indexOfMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return max - min;
    }

    static int minimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
