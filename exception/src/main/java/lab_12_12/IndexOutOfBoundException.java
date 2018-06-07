package lab_12_12;

import java.util.logging.Logger;

public class IndexOutOfBoundException {
    Logger logger = Logger.getLogger("ArrayIndexOutOfBoundsException");

    private static int[] arr = {0, 1, 2};

    public static void main(String[] args) {
        try {
            System.out.println("Not element " + arr[3]);
        } catch (ArrayIndexOutOfBoundsException e){
            throw new RuntimeException();
        }
    }
}
