package lab_8_2;

import java.util.Random;

public class RandomShapeGenerator {
    private Random rnd = new Random(47);
    public Shape next(){
        switch (rnd.nextInt(4)){
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new Rectangle();
        }
    }
}
