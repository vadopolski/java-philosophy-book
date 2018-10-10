package task9;

public class AbstractInstrument implements PlayAble {
    public void play(Note n) {
        System.out.println(this + " play " + n);
    }
    
    public void adjust() {
        System.out.println(this + ".adjust");
    }
}
