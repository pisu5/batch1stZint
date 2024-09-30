package batch1.java.altab;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // que 2
        /*
         * System.out.println("Enter week number");
         * int week = sc.nextInt();
         * 
         * if (week == 1) {
         * System.out.println("Today is Monday");
         * } else if (week == 2) {
         * System.out.println("Today is tuesday");
         * 
         * } else if (week == 3) {
         * System.out.println("Today is wednesday");
         * 
         * } else if (week == 4) {
         * System.out.println("Today is thursday");
         * 
         * } else if (week == 5) {
         * System.out.println("Today is friaday");
         * 
         * } else if (week == 6) {
         * System.out.println("Today is saturday");
         * 
         * } else if (week == 7) {
         * System.out.println("Today is sunday");
         * 
         * } else {
         * System.out.println("Invalid input");
         * 
         * }
         */
        /*
         * System.out.
         * println("Enter alphabet letter for what you check whether vowel or consonent"
         * );
         * char ch = sc.next().charAt(0); //
         * if (ch == 'a') {
         * System.out.println("Vowel");
         * } else if (ch == 'A') {
         * System.out.println("Vowel");
         * 
         * } else if (ch == 'E') {
         * System.out.println("vowel");
         * }
         */
        // que 2
        System.out.println("Enter character");
        char ch = 'g';
        if (ch > 'A' && ch <= 'Z') {
            System.out.println("Given letter is capital");

        } else if (ch > 'a' && ch <= 'z') {

            System.out.println("Given letter is smaller");

        }else{
            System.out.println("invalid");
        }

    }

}
