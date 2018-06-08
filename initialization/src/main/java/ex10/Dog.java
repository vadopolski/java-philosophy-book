package ex10;

public class Dog {
    boolean checkout = false;

    public Dog(boolean checkout) {
        this.checkout = checkout;
        System.out.println("Test Test Test");
    }

    @Override
    protected void finalize() throws Throwable {
        if(checkout)
            System.out.println("The dog died.");
//        super.finalize();
    }
}
