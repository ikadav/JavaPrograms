package examples.patterns;

public class MyIteratorImpl implements MyIteratorInterface{

	private int index;
	private String[] names;
	
	public MyIteratorImpl(String[] names)
	{
		this.names = names;
	}
	
	@Override
	public boolean hasNext() {
		
		return index < names.length;
	}

	@Override
	public Object next() {
		
		if (hasNext())
		{
			return names[index++];
		}
		
		return null;
	}

}
