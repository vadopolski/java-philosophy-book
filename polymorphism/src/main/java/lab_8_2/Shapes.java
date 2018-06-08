package lab_8_2;

public class Shapes {
    private static  RandomShapeGenerator generator = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape [] shapes = new Shape[14];
        for (int i = 0; i< shapes.length; i++){
            shapes[i] = generator.next();
        }

        for (Shape sh : shapes) {
            sh.draw();
            sh.getName();
        }
    }

}
