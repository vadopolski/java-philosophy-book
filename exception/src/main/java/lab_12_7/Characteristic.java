package lab_12_7;

public class Characteristic {
    private String characteristic;

    public Characteristic(String characteristic) {
        System.out.println("Creating characteristic is " + characteristic);
        this.characteristic = characteristic;
    }

    public void dispose() {
        System.out.println("Finished characteristic with " + characteristic);
    }
}
