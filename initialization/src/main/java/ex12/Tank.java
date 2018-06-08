package ex12;

public class Tank {

    boolean isFull;

    public Tank(boolean isFull) {
        this.isFull = isFull;
    }

    @Override protected void finalize() throws Throwable {
        if (!isFull){
            System.out.println("The Tank Destroyed.");
            super.finalize();
        }

    }

    public static void main(String[] args) {
        Tank fullTank = new Tank(true);
        Tank emptyTank = new Tank(false);
        Tank fullTank2 = new Tank(true);
        Tank emptyTank2 = new Tank(false);

        new Tank(true);
        new Tank(false);

        System.gc();
    }
}
