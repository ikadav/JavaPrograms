package examples.generics;

public class GenericClass<T> {

	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
	
	public void print()
	{
		System.out.println("Printing .." + this.t);
	}

}
