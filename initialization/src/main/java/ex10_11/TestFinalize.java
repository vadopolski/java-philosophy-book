package ex10_11;

public class TestFinalize {

    @Override protected void finalize() throws Throwable {
        System.out.println("TestFinalize is finalized.");
        super.finalize();
    }

    public static void main(String[] args) {

        TestFinalize finalize = new TestFinalize();

        finalize = null;

        System.gc();
    }
}
