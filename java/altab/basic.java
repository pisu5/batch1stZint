package batch1.java.altab;

public class basic {
    public static void main(String[] args) {
        // airthmetic opearators
        /*
         * int a = 5;
         * int b = 5;
         * System.out.println(a+b);
         */

        // post and pree
        // que 1
        /*
         * int a = 2;
         * int b = a++ + ++a;
         * System.out.println(b);
         * 
         * int c = 2;
         * int d = c++ + ++c + ++c + --c + c-- + c++;
         * System.out.println(d);
         * // que 2
         * int c = 2;
         * int d = c++ + ++c;
         * System.out.println(d++ + ++d + ++d + ++d);
         * // que 3
         * int x = 2;
         * int y = 3;
         * int z = x++ + ++y + y++ + ++x + x++ + ++y;
         * System.out.println(z);
         * System.out.println(x);
         * System.out.println(y);
         * System.out.println("hello world");
         * System.out.println("23+45");
         * // que 4
         * int a = 1;
         * int b = a++ + a++ + ++a + a++ + ++a;
         * System.out.println("a: " + a + ", b: " + b);
         * 
         */
        // que 1 control flow start
        /*
         * int number = 7;
         * if (number % 2 == 0) {
         * System.out.println("given num is even");
         * 
         * } else {
         * System.out.println("num is odd");
         * }
         * // que 2
         * int num = 4;
         * if (num < 0) {
         * System.out.println("num is negative");
         * } else {
         * System.out.println("num is positive");
         * }
         * 
         * int age = 34;
         * if(age<18){
         * System.out.println("not eligible to give vote");
         * }else{
         * System.out.println("eligible to give vote");
         * }
         * 
         * int m = 2;
         * int n = 2;
         * int p = (m++ * ++n) + (++m * n++);
         * System.out.println("m: " + m + ", n: " + n + ", p: " + p);
         * 
         * int x = 1, y = 1, z = 1;
         * int result = x++ + ++x * y++ + y++ * ++z + z++;
         * System.out.println("x: " + x + ", y: " + y + ", z: " + z + ", result: " +
         * result);
         */

        int a = 5;
        int b = a++ + ++a * a++ + ++a;
        System.out.println("a: " + a + ", b: " + b);

    }

}
