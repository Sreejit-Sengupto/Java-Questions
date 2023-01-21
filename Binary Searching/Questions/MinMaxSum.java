package Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(396285104);
        arr.add(759641832 );
        arr.add(573261094);
        arr.add(819230764);
        arr.add(364801279);
        minMaxSum(arr);
    }

    static void minMaxSum(List<Integer> arr) {
        long min = 0;
        long max = 0;
        Collections.sort(arr);
        System.out.println(arr);
        for(int i = 0; i < arr.size() - 1; i++) {
            min += arr.get(i);
        }
        for(int j = 1; j < arr.size(); j++) {
            max += arr.get(j);
        }
        System.out.print(min + " " + max);
    }
}
