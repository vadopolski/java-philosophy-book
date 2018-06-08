package lab_8_9;

public class Cycle {

    public void wheels(){}

    public void ride(){
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        Unicycle unicycle = new Unicycle();

        Cycle cycle1 = bicycle;
        cycle1.wheels();
        Cycle cycle2 = tricycle;
        cycle2.wheels();
        Cycle cycle3 = unicycle;
        cycle3.wheels();
    }

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        Unicycle unicycle = new Unicycle();

        Cycle[] cycles = {bicycle, tricycle, unicycle};
//        cycles[0].balance();


    }

}
