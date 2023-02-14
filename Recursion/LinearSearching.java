import java.util.ArrayList;

public class LinearSearching {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 2};
        System.out.println(present(array, 5, 0));
        System.out.println(present2(array, 2, 0));
        System.out.println(present3(array, 2, 0, new ArrayList<>()));
        System.out.println(present4(array, 2, 0));
    }

    static boolean present(int[] arr, int target, int i) {
        if (i == arr.length) {
            return false;
        }

        return arr[i] == target || present(arr, target, i + 1);
    }

    static int present2(int[] arr, int target, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == target) {
            return i;
        }

        return present2(arr, target, i + 1);
    }

    static ArrayList<Integer> present3(int[] arr, int target, int i, ArrayList<Integer> list) {
        if (i == arr.length) {
            return list;
        }

        if (arr[i] == target) {
            list.add(i);
        }

        return present3(arr, target, i + 1, list);
    }

    static ArrayList<Integer> present4(int[] arr, int target, int i) {
        ArrayList<Integer> list = new ArrayList<>();
        if (i == arr.length) {
            return list;
        }

        if (arr[i] == target) {
            list.add(i);
        }

        // This list will store the answer for the below function calls.
        ArrayList<Integer> ans = present4(arr, target, i + 1);
        list.addAll(ans);
        return list;
    }
}
