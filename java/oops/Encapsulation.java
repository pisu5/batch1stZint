public class Encapsulation {
    public static void main(String[] args) {
        Person chandu = new Person("chandu", 06466666, 23, 0545, 120, 500000);
        chandu.setname("chandrashekar");
       
        chandu.setname("chandan");
        String name = chandu.getName();

        System.out.println(name);

    }
}

class Person {
    String name;
    int ac;
    int age;
    int atm_pin;
    int cvv;
    int balace;

    public Person(String name,
            int ac,
            int age,
            int atm_pin,
            int cvv,
            int balace) {
        this.name = name;
        this.ac = ac;

        this.age = age;
        this.atm_pin = atm_pin;
        this.cvv = cvv;
        this.balace = balace;
    }

    // set name using setter
    public void setname(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}