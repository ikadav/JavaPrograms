package examples.generics;

public class GenericClassObject {
	
	public static void main(String args[])
	{
		GenericClass<String> strInstance = new GenericClass<String> ();
		strInstance.set("David");
		strInstance.print();
		GenericClass<Integer> intInstance = new GenericClass<Integer> ();
		intInstance.set(10);
		intInstance.print();
		
	}

}
