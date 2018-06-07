package lab_12_1;

public class MyException extends Exception {

    private String errMessage;

    public MyException(String message) {
        super(message);
        this.errMessage = message;
    }

    public void printErrMessage(){
        System.err.println(errMessage);
    }
}