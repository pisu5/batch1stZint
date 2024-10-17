package AdvancedJava;

import java.util.ArrayList;

public class Recursions {
    public static void main(String[] args) {
        /*
         * // Recursions.printt(5);
         * // int g = Recursions.factorial(5);
         * /// System.out.println(g);
         * int[] arr = { 1, 2, 3, 4, 5, 5, 5, 6, 6, 7, 3 };
         * // int last = lastOcuuc(arr, 3, arr.length - 1);
         * int first = firstOcuuc(arr, 3, 0);
         * System.out.println(first);
         */

        // String d = "abc";
        // permutationFind(d, "");

        int n = 4;

        ArrayList<String> ans = getPath(n);
        System.out.println(ans);

    }
    // que 1,2
    /*
     * public static void printt(int n) {
     * if (n == 0) {
     * return;
     * }
     * 
     * System.out.println(n);
     * printt(n - 1);
     * }
     * // que
     * 
     * public static int factorial(int n) {
     * if (n == 0) {
     * return 1;
     * }
     * return n + factorial(n - 1);
     * }
     * public static int lastOcuuc(int arr[], int ele, int index) {
     * if (index == -1) {
     * return -1;
     * } else if (arr[index] == ele) {
     * return index;
     * 
     * }
     * int ans = lastOcuuc(arr, ele, index - 1);
     * return ans;
     * 
     * }
     * 
     * public static int firstOcuuc(int arr[], int ele, int index) {
     * if (index == arr.length) {
     * return -1;
     * } else if (arr[index] == ele) {
     * return index;
     * 
     * }
     * int ans = firstOcuuc(arr, ele, index + 1);
     * return ans;
     * 
     * }
     * 
     * public static void permutationFind(String s, String ans) {
     * if (s.length() == 0) {
     * System.out.println(ans);
     * return;
     * }
     * 
     * 
     * for (int i = 0; i < s.length(); i++) {
     * char ch = s.charAt(i);
     * String rem = s.substring(0, i) + s.substring(i + 1);
     * permutationFind(rem, ans + ch);
     * }
     * 
     * }
     * 
     */

    public static ArrayList<String> getPath(int n) {
        ArrayList<String> ans = new ArrayList<>();
        if (n == 0) {
            ans.add(" ");
            return ans;
        } else if (n < 0) {
            return ans;
        }
        ArrayList<String> ans1 = getPath(n - 1); // recursive func
        ArrayList<String> ans2 = getPath(n - 2); // recursive func
        ArrayList<String> ans3 = getPath(n - 3); // recursive func

        for (String s : ans1) {
            ans.add("1" + s);
        }
        for (String s : ans2) {
            ans.add("2" + s);
        }
        for (String s : ans3) {
            ans.add("3" + s);
        }

        return ans;
    }

}
