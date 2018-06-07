package lab_12_9;

public class ExtendedClass extends BaseClass {

    public ExtendedClass(){
//        try {
//            super();
//        } catch (Exception e) {
//
//        }
        System.out.println("Inside Extend Constructor.");
    }

    public static void main(String[] args) {
        ExtendedClass extendedClass = new ExtendedClass();



    }
}
