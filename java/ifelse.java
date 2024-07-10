import java.util.Scanner;

public class ifelse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * //que 1
         * int num = sc.nextInt();
         * if(num<0){
         * System.out.println("Number is negative");
         * }else if(num==0){
         * System.out.println("Num is 0");
         * 
         * }else{
         * System.out.println("positive");
         * }
         * 
         */
        // que 2
        char ch = sc.next().charAt(0);
        if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                || (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
            System.out.println("Char is Vowel");

        } else {
            System.out.println("Char is consonent");
        }

    }

}
