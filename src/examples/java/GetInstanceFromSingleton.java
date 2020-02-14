package examples.java;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class GetInstanceFromSingleton {
	
	public static void main(String args[])
	{
		//SingletonClass sc = new SingletonClass();
		//SingletonClass sc1 = new SingletonClass();
		//Above is not possible
		//which means I cannot create multiple instances of singleton class outside the class
		
		SingletonClass sc2 = SingletonClass.getInstance();
		SingletonClass sc3 = SingletonClass.getInstance();
		
		if (sc2 == sc3)
		{
			System.out.println("I am equal now ???");
		}
		else
		{
			System.out.println("No.... Still I am NOT equal");

		}
		
	}

}
