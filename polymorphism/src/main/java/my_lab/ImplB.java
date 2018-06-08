package my_lab;

public class ImplB extends CommonIml implements IntB {
    public void setControllerUrl(String status) {
        System.out.println("Inside SetControllerURL ImplB" + " Message " + status);
    }

    @Override public void updatePropertyList(String test) {

    }
}
