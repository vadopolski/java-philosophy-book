package ex15;

public class SimpleString {

    String st;
    String st2;

    {
        st = "Test";
        st2 = "Test";
        System.out.println("st & st1 Initialized.");
    }



    public static void main(String[] args) {
        SimpleString ss = new SimpleString();

        System.out.println(ss.st);
        System.out.println(ss.st2);
    }
}