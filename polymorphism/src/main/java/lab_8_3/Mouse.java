package lab_8_3;

public class Mouse extends Rodent {
    @Override public void eat() {
        System.out.println("Mouse eat ...");
    }

    @Override public void drink() {
        System.out.println("Mouse dont drink water.");
    }
}
