package lab_12_6;

public class OnOffSwitch {
    private static MySwitch mySwitch = new MySwitch();

    public static void f() throws OnOffException1, OnOffException2{}

    public static void main(String[] args) {
        try {
            mySwitch.setStateOn();
            f();
            mySwitch.setStateOff();
            throw new RuntimeException();
        }
        catch (OnOffException1 exception1) {
            System.out.println("OnOffException1");
            mySwitch.setStateOff();
        }
        catch (OnOffException2 exception2) {
            System.out.println("OnOffException2");
            mySwitch.setStateOff();
        }
    }
}
