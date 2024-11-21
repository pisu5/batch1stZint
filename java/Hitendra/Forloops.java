package Hitendra;
import java.util.Scanner;

public class Forloops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int in = sc.nextInt();
        boolean isPrime = true;
        for(int i =2;i<in;i++){
            if(in%i==0){
                isPrime = false;
                break;

            }
        }
        if(isPrime){
            System.out.println( in+" "+ "is prime");
        }else{
            System.out.println("Not prime");
        }


        int base =20;
        int hypo  = 30;
        int per = 0;
        
      
    }
    
}
