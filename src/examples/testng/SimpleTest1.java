package examples.testng;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SimpleTest1
{
	String parameter ;
    public SimpleTest1(String param)
    {
    		this.parameter = param;
    }
	
	@Test
    public void method1() {
        System.out.println("Simple Test Method1 ..." + parameter);
    }
	
	@Test
    public void method2() {
        System.out.println("Simple Test Method2 ..." + parameter);
    }
	
	@Test
    public void method3() {
        System.out.println("Simple Test Method3 ..." + parameter);
    }
    
    public class SimpleFactory
    {
        @Factory
        public Object[] factoryMethod() {
            return new Object[] { new SimpleTest1("FIRST"), new SimpleTest1("SECOND") };
        }
    }
}
