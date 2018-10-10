package task9;

public class Music {
    
    public static void main(String[] args) {
        AbstractInstrument[] orchestra = {new Wind(),
                                  new Percussion(), 
                                  new Stringed(), 
                                  new WoodWind(), 
                                  new Brass()};
    
        tuneAll(orchestra);
    }
    
    private static void tuneAll(AbstractInstrument[] orchestra) {
        for(int i = 0; i < orchestra.length; i++){
            tune(orchestra[i]);
        }
        
    }
    
    private static void tune(PlayAble instrument) {
        instrument.play(Note.MIDDLE_C);
    }
}