class FinalStatic {

    public static void main(String[] args) {
        final int id = 45;

        System.out.println(id);
        int g = Animal.add(12, 34);
        System.out.println(g);

    }

}
// static example

class child {
    public final void g() {
        System.out.println("knfke");
    }

}

public static class Animal {
    public static int add(int ab, int bc) {
        return ab + bc;
    }
}
