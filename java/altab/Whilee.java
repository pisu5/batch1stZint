package batch1.java.altab;

import java.util.Scanner;

public class Whilee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* int n = sc.nextInt();

        int temp = n;
        int sum = 0;
        while (n > 0) {

            int digit = n % 10; // get last digit
            int cube = (digit * digit * digit); // cube
            sum += cube;
            n = n / 10; // remove last digit

        }

        if (sum == temp) {
            System.out.println("Given num is armstrong");
        } else {
            System.out.println("not");
        }*/ 

        //que 11
        int n = sc.nextInt();
        int rev = 0;
        while(n>0){
            int digit = n % 10; // get last digit
            rev = rev*10+digit;
            n/=10;

        }
        System.out.println(rev);
    }

}
