package my_lab;

public class B extends AbstractAB {

    private IntB getB() {
        return new ImplB();
    }

    public void loadControllerAddress() {
        loadControllerAddress(() -> (CommonIml)getB());
    }

}
