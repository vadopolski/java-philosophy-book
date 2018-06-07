package lab_12_2;

import lab_12_1.MyException;

public class TestMyException {

    public static void throwMyException() throws MyException{
        throw new MyException("Test");
    }

    public static void main(String[] args) {
        try {
            throwMyException();
        } catch (MyException e){
            e.printErrMessage();
        }
    }
}
