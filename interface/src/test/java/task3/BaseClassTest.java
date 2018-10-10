package task3;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.*;

public class BaseClassTest {
    
    @Test
    public void testPrint_differentNumbers() {
        int expectedNumber1 = 5;
        int expectedNumber2 = 10;
        BaseClass object1 = new SubClass1();
        BaseClass object2 = new SubClass2();
        
        int actualNumber1 = object1.print();
        int actualNumber2 = object2.print();
        
        assertThat(actualNumber1, Is.is(expectedNumber1));
        assertThat(actualNumber2, Is.is(expectedNumber2));
    }
}