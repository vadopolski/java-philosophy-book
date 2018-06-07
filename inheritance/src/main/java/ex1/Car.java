package ex1;

public class Car {

    public Car() {
        System.out.println("Create a car");
    }

    public void ride(){
        Engine engine = new Engine();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.ride();
    }

}
