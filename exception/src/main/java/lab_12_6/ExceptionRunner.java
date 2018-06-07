package lab_12_6;

public class ExceptionRunner {

    public static void throwThreeExceptions(int i) throws Exception {
        try {
            System.out.println("Входим в первый цикл.");
            throw new Exception1();
        } catch (Exception1 e1) {
            try {
                System.out.println("Входим во второй цикл.");
                throw new Exception2();
            } catch (Exception2 e2) {
                try {
                    System.out.println("Входим в третий цикл.");
                    throw new Exception3();
                } catch (Exception3 e) {
                } finally {
                    System.out.println("Третий finally.");
                }
            } finally {
                System.out.println("Второй finally.");
            }
        }
        finally {
            System.out.println("Первый finally");
        }

                throw new Exception3();
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
