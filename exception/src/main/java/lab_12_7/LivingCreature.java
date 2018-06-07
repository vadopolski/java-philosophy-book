package lab_12_7;

public class LivingCreature {
    private Characteristic characteristic = new Characteristic("Living Creature");
    private Description description = new Description("This is Living Creature");

    LivingCreature() {
        System.out.println("Create Living Creature.");
    }

    protected void dispose(){
        System.out.println("Dispose in the Living Creature.");
        characteristic.dispose();
        description.dispose();
    }
}