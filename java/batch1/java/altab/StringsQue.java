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
         * String dup = "rrrrr ffffggggsss";
         * String ans = ""+dup.charAt(0);
         * for (int i = 1; i < dup.length(); i++) {
         * char pre = dup.charAt(i - 1);
         * char post = dup.charAt(i);
         * if (pre != post) {
         * ans += post;
         * 
         * }
         * }
         * System.out.println(ans);
         * // que 9
         * 
         * String str = "mmcfffhhhhhyyyyzzz";
         * int[] arr = new int[26];
         * for (int i = 0; i < str.length(); i++) {
         * char ch = str.charAt(i);
         * if (ch >= 'a' && ch <= 'z') {
         * int idx = (int) (ch - 'a'); // ascii value
         * arr[idx] = arr[idx] + 1;
         * } else if (ch >= 'A' && ch <= 'Z') {
         * int idx = (int) (ch - 'A'); // ascii value
         * arr[idx] = arr[idx] + 1;
         * 
         * }
         * }
         * 
         * int max = 0;
         * int smax = 0;
         * for(int i =0;i<26;i++){
         * if(arr[max]<arr[i]){
         * smax = max;
         * max = i;
         * }else if(arr[smax]<arr[i]){
         * smax = i;
         * }
         * 
         * }
         * char c = (char)('a'+smax);
         * System.out.println(c);
         * //que 11
         * String f = "123243556";
         * boolean isDigit =true;
         * for(int i =0;i<f.length();i++){
         * char h = f.charAt(i);
         * if(!(h>='0'&&h<='9')){
         * isDigit = false;
         * break;
         * 
         * 
         * }
         * }
         * 
         * if(isDigit){
         * System.out.println("Yes");
         * }else{
         * System.out.println("No");
         * }
         */
        // que 12
        String s = "lmmfwmdm klhlh jhu ";
        String ans = "";
        String[] arr = s.split(" ");
        String firstWord = arr[0];
        char fc = firstWord.charAt(0);
        if (fc >= 'A' && fc <= 'Z') {
            fc = (char) ((fc - 'A' + 'a'));
            firstWord = fc + firstWord.substring(1);
        }
        ans += firstWord;

        for (int i = 1; i < arr.length; i++) {
            String temp = arr[i];
            char cg = temp.charAt(0);

            if (cg >= 'a' && cg <= 'z') {
                cg = (char) (cg - 'a' + 'A');
                temp = cg + temp.substring(1);
            }
            ans += temp;

        }

        System.out.println(ans);

    }

}
