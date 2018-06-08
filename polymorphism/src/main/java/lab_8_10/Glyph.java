package lab_8_10;

public class Glyph {
    public void draw(){
        System.out.println("Glyph.draw()");
    }

    public Glyph(){
        System.out.println("Before Glyph.draw()");
        draw();
        System.out.println("After Glyph.draw()");
    }
}
