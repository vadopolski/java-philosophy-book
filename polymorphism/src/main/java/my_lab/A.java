package my_lab;

public class A extends AbstractAB {

    private IntA getA() {
        return new ImplA();
    }

    public void loadControllerAddress() {
        loadControllerAddress(() -> (CommonIml)getA());
    }

}
