/**
 * arrayQueNo
 */
public class arrayQueNo {

    public static void main(String[] args) {
        int [] arr = {5,1,3,8,-5,-9,74,-8498,4,0};
        for(int i =0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){

                int temp = 0;
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j]; // append smallest val
                    arr[j] = temp;


                }
            }
            System.out.println(arr[i]);
        }
    }
}