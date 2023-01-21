package SortingQuestions;

import java.util.Arrays;

public class RankTransform {
    public static void main(String[] args) {
        int[] array = {37,12,28,9,100,56,80,5,12};
    }

//    static int[] rank(int[] arr) {
//        int[] original = arr;
//        int size = arr.length - noOfDuplicate(arr);
//        int[] rankArr = new int[size];
//        sort(arr);
//        int rank = 1;
//        for (int i = 0; i < original.length; i++)
//            for (int j = 0; j < arr.length; j++) {
//                if (original[i] == arr[j]) {
//                    if (arr[j] == arr[j - 1]) {
//                        rankArr[i] = rankArr[i - 1];
//                    } else {
//                        rankArr[i] = rank;
//                        rank++;
//                    }
//                }
//            }
//        }
//    }

    static int noOfDuplicate(int[] arr) {
        sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    static void sort(int[] arr) {
        boolean isSwapped;
        for (int i = 0; i < arr.length; i++) {
            isSwapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
    }
}
