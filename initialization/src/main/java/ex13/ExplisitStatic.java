package ex13;

public class ExplisitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main");
        Cups.cup1.print(99);
    }

    static Cups cups1 = new Cups();
    static Cups cups2 = new Cups();
}
