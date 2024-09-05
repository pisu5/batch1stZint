class polymorphism {
    public static void main(String[] args) {
        Maths math = new Maths();
      double sum =   math.add(3.3, 3.3);
      System.out.println(sum);

    }
}

class Maths {

    int add(int a, int b) {
        return a + b;

    }

    @overloading
    double add(double a, double b) {
        return a + b;
    }
}