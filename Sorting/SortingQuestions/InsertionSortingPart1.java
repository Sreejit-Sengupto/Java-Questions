package SortingQuestions;

public class InsertionSortingPart1 {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
        insertionSort1(array);
    }

    static void insertionSort1(int[] arr) {
        int upper = arr[arr.length - 1];
        for(int i = arr.length - 2; i >= 0; i--) {
            if(arr[i] < upper) {
                arr[i + 1] = upper;
                print(arr);
                break;
            } else {
                arr[i + 1] = arr[i];
                print(arr);
            }
            System.out.println();
        }
        if (arr[0] > upper) {
            arr[0] = upper;
        }
        print(arr);
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
