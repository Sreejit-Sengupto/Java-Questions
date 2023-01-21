package SortingQuestions;

public class AverageSalary {
    public static void main(String[] args) {
        int[] array = {4000, 3000, 1000, 2000};
        System.out.println(average(array));
    }

    static double average(int[] salary) {
        double length = salary.length - 2;
        double sum = 0;
        sort(salary);
        for(int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
        }
        return sum/length;
    }

    static void sort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - 1 - i;
            int maxIndex = max(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int max(int[] arr, int start, int end) {
        int max = start;
        for(int i = 0; i <= end; i++) {
            if(arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
