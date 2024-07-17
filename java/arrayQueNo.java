/**
 * arrayQueNo
 */
public class arrayQueNo {
    public static void main(String[] args) {
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
         */
        // que 9th 2nd app
        int[] original = { 3, 4, 5, 6, 7, 8, 9, 1, 4, 47, 8 };
        int[] sorted = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            int smallestEle = original[0];
            int smallestIndex = 0;
            for (int j = 1; j < original.length; j++) {
                if (original[j] < smallestEle) {
                    smallestEle = original[j];
                    smallestIndex = j;
                }

            }
            sorted[i] = smallestEle;
            original[smallestIndex] = Integer.MAX_VALUE;

        }
        for (int z = 0; z < sorted.length; z++) {
            System.out.println("Sorted value" + " " +  sorted[z]);

        }

    }
}