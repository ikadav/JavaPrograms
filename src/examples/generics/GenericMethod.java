package examples.generics;

public class GenericMethod {

	public  <T> int countAllOccurrences(T[] list, T item) {
		int count = 0;
		if (item == null) {
			for (T listItem : list)
				if (listItem == null)
					count++;
		} else {
			for (T listItem : list)
				if (item.equals(listItem))
					count++;
		}
		
		// this one is fine
	    T[] notYetInstantiatedArray;
	  
	    // causes compiler error; Cannot create a generic array of T
	    //T[] array = new T[5];
		
		return count;
	}
	
	public static void main(String args[])
	{
		//https://howtodoinjava.com/core-java/generics/complete-java-generics-tutorial/
		String[] toppings = {"Cheese", "Pepperoni", "Black Olives"};
		new GenericMethod().countAllOccurrences(toppings,"Cheese");
		Number[] ints = {100,200,300,500};
		new GenericMethod().countAllOccurrences(ints, "Cheese");

		Object[] array = new String[10];
		array[0] = "lokesh";
		array[1] = 10;      //This will throw ArrayStoreException
		
		
		
	}

}
