package examples.java;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Factory;

public class TestFactory2
{
    private int param;
 
    public TestFactory2(int param) {
        this.param = param;
    }
 
    @Test
    public void testMethodOne() {
        int opValue = param + 1;
        System.out.println("Test method one output: " + opValue);
    }
 
    @Test
    public void testMethodTwo() {
        int opValue = param + 2;
        System.out.println("Test method two output: " + opValue);
    }
}
 
/*class SimpleTestFactory
{
    @Factory
    public Object[] factoryMethod() {
        return new Object[] { new TestFactory2(0), new TestFactory2(1) };
    }
}*/