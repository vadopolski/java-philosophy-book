package ex19;

public class DynamicArrayTest {

    public static void testArray(String ... strings){
        for(String st: strings)
            System.out.println("Element is " + st);
        System.out.println("______________________");
    }


    public static void main(String[] args) {
        testArray("One", "Two", "Three");

        String[] strings = {"Three", "Two", "One"};
        testArray(strings);

    }
}
