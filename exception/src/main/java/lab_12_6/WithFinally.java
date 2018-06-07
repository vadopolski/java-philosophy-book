package lab_12_6;

public class WithFinally {
    private static MySwitch sw = new MySwitch();

    public static void main(String[] args) {
        try {
            sw.setStateOn();
            OnOffSwitch.f();
            throw new RuntimeException();
        }
        catch (OnOffException1 exception1) {
            System.out.println("OnOffException1");
        }
        catch (OnOffException2 exception2) {
            System.out.println("OnOffException2");
        } finally {
            sw.setStateOff();
        }
    }
}