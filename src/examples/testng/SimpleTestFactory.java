package examples.testng;

import org.testng.annotations.Factory;

//Run this with the testng.xml file. Try adding group-by-instances and see

public class SimpleTestFactory
{
    @Factory
    public Object[] factoryMethod() {
        return new Object[] { new SimpleTest(), new SimpleTest() };
    }
}