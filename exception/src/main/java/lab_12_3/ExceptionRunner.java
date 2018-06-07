package lab_12_3;

public class ExceptionRunner {

    public static void throwThreeExceptions(int i) throws Exception {
            if(i == 1){
                throw new Exception1();
            } else if (i == 2) {
                throw new Exception2();
            } else {
                throw new Exception3();
            }
    }
    public static void main(String[] args) {
        try {
            throwThreeExceptions(3);
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}
