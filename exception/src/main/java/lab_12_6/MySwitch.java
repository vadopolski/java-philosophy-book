package lab_12_6;

public class MySwitch {
    private boolean state;
    public boolean isState() {
        return state;
    }
    public void setStateOff() {
        state = false;
        System.out.println(state);
    }
    public void setStateOn() {
        state = true;
        System.out.println(state);
    }
    public String toString(){
        return state ? "Вкл" : "Выкл";
    }
}