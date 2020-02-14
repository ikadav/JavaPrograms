package examples.generics;

import java.util.ArrayList;
import java.util.List;

public class ObjecType {
	
	public void doInsert(List<Object> listObj)
	{
		listObj.add(new Animal());
		System.out.println("I have added a animal inside a List<Object> which had Integers inside");
		System.out.println(listObj);
		
		for (int i=0; i<listObj.size(); i++)
		{
			System.out.println(listObj.get(i));
		}
	}
	

}
