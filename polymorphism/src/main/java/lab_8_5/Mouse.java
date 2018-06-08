package lab_8_5;

public class Mouse extends Rodent {
    public Mouse() {
        System.out.println("Mouse()");
    }

    @Override public void eat() {
        System.out.println("Mouse eat ...");
    }

    @Override public void drink() {
        System.out.println("Mouse dont drink water.");
    }
}
