package batch1.java.altab;

public class StarPatterns {
    public static void main(String[] args) {
        // que 1

        /*
         * for (int i = 1; i <= row; i++) { // rows
         * 
         * for (int j = 1; j <= row; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * 
         * }
         * // que 3
         * 
         * for (int i = 1; i <= row; i++) {
         * for (int j = 1; j < row - i + 1; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         * // que 4
        int rows = 7;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");

            }
            System.out.println();

        }

         */
        //que 5
        int row= 5;
        for(int i =1;i<=row;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();

        }
        
    }

}
