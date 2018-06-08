package my_lab;

import java.util.function.Supplier;

public class AbstractAB {

    public void loadControllerAddress(Supplier<CommonIml> provider) {
        (provider.get()).setControllerUrl("Test B");
    }
}
