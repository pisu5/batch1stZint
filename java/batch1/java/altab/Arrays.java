package batch1.java.altab;

public class Arrays {
    public static void main(String[] args) {
        // que 1
        /*
         * int[] arr = new int[10];
         * arr[0] = 45;
         * arr[1] = 56;
         * arr[2] = 78;
         * int[] arr2 = { 1, 2, 4, 5, 6, 7 };
         * for(int i =0;i<arr2.length;i++){
         * System.out.println(arr2[i]);
         * }
         * 
         * arr2[3] = 600;
         * System.out.println(arr2[3]);
         * System.out.println(arr2.length);
         * // que 9
         * 
         * int[] arr2 = { 1, 2, 4, 5, 6, 7 ,0,-45};
         * for (int i = 0; i < arr2.length; i++) {
         * for (int j = i + 1; j < arr2.length; j++) {
         * int temp = 0;
         * if (arr2[i] > arr2[j]) {
         * temp = arr2[i];
         * arr2[i] = arr2[j];
         * arr2[j] = temp;
         * 
         * }
         * }
         * }
         * 
         * for(int i = 0;i<arr2.length;i++){
         * System.out.println(arr2[i]);
         * }
         * int[] arr2 = { 1, 2, 4, 5, 6, 7, 0, -45 };
         * int endPointer = arr2.length - 1;
         * int startPointer = 0;
         * while (startPointer < endPointer) {
         * int temp = 0;
         * temp = arr2[startPointer];
         * arr2[startPointer] = arr2[endPointer];
         * arr2[endPointer] = temp;
         * startPointer++;
         * endPointer--;
         * 
         * }
         * for (int i = 0; i < arr2.length; i++) {
         * System.out.println(arr2[i]);
         * }
         * 
         * //que 13
         * int[] arr2 = { 1, 2, 4, 2, 2, 7, 0, 2, -45 };
         * int firstIndex = -1;
         * int lastIndex = -1;
         * int ele = 2;
         * boolean isFounf = true;
         * for (int i = 0; i < arr2.length; i++) {
         * 
         * if (isFounf) {
         * if (ele == arr2[i]) {
         * firstIndex = i;
         * isFounf = false;
         * }
         * 
         * } else if (ele == arr2[i]) {
         * System.out.println("prkfv");
         * lastIndex = i;
         * 
         * }
         * 
         * }
         * System.out.println(firstIndex);
         * System.out.println(lastIndex);
         * // que 16
         * 
         * int[] arr2 = { 1, 2, 4, 5, 6, 7, 0, -45 };
         * 
         * int[] res = new int[arr2.length];
         * int k = 2;
         * for (int i = 0; i < arr2.length; i++) {
         * if (arr2[i] != k) {
         * res[i] = arr2[i];
         * 
         * }
         * }
         * 
         * for (int i = 0; i < res.length; i++) {
         * System.out.println(res[i]);
         * // que 18
         * int[] arr2 = { 1, 2, 4, 5, 6, 7, 0, -45 };
         * int max = Integer.MIN_VALUE;
         * int min = Integer.MAX_VALUE;
         * for (int i = 0; i < arr2.length; i++) {
         * if (arr2[i] > max) {
         * max = arr2[i];
         * } else if (arr2[i] < min) {
         * min = arr2[i];
         * }
         * }
         * System.err.println("Max element is" + " " + max + " " + "and Min element is"
         * + " " + min);
         * }
         * // que 19
         * 
         * int val = 8;
         * int count = 0;
         * 
         * int[] arr2 = { 1, 2, 4, 5, 6, 7, 0, -45 };
         * for (int i = 0; i < arr2.length; i++) {
         * for (int j = i + 1; j < arr2.length; j++) {
         * if (arr2[i] + arr2[j] == val) {
         * count++;
         * 
         * }
         * }
         * 
         * }
         * System.out.println(count);
         * // que 20
         * int[] arr2 = { 1, 2, 4, 5, 6, 7, 0, -45 };
         * int max = Integer.MIN_VALUE;
         * int smax = Integer.MIN_VALUE;
         * for (int i = 0; i < arr2.length; i++) {
         * if (arr2[i] > max) {
         * smax = max;
         * max = arr2[i];
         * 
         * } else if (arr2[i] > smax && arr2[i] != max) {
         * smax = arr2[i];
         * }
         * 
         * }
         * System.out.println(smax);
         * int[] arr2 = { 1, 2, 4, 5, 6, 7, 0, -45 };
         * int countEven =0;
         * for(int i =0;i<arr2.length;i++){
         * if(arr2[i]%2==0){
         * countEven++;
         * // count = count+arr2[i];
         * }
         * 
         * }
         * System.out.println(countEven);
         * int[] arr2 = { 1, 2, 4, 5, 6, 7, 0, -45 };
         * int ele = -45;
         * int index = -1;
         * 
         * for(int i =0;i<arr2.length;i++){
         * if(arr2[i]==ele){
         * index = i;
         * break;
         * 
         * }
         * 
         * }
         * System.out.println(index);
         * int []asc ={2,3,5};
         * boolean isAsc = true;
         * for(int i =0;i<asc.length-1;i++){
         * if(asc[i]>asc[i+1]){
         * isAsc = false;
         * break;
         * 
         * 
         * }
         * }
         * if(isAsc){
         * System.out.println("Arrays is sort");
         * }else{
         * System.out.println("Array is not sort");
         * }
         * 
         * 
         */
        int g[] = { 1, 2, 3, 4, 5, 6, 8 };

        boolean isRange = true;
        int missing = 0;
        for (int i = 0; i < g.length - 1; i++) {

            int curr = g[i] + 1;
            int nextNum = g[i + 1];
            if (curr != nextNum) {
                isRange = false;
                missing = curr;
                break;

            }
        }
        if (isRange) {
            System.out.println("Arrays is in range");
        } else {
            System.out.println("not " + " " + missing);
        }

    }
}
