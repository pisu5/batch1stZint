public class StarPattern {
    public static void main(String[] args) {
        int row = 5;
      Arraylist.numberPattern(row);

    }

    // que 1
    public void simplePatternQue1(int row) {
        for (int i = 1; i <= row; i++) {
            // spaces
            for (int j = 1; j <= i; j++) { // columns
                System.out.print("*"); // stars
            }
            System.out.println();
        }

    }
    // que 2

    public static void reversePatternQue2(int row) {
        int temp = row;
        for (int i = 1; i <= row; i++) {
            // spaces
            for (int j = 1; j <= temp; j++) { // columns
                System.out.print("*");

            }
            temp--;
            System.out.println();
        }

    }

    public static void numberPattern(int row) {

        for (int i = 1; i <= row; i++) {
            // spaces
            for (int j = 1; j <= i; j++) { // columns
                System.out.print(i);

            }

            System.out.println();
        }

    }

}
