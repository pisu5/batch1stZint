public class Construtor {
    public static void main(String[] args) {
        Library central = new Library(50, "CentraLibrary", "avilable", 52, true, false);
        Library cwf = new Library();
        central.printLibraryDetails();

    }
}

class Library {
    int books;
    String name;
    String newpaper;
    int chair;
    boolean isWaterAvilable;
    boolean isWifi;

    Library() {

    }

    // parametrized constructor
    public Library(int bookM,
            String name,
            String newpaper, int chair,
            boolean isWaterAvilable,
            boolean isWifi) {
        books = bookM;
        this.name = name;
        this.newpaper = newpaper;
        this.chair = chair;
        this.isWaterAvilable = isWaterAvilable;
        this.isWifi = isWifi;

    }

    public void printLibraryDetails() {
        System.out.println("Library name is" + " " + name + " " + "and total books present here is: " + " " + books);
    }

}