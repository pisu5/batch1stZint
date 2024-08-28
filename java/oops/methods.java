
public class methods {
    public static void main(String[] args) {
        // starting point
        // methods m = new methods();
        // m.addMoney(30000);
        // m.sendMoney(10);
        // SmartPhoness oppo = new SmartPhoness();
        // oppo.call("3233", false);
        Animal dog = new Dog();
        dog.sleep();
        Animal lion = new Lion();
        lion.bite();

    }

    public void chekBlance() {
        System.out.println("My Bank balance is" + " " + "20000");

    }

    public void addMoney(int add) {
        int total = 20000;
        total += add;
        System.out.println("My total balance is" + " " + total);

    }

    public void sendMoney(int send) {
        int totalM = 50000;
        totalM -= send;
        System.out.println(totalM);
    }

}
// methods overloading

class SmartPhoness {
    void call(String number) {
        System.out.println("calling to" + " " + number);

    }

    void call(String numberr, boolean idVideo) {
        if (idVideo) {
            System.out.println("Making Video call to" + " " + numberr);
        } else {
            System.out.println("Voice call to" + " " + numberr);
        }
    }

    void call(String[] contacts, boolean isConfernce) {
        if (isConfernce) {
            System.out.println("Making Confernce call to" + " " + contacts);
        }

    }

}

class Animal { // super class
    void sound() {
        System.out.println("Animal sound");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }

    void bite() {
        System.out.println("Biting...");

    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog is barking");
    }

    void sleep() {
        System.out.println("Dog is sleeping");
    }

}

class Lion extends Animal {
    void sound() {
        System.out.println("Lion is roar");
    }

    void sleep() {
        System.out.println("Dog is sleeping");
    }

    void bite() {
        System.out.println("Lion is biting...");
    }

}
