import java.util.Arrays;

/**
 * arrayQueNo
 */
public class arrayQueNo {
    public static void main(String[] args) {
        /*
         * copy array int [] ar = {1,2,45,6,76543,7,8,8,8,5,78,7,4,67,65,};
         * int[] copy = new int[ar.length];
         * for(int i = 0;i<ar.length;i++){
         * copy[i] = ar[i];
         * }
         * System.out.println(Arrays.toString(copy));
         */
        // que 9th
        /*
         * int [] arr = {5,1,3,8,-5,-9,74,-8498,4,0};
         * for(int i =0;i<arr.length;i++){
         * for(int j = i+1;j<arr.length;j++){
         * 
         * int temp = 0;
         * if(arr[i]>arr[j]){
         * temp = arr[i];
         * arr[i] = arr[j]; // append smallest val
         * arr[j] = temp;
         * 
         * 
         * }
         * }
         * System.out.println(arr[i]);
         * }
         * 
         * // que 9th 2nd app
         * int[] original = { 3, 4, 5, 6, 7, 8, 9, 1, 4, 47, 8 };
         * int[] sorted = new int[original.length];
         * for (int i = 0; i < original.length; i++) {
         * int smallestEle = original[0];
         * int smallestIndex = 0;
         * for (int j = 1; j < original.length; j++) {
         * if (original[j] < smallestEle) {
         * smallestEle = original[j];
         * smallestIndex = j;
         * }
         * 
         * }
         * sorted[i] = smallestEle;
         * original[smallestIndex] = Integer.MAX_VALUE;
         * 
         * }
         * for (int z = 0; z < sorted.length; z++) {
         * System.out.println("Sorted value" + " " + sorted[z]);
         * 
         * }
         * 
         * int[] arr = { 1, 2, 34, 34, 8, 35, 34 };
         * boolean falg = true;
         * int tar = 34;
         * int lastoccur = -1;
         * int firstOccur = -1;
         * for (int i = 0; i < arr.length; i++) {
         * if (arr[i] == tar && falg == true) {
         * firstOccur = i;
         * lastoccur = i;
         * falg = false;
         * 
         * } else if (arr[i] == tar) {
         * lastoccur = i;
         * 
         * }
         * 
         * }
         * System.out.println("First Occurance At index" + " " + firstOccur);
         * System.out.println("Last Occurance At index" + " " + lastoccur);
         * 
         * //Que 14
         * int[] arr = { 1, 2, 34, 34, 8, 35, 34 };
         * int tar = 34;
         * int freQuency = 0;
         * for (int i = 0; i < arr.length; i++) {
         * if (arr[i] == tar) {
         * freQuency++;
         * }
         * 
         * }
         * System.out.println(freQuency);
         */
        // int[] arr = { 2, 3, 4 };
        /*
         * int max = Integer.MIN_VALUE;
         * int smax = Integer.MIN_VALUE;
         * for (int i = 0; i < arr.length; i++) {
         * if (arr[i]>max) {
         * smax = max;
         * max = arr[i];
         * } else if (arr[i]<max && arr[i] > smax) {
         * smax = arr[i];
         * }
         * 
         * }
         * System.out.println(max);
         * System.out.println(smax);
         * 
         * boolean isSort = true;
         * for (int i = 1; i <= arr.length-1; i++) {
         * int temp = arr[i];
         * if (temp < arr[i - 1]) {
         * isSort = false;
         * break;
         * }
         * }
         * if(isSort){
         * System.out.println("Array is sort");
         * }else{
         * System.out.println("Array is not sort");
         * }
         * 
         * int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
         * int[] arr2 = { -1, 1, 1, 9, 10, 11, 12, 13, 14, 15, 16 };
         * int[] res = new int[arr1.length + arr2.length];
         * int p1 = 0;
         * int p2 = 0;
         * int p3 = 0;
         * while (p3 < res.length) {
         * int val1 = p1 < arr1.length ? arr1[p1] : Integer.MAX_VALUE; // ternary ope
         * shorthand of true false
         * 
         * int val2 = p2 < arr2.length ? arr2[p2] : Integer.MAX_VALUE;
         * if (val1 < val2) {
         * res[p3] = val1;
         * p3++;
         * p1++;
         * } else {
         * res[p3] = val2;
         * p3++;
         * p2++;
         * }
         * }
         * System.out.println(Arrays.toString(res));
         * 
         * //que no 32
         * int [] arr = {123,234};
         * int [] arr2 = {1,233};
         * int sum = 0;
         * for(int i =0;i<arr.length;i++){
         * int temp = arr[i];
         * while(temp>0){
         * int ld = temp%10;
         * sum+=ld;
         * temp/=10;
         * 
         * }
         * }
         * for(int i =0;i<arr2.length;i++){
         * int temp = arr2[i];
         * while(temp>0){
         * int ld = temp%10;
         * sum+=ld;
         * temp/=10;
         * 
         * }
         * }
         * System.out.println(sum);
         */
        //print array an barchartv form
        int[] arr = { 7, 5, 4, 6, 8, 4, 3, 7 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        for (int level = max; level >= 1; level--) {
            for (int star = 0; star < arr.length; star++) {
                if (level < arr[star]) {
                    System.out.print("\t*");

                }else{
                    System.out.print("\t");
                }

            }
            System.out.println();

        }
    }
}
