package examples.java;

public class SingletonClass {
	
	private static SingletonClass snglecls ;
	
	private SingletonClass()
	{
		
	}
	
	public static SingletonClass getInstance()
	{
		if (snglecls == null)
				snglecls = new SingletonClass();
		
		return snglecls;
	}
	
	public void getSomeThing(){
        System.out.println("I am here....");
    }
	
	public static void main(String args[])
	{
		SingletonClass sc = new SingletonClass();
		SingletonClass sc1 = new SingletonClass();
		
		if (sc == sc1)
		{
			System.out.println("I am equal");
		}
		else
		{
			System.out.println("I am NOT equal.. which means I am able to create multiple instances of singleton class inside the same class");

		}
		
		SingletonClass sc2 = getInstance();
		SingletonClass sc3 = getInstance();
		
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
