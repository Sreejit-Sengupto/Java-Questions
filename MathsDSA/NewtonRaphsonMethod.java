public class NewtonRaphsonMethod {
    public static void main(String[] args) {
        System.out.println(nrSqrt(40));
    }

    static double nrSqrt(int n) {
        double x = n;
        double root;
         while (true) {
             root  = 0.5*(x + (n/x));
             double error = Math.abs(root - x);

             if (error < 1) {
                 break;
             }

             x = root;
         }
         return root;
    }
}
