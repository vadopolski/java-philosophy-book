package lab_12_10;

public class B extends A {

    @Override public void f() throws FirstLevelException {
        throw new SecondLevelException();
    }
}
