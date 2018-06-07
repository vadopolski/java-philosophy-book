package lab_12_12;

public class MyException extends RuntimeException {

    private String errMessage;

    public MyException(String message) {
        super(message);
        this.errMessage = message;
    }

    public void printErrMessage(){
        System.err.println(errMessage);
    }
}