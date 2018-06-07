package lab_12_10;

public class C extends B {
    @Override public void f() throws FirstLevelException {
        throw new ThirdLevelExcepton();
    }

    public static void main(String[] args) throws FirstLevelException {
        C c = (C)new A();
        c.f();
    }

}
