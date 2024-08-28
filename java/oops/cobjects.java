public class cobjects {
    public static void main(String[] args) { //excution
        KeyPadMobiles samsung = new KeyPadMobiles(); 
        KeyPadMobiles Vivo = new KeyPadMobiles();
        samsung.playMusic();
        samsung.call();
        String received = samsung.receivecall();
        System.out.println(received);
        SmartPhones oppo = new SmartPhones();
       String alaramPlay =  oppo.alaram();
       System.out.println(alaramPlay + " "+ "in oopo Mobile");


    }
}

class KeyPadMobiles { ///parent class
    String modelNum = "skde5454";
    int imei = 254545454;
    String color = "red";

    public void playMusic() {
        System.out.println("Music is playing...");

    }
    public void call() {
        System.out.println("calling to god...");
    }

    public String receivecall() {
        String ReceivedcallFrom = " calling from james gosling";
        return ReceivedcallFrom;
    }

    public String alaram() {
        String play = "Alaram is playaing.....";
        return play;
    }

}

class SmartPhones extends KeyPadMobiles{ //inheritance //child
    public void videocall(){
        System.out.println("calling to someone");
    }
} 