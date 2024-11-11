package batch1.java.altab;

public class Matricks {
    public static void main(String[] args) {
        /*
         * int mat[][] = new int[2][3]; // declare
         * mat[0][0] = 45;
         * mat[0][1] = 34;
         * mat[0][2] = 55;
         * 
         * mat[1][0] = 45;
         * mat[1][1] = 34;
         * mat[1][2] = 55;
         * int sum = 0;
         * 
         * for (int i = 0; i < mat.length; i++) {
         * for (int j = 0; j < mat[0].length; j++) {
         * sum +=mat[i][j];
         * System.out.println(mat[i][j]);
         * }
         * }
         *  // que 10

        int[][] ori = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int[][] copy = new int[ori.length][ori[0].length];
        for(int i =0;i<ori.length;i++){
            for(int j =0;j<ori[0].length;j++){
                copy[i][j] = ori[i][j];
            }
            
        }

         */
        //que 11
        int[][] ori = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int rows = ori.length;
        int col = ori[0].length;
        for(int j =0;j<col;j++){
            for(int i =0;i<rows;i++){
                System.out.println(ori[i][j]);
            }
        }



       
    }
}
