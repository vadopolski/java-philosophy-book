package lab_12_7;

public class Amphibian extends Animal{
    private Characteristic characteristic = new Characteristic("Can live in water");
    private Description description = new Description("In water and on the ground.");

    Amphibian() {
        System.out.println("Constructor in Amphibian.");
    }

    protected void dispose(){
        System.out.println("Dispose in Amphibian.");
        characteristic.dispose();
        description.dispose();
        super.dispose();
    }
}