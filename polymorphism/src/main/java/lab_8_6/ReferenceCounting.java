package lab_8_6;

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composings = {
            new Composing(shared),
            new Composing(shared),
            new Composing(shared),
            new Composing(shared),
            new Composing(shared)
        };

        for(Composing c : composings){
            c.dispose();
        }
    }

    // TODO: 09.01.2018 14 chapter 5
}
