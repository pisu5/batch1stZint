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
         */
        int[] arr2 = { 1, 2, 4, 2, 2, 7, 0, 2, -45 };
        int firstIndex = -1;
        int lastIndex = -1;
        int ele = 2;
        boolean isFounf = true;
        for (int i = 0; i < arr2.length; i++) {
            
            if (isFounf) {
                if (ele == arr2[i]) {
                    firstIndex = i;
                    isFounf = false;
                }

            } else if (ele == arr2[i]) {
                System.out.println("prkfv");
                lastIndex = i;

            }

        }
        System.out.println(firstIndex);
        System.out.println(lastIndex);
    }

}
