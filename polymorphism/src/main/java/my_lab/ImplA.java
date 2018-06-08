package my_lab;

public class ImplA extends CommonIml implements IntA {
    public void setControllerUrl(String status) {
        System.out.println("Inside SetControllerURL ImplA" + " Message " + status);
    }

    @Override public void commitBatchEntries(String test) {

    }
}
