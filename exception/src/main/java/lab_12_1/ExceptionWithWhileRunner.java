package lab_12_1;

public class ExceptionWithWhileRunner {

    public static void main(String[] args) {
        int err [] = {0, 1, 2, 3, 4, 5, 6};

        int i = 10;

        int value = 0;

        while (value == 0) {
            try {
                value = err[i];
                System.out.println(value);
            }
            catch (IndexOutOfBoundsException e) {

                i -= 1;
            }
        }
    }
}