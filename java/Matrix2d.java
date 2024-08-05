import java.util.Arrays;

public class Matrix2d {
    public static void main(String[] args) {
        /*
         * 2d array declare
         * int[][] declare = new int[3][4];
         * declare[0] = new int[] { 8, 8, 8, 8 };
         * declare[1] = new int[] { 8, 8, 8, 8 };
         * declare[2] = new int[] { 8, 8, 8, 8 };
         * 
         * 
         * // 2d array initilize
         * int[][] arr = { { 1, 2, 4 }, { 7, 8 } };
         * // int value = arr[1][2];
         * for (int i = 0; i < arr.length; i++) {
         * int temp = arr[i].length;
         * System.out.println(i + " " + " " + temp);
         * 
         * }
         * 
         * 
         * // sum of rows
         * int[][] arr = { { 1, 2, 4 }, { 7, 8 } };
         * for (int i = 0; i < arr.length; i++) {
         * int rowslen = arr[i].length;
         * int sum = 0;
         * for (int j = 0; j < rowslen; j++) {
         * sum =sum+ arr[i][j];
         * }
         * System.out.println("Sum of row " + " " + i + " " + sum);
         * }
         * 
         * //que no-7
         * int[][] mat = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9 }, { 10, 11, 12, 13, 14, 15 }
         * };
         * int max = mat[0][0];
         * for (int rows = 0; rows < mat.length; rows++) {
         * 
         * int rowsLength = mat[rows].length;
         * for (int columns = 0; columns < rowsLength; columns++) {
         * if (mat[rows][columns] > max) {
         * max = mat[rows][columns];
         * }
         * 
         * }
         * 
         * }
         * System.out.println(max);
         * 
         * // que no-9
         * int[][] mat = { { 1, 2, 3, 5 }, { 6, 7, 8, 9 }, { 10, 13, 14, 15 } };
         * int[][] mat2 = { { 1, 2, 3, 5 }, { 6, 7, 8, 9 }, { 10, 13, 14, 15 } };
         * boolean flag = true;
         * if(mat.length==mat2.length && mat[0].length==mat2[0].length){
         * for(int i = 0;i<mat.length;i++){
         * for(int j = 0;j<mat[0].length;j++){
         * if(mat[i][j]!=mat2[i][j]){
         * flag = false;
         * }
         * 
         * 
         * }
         * }
         * }else{
         * flag = false;
         * }
         * System.out.println(flag);
         * //que 10
         * int[][] mat = { { 1, 2, 3, 5 }, { 6, 7, 8, 9 }, { 10, 13, 14, 15 } };
         * int[][] copy = new int[mat.length][mat[0].length];
         * for (int i = 0; i < mat.length; i++) {
         * for (int j = 0; j < mat[i].length; j++) {
         * 
         * copy[i][j] = mat[i][j];
         * }
         * }
         * System.out.println(Arrays.deepToString(copy));
         * 
         * //que no-11
         * int[][] mat = { { 1, 2, 3, 5 }, { 6, 7, 8, 9 }, { 10, 13, 14, 15 } };
         * for (int i = 0; i < mat[0].length; i++) {
         * for (int j = 0; j < mat.length; j++) {
         * System.out.println(mat[j][i] + "\t");
         * 
         * }
         * }
         * 
         * 
         * // que 14
         * int[][] mat = { { 1, 2, 3, 5 }, { 6, 7, 8, 9 }, { 10, 13, 14, 15 } };
         * int rowsLength = mat.length;
         * int maxIndex = -1;
         * 
         * int maxSum = Integer.MIN_VALUE;
         * 
         * for (int i = 0; i < mat.length; i++) {
         * int sum = 0;
         * for (int j = 0; j < mat[i].length; j++) {
         * sum += mat[i][j];
         * 
         * }
         * if (sum > maxSum) {
         * maxSum = sum;
         * maxIndex = i;
         * }
         * }
         * System.out.println(maxIndex);
         * 
         * //que-find min 15
         * int[][] mat = { { 1, 2, 3, 5 }, { 6, 7, 8, 9 }, { 10, 13, 14, 15 } };
         * int rowsLength = mat.length;
         * int colLength = mat[0].length;
         * 
         * int minSum = Integer.MAX_VALUE;
         * int minIndex = -1;
         * 
         * for (int i = 0; i < colLength; i++) {
         * int sum = 0;
         * for (int j = 0; j < rowsLength; j++) {
         * sum += mat[j][i];
         * 
         * }
         * if (sum < minSum) {
         * minSum = sum;
         * minIndex = i;
         * }
         * }
         * System.out.println(minIndex);
         * 
         * //Que 16
         * int[][] mat = { { 1, 2, 3, 5 }, { 6, 7, 8, 9 }, { 10, 13, 14, 15 } };
         * int row = 0;
         * int col = mat[0].length - 1;
         * System.out.println(col);
         * int ri = -1;
         * int ci = -1;
         * int k = 6;
         * while (row <= mat.length && col >= 0) {
         * if (mat[row][col] == k) {
         * ri = row;
         * ci = col;
         * break;
         * 
         * } else if (k < mat[row][col]) {
         * col--;
         * } else if (k > mat[row][col]) {
         * row++;
         * }
         * 
         * }
         * System.out.println("Index of row" + " " + ri);
         * System.out.println("Index of col" + " " + ci);
         * 
         * // que 17
         * int[][] mat = { { 1, 2, 3, 5 }, { 6, 7, 8, 9 }, { 10, 13, 14, 15 } };
         * for (int col = 0; col <mat[0].length; col++) {
         * if (col % 2 == 0) {
         * for (int rows = 0; rows < mat.length; rows++) {
         * System.out.println(mat[rows][col]);
         * }
         * } else {
         * for (int rows = mat.length-1; rows >= 0; rows--) {
         * System.out.println(mat[rows][col]);
         * 
         * }
         * 
         * }
         * 
         * }
         * 
         * // que 18
         * int[][] mat = { { 1, 2, 3, 5 }, { 6, 7, 8, 9 }, { 10, 13, 14, 15 } };
         * int rowLen = mat.length;
         * int cols = mat[0].length;
         * for (int col = 0; col < cols; col++) {
         * int i = 0;
         * int j = col;
         * while (i < rowLen && j>=0) {
         * System.out.print(mat[i][j] + " ");
         * i++;
         * j--;
         * 
         * }
         * System.out.println();
         * 
         * }
         * // print elemnt from columns
         * for (int row = 1; row < rowLen; row++) {
         * int i = row;
         * int j = 0;
         * while (i < rowLen && j>=0) {
         * System.out.print(mat[i][j] + " ");
         * i++;
         * j--;
         * 
         * }
         * System.out.println();
         * 
         * }
         * //que 21
         * 
         * int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
         * int[] arr2 = { 1, 2, 3, 4, 5, 6, 7 };
         * int[] arr3 = { 1, 2, 3, 4, 5, 6, 7 };
         * int[] arr4 = { 1, 2, 3, 4, 5, 6, 7 };
         * int[][] matrix = { arr1, arr2, arr3, arr4 };
         * 
         * for(int i =0;i<matrix.length;i++){
         * int [] target = matrix[i];
         * int st = 0;
         * int end = target.length-1;
         * while(st<end){
         * int temp = target[st];
         * target[st]= target[end];
         * target[end] = temp;
         * st++;
         * end--;
         * }
         * 
         * 
         * }
         * System.out.println(Arrays.deepToString(matrix));
         */
        // que 19
        int[][] arr1 = { { 1, 2, 3, 4 }, { 10, 13, 14, 15 }, { 20, 30, 40, 50 } };
        int totalEle = arr1.length * arr1[0].length;
        int count = 0;
        int rowMin = 0;
        int rowmax = arr1.length - 1;
        int colMin = 0;
        int colmax = arr1[0].length - 1;
        while (count < totalEle) {
            for (int col = colMin; col < colmax && count < totalEle; col++) {

                System.out.println(arr1[rowMin][col] + " ");
                count++;
            }
            for (int row = rowMin; row <rowmax && count < totalEle; row++) {

                System.out.println(arr1[row][colmax] + " ");
                count++;
            }
            for (int colm = colmax; colm > colMin && count < totalEle; colm--) {

                System.out.println(arr1[rowmax][colm] + " ");
                count++;
            }

            for (int rowm = rowmax; rowm >rowMin && count < totalEle; rowm--) {

                System.out.println(arr1[rowm][colMin] + " ");
                count++;
            }

            rowMin++;
            rowmax--;

            colMin++;
            colmax--;

        }

    }

}
