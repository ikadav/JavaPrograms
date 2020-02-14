package examples.patterns;


/*
 * First You have to create your own iterator.
 * For that, have a Interface for your iterator (MyInterfaceIterator.java)
 * Create a concrete class implementing that iterator (MyIteratorImpl.java). The constructor has to accept a collection
 * Now we have to create our own collection(MySampleCollection,java). Add some data here (String[] names)
 * And this collection should have a method to return our iterator (list.iterator() in Java). 
 * Pass the data to that method
 * 
 * 
 * Steps:
 * Create you own collection - Mimic a actual collection here
 * Fill it with data
 * get the iterator from your collection
 * Iterate it
 * 
 */

public class IteratorPatternExample {
	
	public static void main(String args[])
	{
		String[] names = {"David", "Radhika", "Melba", "Sam"};
		MySampleCollection myCollection = new MySampleCollection(names);
		MyIteratorInterface iter = myCollection.getIterator();
		
		while (iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}

}
