package batch1.java.altab;

import java.util.Scanner;

public class forloops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * int a = 0;
         * int b = 1;
         * int fibo = 10;
         * 
         * int c = 0;
         * 
         * for (int i = 2; i <= fibo; i++) {
         * // next step.
         * c = a + b;
         * a = b;
         * b = c;
         * 
         * }
         * System.out.println(c);
         * 
         * // que 5
         * 
         * String s = "jsdj wfjief wjfrwjwir shndjfwhfj";
         * 
         * for (int i = 0; i < s.length(); i++) {
         * char c = s.charAt(i);
         * if (c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u') {
         * System.out.println("vowels found at index" + " " + i);
         * }
         * 
         * }
         */

        // que 7
        System.out.println("Enter number ");
        int num = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " " + "is Prime");
        } else {
            System.out.println("Non Prime");
        }

    }

}
