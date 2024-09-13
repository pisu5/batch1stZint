package oops;

public class Abstraction {
    public static void main(String[] args) {
        WasingMachine w = new WasingMachine(0, null);
        w.greet(56);

    }

}

abstract class Applicinces {
    int model;
    int sno;
    double g;

    Applicinces(int model, int sno, double g) {
        this.model = model;
        this.sno = sno;
        this.g = g;
    }

    void greet(int n) {
        System.out.println("Hello" + n);
    }

    abstract void turnOff();

    abstract void turnOn();
    // hide implementation
}

class WasingMachine extends Applicinces {
    StringBuilder features;

    WasingMachine(int model, int sno,
            double g, StringBuilder features) {
        super(model, sno, g);
        this.features = features;

    }

    @Override
    void greet(int n) {
        System.out.println("Good after noon" + n);

    }

    void turnOff() {
        System.out.println("Wasing getting turn off");
    }

    void turnOn() {
        System.out.println("wasing machine turn on");
    }

}
