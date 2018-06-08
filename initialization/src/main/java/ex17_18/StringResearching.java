package ex17_18;

public class StringResearching {

    public StringResearching() {
        System.out.println("Test");
    }

    public StringResearching(String string) {
        System.out.println("Test String is " + string);
    }

    public static void main(String[] args) {
        StringResearching[] strings = new StringResearching[10];
        strings[0] = new StringResearching("First");
    }



}
