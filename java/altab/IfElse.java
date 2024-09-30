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
         * // que 2
         * System.out.println("Enter character");
         * char ch = 'g';
         * if (ch > 'A' && ch <= 'Z') {
         * System.out.println("Given letter is capital");
         * 
         * } else if (ch > 'a' && ch <= 'z') {
         * 
         * System.out.println("Given letter is smaller");
         * 
         * }else{
         * System.out.println("invalid");
         * }
         * // que 3
         * int sideA = sc.nextInt();
         * int sideB = sc.nextInt();
         * int sideC = sc.nextInt();
         * 
         * // store sum
         * int sum = sideA + sideB + sideC;
         * if (sum == 180) {
         * System.out.println("Trinagle is valid");
         * } else {
         * System.out.println("Triangle is not valid");
         * }
         * //que 5
         * System.out.println("enter month num");
         * int monthNum = sc.nextInt();
         * if(monthNum==1){
         * System.out.println("jan");
         * }else if(monthNum==2){
         * System.out.println("feb");
         * }else if(monthNum==3){
         * System.out.println("march");
         * }
         * 
         * // que 6
         * int a = sc.nextInt();
         * int b = sc.nextInt();
         * int c = sc.nextInt();
         * if (a == b) { // outer if
         * if (b == c) { // inner if
         * System.out.println("Equalilateral triangle");
         * 
         * } else {
         * System.out.println("Isocles triangle");
         * 
         * }
         * } else if (b == c || c == a) {
         * System.out.println("isocles triangle");
         * } else {
         * System.out.println("scelene");
         * }
         * 
         * // que 7
         * int physics = sc.nextInt();
         * int chemistery = sc.nextInt();
         * 
         * int math = sc.nextInt();
         * 
         * int bio = sc.nextInt();
         * 
         * int computer = sc.nextInt();
         * 
         * int sum = physics + chemistery + math + bio + computer;
         * 
         * int percentage = sum / 5;
         * if(percentage>=90){
         * System.out.println("Grade a");
         * }else if(percentage>=80){
         * System.out.println("grade b");
         * }else if(percentage>=70){
         * System.out.println("grade c");
         * }else if(percentage>60){
         * System.out.println("grade d");
         * }else if(percentage>=40){
         * System.out.println("grade e");
         * }else{
         * System.out.println("you are failed");
         * }
         * 
         */
        //que 8
        int ajay = sc.nextInt();
        int ram = sc.nextInt();
        int shyam = sc.nextInt();
        if (ajay < ram) {
            if (ajay < shyam) {
                System.out.println("ajay is yougest boy");
            } else {
                System.out.println("Shyam is younhgest");
            }
        } else if (ram < shyam) {
            System.out.println("ram is youngest");
        } else {
            System.out.println("Shyam is youngest");

        }

    }

}
