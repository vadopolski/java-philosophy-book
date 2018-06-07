package lab_12_7;

public class Frog extends Amphibian {
    private Characteristic characteristic = new Characteristic("Qwa Qwa Qwa");
    private Description description = new Description("Eat bugs.");

    Frog() {
        System.out.println("Constructor in frog.");
    }

    protected void dispose(){
        System.out.println("Dispose in frog.");
        characteristic.dispose();
        description.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = null;
        try {
            frog = new Frog();
            System.out.println("Buy buy.");
        } finally {
            frog.dispose();
        }
    }
}