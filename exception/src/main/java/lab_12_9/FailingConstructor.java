package lab_12_9;

public class FailingConstructor {

    private ClassWithDispose classWithDispose;
    private ClassWithDispose classWithDispose2;

    public FailingConstructor() throws Exception {
        classWithDispose = new ClassWithDispose();
        try {
            classWithDispose2 = new ClassWithDispose();
        } catch (Exception e){

        } finally {
            classWithDispose2.dispose();
        }
    }

    public void dispose(){
        System.out.println("Dispose constructor.");
    }

    public static void main(String[] args) {
        FailingConstructor constructor = null;

        try {
            constructor = new FailingConstructor();
        }
        catch (Exception e) {
            System.out.println("Исключение перехвачено.");
        } finally {
            constructor.dispose();
        }
    }
}
