public class reverseString {
    public static void main(String[] args) {
        // que 1
        /*
         * String s = "Hello";
         * String ans = "";
         * for (int i = s.length() - 1; i >= 0; i--) {
         * char c = s.charAt(i);
         * ans += c;
         * }
         * System.out.println(ans);
         * 
         * String mom = "wow";
         * int i = 0;
         * int last = mom.length() - 1;
         * boolean ispali = true;
         * while (i <= last) {
         * char first = mom.charAt(i);
         * char last2 = mom.charAt(last);
         * if (first != last2) {
         * ispali = false;
         * break;
         * }
         * i++;
         * last--;
         * }
         * System.out.println(ispali);
         * 
         * 
         * // que 4 appro 1
         * String s =
         * "Time ijjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjs moneyyyyyyyyyyyyyyyyyyy"
         * ;
         * int max = 0;
         * int currLength = 0;
         * for (int i = 0; i < s.length(); i++) {
         * char c = s.charAt(i);
         * if (c != ' ') {
         * currLength++;
         * 
         * } else {
         * max = Math.max(max, currLength);
         * currLength = 0;
         * 
         * }
         * 
         * }
         * max = Math.max(max, currLength);
         * System.out.println(max);
         * 
         * // aaproach 2
         * String s =
         * "Time ijjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjs moneyyyyyyyyyyyyyyyyyyy"
         * ;
         * String[] array = s.split(" ");
         * int max = 0;
         * for (int i = 0; i < array.length; i++) {
         * String temp = array[i];
         * if (max < temp.length()) {
         * max = temp.length();
         * 
         * }
         * }
         * System.out.println(max);
         * 
         * //que 4
         * String s = "ls knc vjd";
         * 
         * int count = 0;
         * char[] remove = new char[10];
         * for (int i = 0; i < s.length(); i++) {
         * char c = s.charAt(i);
         * if (c != ' ') {
         * remove[count] = c;
         * count++;
         * 
         * 
         * }
         * }
         * for(char c: remove){
         * System.out.println(c);;
         * }
         */
        String s = "i love my country because I am indian";

        String ans = "";
        boolean iscap = true;

        for (int i = 0; i < s.length(); i++) {
            char curentChar = s.charAt(i);

            if (curentChar == ' ') {
                ans += curentChar;
                iscap = true;
            } else {
                if (iscap) {
                    ans += Character.toUpperCase(curentChar);
                    iscap = false;

                } else {
                    ans += Character.toLowerCase(curentChar);
                }

            }

        }System.out.println(ans);

    }

}
