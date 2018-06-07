package lab_12_4;

public class RuntimeExceptionCatch {

    private static void f() throws FromCatchException {
        try {
            g();
        } catch (RuntimeException e){
            throw new FromCatchException(e);
        }
    }

    private static void g() throws RuntimeException {
        throw new RuntimeException();
    }

    public static void main(String[] args) throws FromCatchException {
        f();
    }
}