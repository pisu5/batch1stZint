package batch1.java.altab;

public class StarPatterns {
    public static void main(String[] args) {
        // que 1

        int row = 5;

        /*
         * for (int i = 1; i <= row; i++) { // rows
         * 
         * for (int j = 1; j <= row; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * 
         * }
         */
        // que 3

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j < row - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
