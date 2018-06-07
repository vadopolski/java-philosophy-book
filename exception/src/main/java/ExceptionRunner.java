public class ExceptionRunner {

    public void f() throws MyException {
        System.out.println("Exception from f()");
        throw new MyException();
    }

    public void g() throws MyException {
        System.out.println("Exception from g()");
        throw new MyException("Inside MyException");
    }

    public void h() throws LoggingException {
        System.out.println("Exception from h()");
        throw new LoggingException();
    }

    public static void main(String[] args) {
        ExceptionRunner runner = new ExceptionRunner();
        try {
            runner.f();
        }
        catch (MyException e) {
            e.printStackTrace();
        }

        try {
            runner.g();
        }
        catch (MyException e) {
            e.printStackTrace();
        }

        try {
            runner.h();
        }
        catch (LoggingException e) {
            System.err.println("Перехвачено" + e.toString());
        }

        try {
            runner.h();
        }
        catch (LoggingException e) {
            System.err.println("Перехвачено" + e.toString());
        }
    }
}
