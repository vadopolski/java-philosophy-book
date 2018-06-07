package lab_12_1;

import java.util.logging.Logger;

public class IndexOutOfBoundException {
    Logger logger = Logger.getLogger("ArrayIndexOutOfBoundsException");

    private static int[] arr = {0, 1, 2};

    public static void main(String[] args) {
        try {
            System.out.println("Not element " + arr[3]);
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.err.println("Element is not in Array. " + e.getMessage());
        }
    }
}
