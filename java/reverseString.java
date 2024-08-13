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
         * 
         * //que 7
         * String s = "i love my country because I am indian";
         * 
         * String ans = "";
         * boolean iscap = true;
         * 
         * for (int i = 0; i < s.length(); i++) {
         * char curentChar = s.charAt(i);
         * 
         * if (curentChar == ' ') {
         * ans += curentChar;
         * iscap = true;
         * } else {
         * if (iscap) {
         * ans += Character.toUpperCase(curentChar);
         * iscap = false;
         * 
         * } else {
         * ans += Character.toLowerCase(curentChar);
         * }
         * 
         * }
         * 
         * }System.out.println(ans);
         * 
         * //remove consucutive duplicates
         * String s = "oiiindddiaoon";
         * String ans = "" + s.charAt(0); // i
         * for (int i = 1; i < s.length(); i++) {
         * char start = s.charAt(i - 1); // 0 2-1=1
         * char next = s.charAt(i); // i
         * if (start != next) {
         * ans += next;
         * 
         * }
         * 
         * }
         * System.out.println(ans);
         * 
         * String s = "oiiindddiaoon";
         * String ans = "" + s.charAt(0); // i
         * for (int i = 0; i < s.length(); i++) {
         * char c = s.charAt(i);
         * boolean isDupli = false;
         * 
         * // check if char is dduple
         * 
         * for (int j = 0; j < s.length(); j++) {
         * if (i != j && c == s.charAt(j)) {
         * isDupli = true;
         * break;
         * 
         * }
         * }
         * if (!isDupli) {
         * ans += c;
         * }
         * }
         * System.out.println(ans);
         */
        String s = "innndiaaa";
        String ans = "" + s.charAt(0); // i
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(ans.indexOf(c)==-1){
                ans+=c;
            }
        }
        System.out.println(ans);

    }

}
