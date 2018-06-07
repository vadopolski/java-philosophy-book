package lab_12_2;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class MyExceptionOne extends Exception {
    Logger log = Logger.getLogger("MyExceptionOne");

    String message;

    public MyExceptionOne() {
    }

    public MyExceptionOne(String message) {
        super(message);
    }

    public void printMessage(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        log.severe(super.getMessage() + trace.toString());
    }

    public static void main(String[] args) throws MyExceptionOne {
        try {
            throw new MyExceptionOne("Test");
        } catch (MyExceptionOne e){
            e.printMessage();
        }
    }
}