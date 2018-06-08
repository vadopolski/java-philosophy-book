package lab_8_5;

public class Hamster extends Rodent {
    public Hamster() {
        System.out.println("Hamster()");
    }

    @Override public void eat() {
        System.out.println("Hamster eat apple.");
    }

    @Override public void drink() {
        System.out.println("Hamster eat water.");
    }
}
