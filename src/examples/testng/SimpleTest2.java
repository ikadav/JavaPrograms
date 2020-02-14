package examples.testng;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SimpleTest2
{
    @Test
    public void simpleTest() {
        System.out.println("Simple Test Method.");
    }
    
    public class SimpleFactory
    {
        @Factory
        public Object[] factoryMethod() {
            return new Object[] { new SimpleTest(), new SimpleTest() };
        }
    }
}


 