class Creations {
    public static void main(String[] args) {
        Chitti chitti = new Chitti(null);
        // chitti.performTask2("dancing");
        //
        // chitti.checkbattery();
        // chitti.charge();
        // chitti.performTask2("singing");
        // chitti.charge();
       //  chitti.performTask2("singing");
        // chitti.checkbattery();
       // chitti.checkbattery();
     //  chitti.checkbattery();
    // chitti.performTask2("singing");
    chitti.checkbattery();

      
      
    }

}

class Robots {
    String name;
    String model;
    int batteryLevel;

    // base constructor
    public Robots(String name, String model) {
        this.name = name;
        this.model = model;
        this.batteryLevel = 100;

    }

    public void checkbattery() {
        System.out.println(name + "" + "Battery level is" + batteryLevel + "%");
    }

    public void charge() {
        System.err.println("Wait for charge to 100%....");

        try {
            Thread.sleep(5000);
           // batteryLevel = 100;
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        System.out.println("Battery is charged please removed");

    }

    public void perforrmtask(String task) {
        if (batteryLevel > 5) {
            System.out.println("Chitti is ready to be dance wait 5 second...");

            System.out.println(name + "is Performing task" + task);
            batteryLevel = batteryLevel - 10;

        } else {
            System.out.println("Need to be charged");

        }

    }

}

class Chitti extends Robots {
    public Chitti(String model) {
        super("Chitti", model);

    }

    public void move(String direction, int distance) {
        if (batteryLevel > 5) {
            System.out.println("Chittin is moveing");
            batteryLevel -= 5;
        } else {
            System.out.println("low batterny");
        }
    }

    public void speak(String message) {
        if (batteryLevel > 2) {
            System.out.println(name + " says: " + message);
            batteryLevel -= 2;
        } else {
            System.out.println(name + " has low battery! Please recharge.");
        }

    }

    public void performTask2(String task) {
        super.perforrmtask(task); // call the robots class method using super keywords
        System.out.println("Task has been completed");
    }

    public void bl() {
        super.checkbattery();
    }
}
