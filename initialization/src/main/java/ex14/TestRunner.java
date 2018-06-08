package ex14;

import java.util.ArrayList;

public class TestRunner {

    static String st1 = "Test1";
    static String st2;

    static {
        st2 = "Test2";
    }

    static void print(){
        System.out.println(st1);
        System.out.println(st2);
    }

    public static void main(String[] args) {
        TestRunner testRunner = new TestRunner();
        testRunner.print();
    }
}
