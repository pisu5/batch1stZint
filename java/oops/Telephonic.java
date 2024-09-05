public class Telephonic {
    public static void main(String[] args) {
        SmartPhone onePlus = new SmartPhone("onepus", 45, "8gb", "Android");
        onePlus.printphoneDetails();
        

    }

}

class Phone {
    String brand;
    int model;

    // Constructor creation
    public Phone(String brand, int model) {
        this.brand = brand;
        this.model = model;

    }

    public void printphoneDetails() {
        System.out.println("Your Phone brand is" + " " + brand + " " + "and model number is" + " " + model);
    }
}

class SmartPhone extends Phone {
    String ram;
    String os;

    // constructor
    SmartPhone(String brand, int model, String ram, String os) {
        super(brand, model);
        this.ram = ram;
        this.os = os;

    }

    public void printphoneDetails() {
        super.printphoneDetails();
        System.out.println("and ram is" + " " + ram + " " + "and os is" + " " + os);
    }

}