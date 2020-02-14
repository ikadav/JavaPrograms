package examples.logical;

import java.util.Arrays;

public class MyArrayList {
	
	private int size;
	private Object[] elements;
	private static final int initialCapacity = 10;
	
	public MyArrayList() {
        elements = new Object[initialCapacity];
    }
	
	
	public void add(Employee e)
	{
		if (size == elements.length)
		{
			increaseCapacity();
		}
		elements[size++] = e;
	}
	
	public void increaseCapacity()
	{
		int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
	}
	
	public Employee get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (Employee) elements[i];
    }

}
