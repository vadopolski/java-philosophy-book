package lab_12_7;

public class Animal extends LivingCreature {
    private Characteristic characteristic = new Characteristic("This is an animals, not an flowers.");
    private Description description = new Description("Have a heart");

    public Animal() {
        System.out.println("Constructor in Animals.");
    }

    protected void dispose(){
        System.out.println("Dispose in Animal.");
        characteristic.dispose();
        description.dispose();
        super.dispose();
    }
}