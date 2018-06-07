package lab_12_1;

public class ExceptionRunner1 {
    public static void main(String[] args) {
        try {
            throw new Exception("Test");

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Catch Exception");

            try {
                throw new MyException("Test");
            } catch (MyException me) {
                me.printErrMessage();
            }
        }
    }
}
