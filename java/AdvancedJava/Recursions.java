package batch1.java.AdvancedJava;

public class Recursions {
    public static void main(String[] args) {
        // Recursions.printt(5);
        int g = Recursions.factorial(5);
        System.out.println(g);

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
     */
    // que

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n + factorial(n - 1);
    }

}
