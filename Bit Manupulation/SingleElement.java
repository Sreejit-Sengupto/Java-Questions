public class SingleElement {
    public static void main(String[] args) {
        int ans = 0;
        int[] arr = {1, 3, 1, 2, 4, 2, 4};
        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i];
        }
        System.out.println(ans);
    }
}
