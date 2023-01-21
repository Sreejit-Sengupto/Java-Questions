public class Patterns {
    public static void main(String[] args) {
        pattern1(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern6(5);
        System.out.println();
        pattern7(5);
        System.out.println();
        pattern8(5);
        System.out.println();
        pattern9(5);
        System.out.println();
        pattern10(5);
        System.out.println();
        pattern11(5);
        System.out.println();
        pattern12(5);
        System.out.println();
        pattern13(5);
        System.out.println();
        pattern14(5);
        System.out.println();
        pattern15(5);
    }


    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int k = 1; k <= n -1; k++) {
//            for (int l = n - 1; l >= k; l--) {
//                System.out.print("*");
//            }
//            System.out.println();

        /* ANOTHER METHOD */
        for (int i = 1; i <= 2 * n - 1; i++) {
            int noOfCols = i > n ? 2 * n - i : i;
            for (int j = 1; j <= noOfCols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            // Spaces will be 0 at the first row and then will increase by 1.
            for (int s = 1; s < i; s++) {
                System.out.print(" ");
            }
            // Print stars till the 'j' is greater than 'i'
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int row = 0; row <= n; row++) {


            for (int s = 0; s < n - row; s++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int i = n; i >= 1; i--) {
            for (int s = i; s < n; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {
        for (int i = 0; i < n; i++) {
            for (int s = 1; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern12(int n) {
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int k = 0; k < n; k++) {
            for (int s = 1; s < n - k; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= k; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern13(int n) {
        for (int i = 1; i <= n; i++) {

            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            if (i == n - 1) {
                System.out.println();
                for (int k = 0; k < 2 * n - 1; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void pattern14(int n) {
        for (int i = n; i >= 1; i--) {
            for (int s = i; s < n; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2*i - 1; j++) {
                if (2 * i - 1 != 2 * n - 1){
                    if (j == 1 || j == 2 * i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            if (i == n) {
                System.out.println();
                for (int k = 0; k < 2*n - 1; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void pattern15(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2*i - 1; j++) {
                if (j == 0 || j == 2*i - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int k = n - 1; k >= 1; k--) {
            for (int spaces = k; spaces <= n - 1; spaces++) {
                System.out.print(" ");
            }

            for (int l = 1; l <= 2*k - 1; l++) {
                if (2*k - 1 != 2*(n-1) - 1) {
                    if (l == 1 || l == 2*k - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
