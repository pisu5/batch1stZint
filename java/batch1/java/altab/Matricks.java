package batch1.java.altab;

public class Matricks {
    public static void main(String[] args) {
        int mat[][] = new int[2][3]; // declare
        mat[0][0] = 45;
        mat[0][1] = 34;
        mat[0][2] = 55;

        mat[1][0] = 45;
        mat[1][1] = 34;
        mat[1][2] = 55;
        int sum  = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                sum +=mat[i][j];
                System.out.println(mat[i][j]);
            }
        }

    }
}
