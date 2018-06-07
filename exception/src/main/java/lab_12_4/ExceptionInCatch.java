package lab_12_4;

import lab_12_1.MyException;

public class ExceptionInCatch {

    public static void f() throws FromCatchException {
        try {
            g();
        }
        catch (MyException e) {
            throw new FromCatchException(e);
        }
    }

    public static void g() throws MyException {
        throw new MyException("Exception in f()");
    }

    public static void main(String[] args) throws FromCatchException {
        f();
    }
}
