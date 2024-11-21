package batch1.java.altab;

import java.util.Scanner;

public class StringsQue {
    public static void main(String[] args) {
        // que 1
        /*
         * Scanner sc = new Scanner(System.in);
         * String s = sc.nextLine();
         * String rev = "";
         * for(int i =s.length()-1;i>=0;i--){
         * char c = s.charAt(i);
         * rev+=c;
         * }
         * System.out.println(rev);
         * 
         * //que 2
         * String str = "madrrrdsam";
         * int left = 0;
         * int right = str.length()-1;
         * boolean ispali = true;
         * while(left<right){
         * if(str.charAt(left)!=str.charAt(right)){
         * ispali = false;
         * break;
         * }
         * left++;
         * right--;
         * }
         * 
         * if(ispali){
         * System.out.println("yez");
         * }else{
         * System.out.println("no");
         * }
         * String s = "i love my india";
         * String [] sp = s.split("\\s+");
         * 
         * int maxLength = 0;
         * for(int i =0;i<sp.length;i++){
         * if(sp[i].length()>maxLength){
         * maxLength = sp[i].length();
         * }
         * }
         * System.out.println(maxLength);
         * 
         * 
         * String s = "lfe ekjfef wkjdkwjd";
         * String[] g = s.split(" ");
         * String ans = " ";
         * for (int i = 0; i < g.length; i++) {
         * String temp = g[i];
         * char ch = temp.charAt(0);
         * 
         * if (ch >= 'a' && ch <= 'z') {
         * ch = (char) (ch - 'a' + 'A');
         * String rem = temp.substring(1);
         * rem = ch + rem;
         * ans += rem + "";
         * } else {
         * ans += temp + " ";
         * }
         * 
         * }
         * System.out.println(ans);
         * //convert lower to upper
         * 
         * char ch = 'e';
         * ch = (char)(ch-'a'+'A');
         * System.out.println(ch);
         * 
         * char ch = 'A';
         * ch = (char) (ch + 'a' - 'A');
         * System.out.println(ch);
         * //que 8
         * 
         * String str = "neee oyokdm rrrr";
         * String ans = "";
         * for(int i =0;i<str.length();i++){
         * char ch = str.charAt(i);
         * if(ch!=' '){
         * ans+=ch;
         * }
         * }
         * System.out.println(ans);
         * 
         * 
         */

        String dup = "rrrrr ffffggggsss";
        String ans = ""+dup.charAt(0);
        for (int i = 1; i < dup.length(); i++) {
            char pre = dup.charAt(i - 1);
            char post = dup.charAt(i);
            if (pre != post) {
                ans += post;

            }
        }
        System.out.println(ans);

    }

}
