package batch1.java.AdvancedJava;

public class Recursions {
    public static void main(String[] args) {
        // Recursions.printt(5);
        // int g = hcf(10, 5);
        /// System.out.println(g);
        toh(5,'s','d','h');

    }

    // que 1,2
    /*
     * public static void printt(int n) {
     * if (n == 0) {
     * return;
     * }
     * 
     * System.out.println(n);
     * printt(n - 1);
     * }
     * 
     * public static int factorial(int n) {
     * if (n == 0) {
     * return 1;
     * }
     * return n + factorial(n - 1);
     * }
     * public static int hcf(int a, int b) {
     * if (b == 0) {
     * return a;
     * }
     * return hcf(b, a % b);
     * }
     * 
     */
    // que

    public static void toh(int disk, char s, char d, char h) {
        if (disk == 1) {
            System.out.println(disk + " [ " + s + " --> " + d + " ] ");
            return;
        }
        toh(disk - 1, s, h, d);
        System.out.println(disk + " [ " + s + " --> " + d + " ] ");
        toh(disk - 1, h, d, s);

    }

}
