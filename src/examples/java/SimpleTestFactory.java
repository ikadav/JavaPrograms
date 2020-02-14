package examples.java;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Factory;

public class SimpleTestFactory
{
    @Factory
    public Object[] factoryMethod() {
        return new Object[] { new TestFactory2(0), new TestFactory2(1) };
    }
}