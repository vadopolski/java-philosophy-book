package lab_8_10;

public class RoundGlyph extends Glyph {
    private long radius = 5;

    public RoundGlyph(long radius) {
        System.out.println("Creating RoundGlyph " + radius);
    }

    @Override public void draw() {
        System.out.println("RoundGlyph.draw() " + radius);
    }

    public static void main(String[] args) {
        Glyph glyph = new RoundGlyph(5);
    }
}
