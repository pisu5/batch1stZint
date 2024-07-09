public class star {
    public static void main(String[] args) {
        // que 1
        /*
         * int row = 5;
         * 
         * for (int i = 1; i <= row; i++) { // responsible for rows
         * for (int j = 1; j <= i; j++) { // print
         * System.out.print("*");
         * 
         * }
         * System.out.println();
         * 
         * }
         * 
         * // que 2
         * int r = 5;
         * for (int i = 1; i <= r; i++) {
         * for (int j = 1; j <= (r - i + 1); j++) {
         * System.out.print("*");
         * 
         * }
         * System.out.println();
         * }
         */

        int row = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
