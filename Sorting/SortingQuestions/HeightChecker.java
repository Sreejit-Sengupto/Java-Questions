package SortingQuestions;

public class HeightChecker {
    public static void main(String[] args) {
        int[] array = {5,1,2,3,4};
        System.out.println(heightChecker(array));
    }

    static int heightChecker(int[] heights) {
        int count = 0;
        int i = 0;
        while(i < heights.length) {
            int correctIndex = heights[i] - 1;
            if(heights[i] != heights[correctIndex]) {
                count++;
            }
            i++;
        }
        return count;
    }
}
