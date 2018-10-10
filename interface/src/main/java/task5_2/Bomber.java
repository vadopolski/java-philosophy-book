package task5_2;

import task5_1.Flyable;

public class Bomber implements Flyable {
    public void takeOff() {
        System.out.println("Take OFF commander");
    }
    
    public void fly() {
        System.out.println("Fly");
    }
    
    public void land() {
        System.out.println("Just Landed");
    }
    
    public static void main(String[] args) {
        Flyable bomber = new Bomber();
        
        bomber.takeOff();
        bomber.fly();
        bomber.land();
        
        
        
    }
}
