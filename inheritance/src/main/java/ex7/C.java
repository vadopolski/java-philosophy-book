package ex7;

public class C extends A {
    B b = new B(5);

    public C(int i) {
        super(i);
        this.b = b;
    }

    public static void main(String[] args) {
        C c = new C(5);
    }
}
