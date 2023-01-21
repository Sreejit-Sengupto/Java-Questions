package SortingQuestions;

import java.util.Arrays;

public class AP {
    public static void main(String[] args) {
        int[] array = {1,10,10,10,19};
        sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(arithmeticProgression(array));
    }
    static boolean arithmeticProgression(int[] arr) {
        boolean isProgression = false;
        if(arr.length == 2 || arr.length == 1 || arr.length == 0) {
            return true;
        }
        sort(arr);
        int difference = arr[0] - arr[1];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] - difference == arr[i + 1]) {
                isProgression = true;
            } else {
                isProgression = false;
                break;
            }
        }
        return isProgression;
    }

    static void sort(int[] arr) {
        boolean isSwapped;
        for(int i = 0; i < arr.length; i++) {
            isSwapped = false;
            for(int j = 1; j < arr.length; j++) {
                if(arr[j] > arr[j - 1]) {
                    swap(arr, j, j - 1);
                    isSwapped = true;
                }
            }
            if(!isSwapped) {
                break;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
