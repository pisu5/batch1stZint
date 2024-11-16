package batch1.java.altab;

import java.util.Arrays;

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
         * // que 10
         * 
         * int[][] ori = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14,
         * 15, 16 } };
         * int[][] copy = new int[ori.length][ori[0].length];
         * for(int i =0;i<ori.length;i++){
         * for(int j =0;j<ori[0].length;j++){
         * copy[i][j] = ori[i][j];
         * }
         * 
         * }
         * //que 11
         * int[][] ori = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14,
         * 15, 16 } };
         * int rows = ori.length;
         * int col = ori[0].length;
         * for(int j =0;j<col;j++){
         * for(int i =0;i<rows;i++){
         * System.out.println(ori[i][j]);
         * }
         * }
         * 
         * 
         * // que 14
         * int[][] ori = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14,
         * 15, 16 } };
         * 
         * int row = -1;
         * int largestSum = Integer.MIN_VALUE;
         * for (int i = 0; i < ori.length; i++) {
         * int rowSum = 0;
         * 
         * for (int j = 0; j < ori[0].length; j++) {
         * int curr = ori[i][j];
         * rowSum += curr;
         * 
         * }
         * if (rowSum > largestSum) {
         * largestSum = rowSum;
         * row = i;
         * }
         * 
         * }
         * System.out.println(row);
         * // que 16
         * int search = 11;
         * int[][] ori = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14,
         * 15, 16 } };
         * int rs = 0;
         * int cs = 0;
         * 
         * int r = 0;
         * int col = ori[0].length - 1;
         * while (r < ori.length && col >= 0) {
         * if (search == ori[r][col]) {
         * rs = r;
         * cs = col;
         * break;
         * 
         * } else if (search < ori[r][col]) {
         * col--;
         * } else if (search > ori[r][col]) {
         * r++;
         * }
         * 
         * }
         * System.out.println("Element is found at Row" + " " + rs + "" + "and col" +
         * " " + cs);
         * 
         * // que 17
         * int[][] ori = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14,
         * 15, 16 } };
         * 
         * // 1st way using odd even
         * 
         * for (int c = 0; c < ori[0].length; c++) {
         * if (c % 2 == 0) {
         * for (int r = 0; r < ori.length; r++) {
         * System.out.println(ori[r][c]);
         * }
         * } else {
         * for (int r = ori.length - 1; r >= 0; r--) {
         * System.out.println(ori[r][c]);
         * 
         * }
         * 
         * }
         * }
         * 
         * // 2nd way using boolean
         * boolean flag = true;
         * for (int c = 0; c < ori[0].length; c++) {
         * if (flag) {
         * for (int r = 0; r < ori.length; r++) {
         * System.out.println(ori[r][c]);
         * }
         * flag = false;
         * 
         * } else {
         * for (int r = ori.length - 1; r >= 0; r--) {
         * System.out.println(ori[r][c]);
         * 
         * }
         * flag =true;
         * 
         * }
         * 
         * }
         * 
         * // 18
         * 
         * int[][] ori = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14,
         * 15, 16 } };
         * 
         * for (int k = 0; k < ori.length; k++) {
         * for (int r = 0; r < ori.length; r++) {
         * for (int c = 0; c < ori[0].length; c++) {
         * if (r + k == c) {
         * System.out.println(ori[r][c]);
         * }
         * }
         * }
         * }
         * 
         * // que 19
         * int[][] ori = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14,
         * 15, 16 } };
         * 
         * int allEle = ori.length * ori[0].length;
         * int count = 0;
         * int rowMin = 0;
         * int rowmax = ori.length - 1;
         * int colMin = 0;
         * int colmax = ori[0].length - 1;
         * while (count < allEle) {
         * for (int r = 0; r <= rowmax && count < allEle; r++) {
         * System.out.println(ori[r][colMin]);
         * count++;
         * }
         * 
         * for (int c = colMin + 1; c <= colmax && count < allEle; c++) {
         * System.out.println(ori[rowmax][c]);
         * }
         * 
         * for (int r = rowmax - 1; r >= rowMin && count < allEle; r--) {
         * System.out.println(ori[r][colmax]);
         * count++;
         * }
         * 
         * for (int c = colmax - 1; c >= colMin + 1 && count < allEle; c--) {
         * System.out.println(ori[rowMin][c]);
         * count++;
         * }
         * 
         * colMin++;
         * rowmax--;
         * colmax--;
         * rowMin++;
         * 
         * }
         * 
         * // que 20
         * int[][] grid = {
         * { 0, 1, 0, 0 },
         * { 1, 0, 1, 0 },
         * { 0, 0, 0, 1 }
         * };
         * 
         * int row = 0;
         * int col = 0;
         * int direction = 0;
         * 
         * while (true) {
         * direction = (direction + grid[row][col] % 4);
         * if (direction == 0) {
         * col++;
         * } else if (direction == 1) {
         * row++;
         * } else if (direction == 2) {
         * col--;
         * } else if (direction == 3) {
         * row--;
         * 
         * }
         * if (row == grid.length) {
         * row--;
         * break;
         * } else if (row < 0) {
         * row++;
         * break;
         * } else if (col < 0) {
         * col++;
         * break;
         * }
         * }
         * System.out.println(row + " " + col);
         * 
         * 
         * // que 22
         * int[][] ori = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14,
         * 15, 16 } };
         * for(int i =0;i<ori.length;i++){
         * for(int j =i;j<ori[0].length;j++){
         * int k = ori[i][j];
         * ori[i][j] = ori[j][i];
         * ori[j][i] = k;
         * }
         * }
         * 
         * System.out.println(Arrays.deepToString(ori));
         */

        // que 23

        // que 22
        int[][] ori = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14,
                15, 16 } };
        for (int i = 0; i < ori.length; i++) {
            for (int j = i; j < ori[0].length; j++) {
                int k = ori[i][j];
                ori[i][j] = ori[j][i];
                ori[j][i] = k;
            }
        }

        for (int i = 0; i < ori.length; i++) {
            int[] target = ori[i];

            int st = 0;
            int end = target.length-1;
            while (st < end) {
                int temp = target[st];
                target[st] = target[end];
                target[end] = temp;
                st++;
                end--;
            }

        }

        System.out.println(Arrays.deepToString(ori));

    }
}
