import java.util.ArrayList;

class Arraylist {
    public static void main(String[] args) {
      //  Arraylist.index(10);
        int arr [] = {1,2,3,4,4,4,5,5,6,6,7,7,8,8};
      System.out.println( Arraylist.removeDuplicates(arr)); 

    }

    public static void index(int length) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> fruits = new ArrayList<>();

        // for (int i = 0; i < length; i++) {
        // numbers.add(i);
        // }
        numbers.add(34);
        numbers.remove(5);
        numbers.set(2, 344);
        // numbers.clear();
        numbers.add(5, 1000);
        if (numbers.isEmpty()) {
            System.out.println("list is empty");
        }

        for (int i : numbers) {
            System.out.println(i);

        }

        int size = numbers.size();
        System.out.println("Arraylist size is" + " " + size);

    }

    //remove duplicates

    public static ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            if (!list.contains(ele)) {
                list.add(ele);
            }
        }
        return list;

    }

    public static void numberPattern(int row) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'numberPattern'");
    }
}