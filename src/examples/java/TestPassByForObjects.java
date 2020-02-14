package examples.java;
import java.util.ArrayList;

public class TestPassByForObjects {
	
	public static void main (String args[])
	{
	
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Testing");
		myList.add("QA");
		myList.add("Automation");
		System.out.println("Printing my list 1111" + myList);
		TestPassByForObjects tbfo = new TestPassByForObjects();
		tbfo.makeNull(myList);
		System.out.println("Printing my list 5555" + myList);

	}
	
	public void makeNull(ArrayList<String> myList)
	{
		System.out.println("Printing my list 2222" + myList);

		myList.add("Something");
		myList.add("Nothing");
		System.out.println("Printing my list 3333" + myList);
		
		myList = null;
		
		System.out.println("Printing my list 4444" + myList);


		
		
	}
}
