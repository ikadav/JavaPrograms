package examples.patterns;

public class MySampleCollection {
	
	private String[] names;
	
	public MySampleCollection(String[] names)
	{
		this.names = names;
	}
	
	public MyIteratorInterface getIterator()
	{
		return new MyIteratorImpl(names);
	}

}
