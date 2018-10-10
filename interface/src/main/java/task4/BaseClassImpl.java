package task4;

public class BaseClassImpl extends BaseClass {
    public void testMethod() {
        System.out.println("Test Method");
    }
    
    public static void testMethod2(BaseClass baseClass){
        baseClass.testMethod();
    }
    
    public static void main(String[] args) {
        BaseClass baseClass = new BaseClassImpl();
        testMethod2(baseClass);
    }
}