public class MyException2 extends Exception {
    private int val = 0;

    public MyException2() {
    }

    public MyException2(String message, int val) {
        super(message);
        this.val = val;
    }

    public MyException2(int val) {
        this.val = val;
    }

    @Override public String getMessage() {
        return "Подробное сообщение" + super.getMessage();
    }
}