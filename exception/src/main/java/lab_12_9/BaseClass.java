package lab_12_9;

public class BaseClass {

    public BaseClass() {
        System.out.println("Inside base class constructor + Exception.");
        try {
            throw new Exception();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
