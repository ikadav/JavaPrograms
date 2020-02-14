package examples.generics;

import java.util.ArrayList;
import java.util.List;


public class TestObjectTypeGenerics {
	
	public static void doInsert(List<Object> listObj)
	{
		listObj.add(new Animal());
	}
	
	public static void main(String args[])
	{
		List<Integer> listInt = new ArrayList<Integer>();
		List<Object> listObj = new ArrayList<Object>();

		listInt.add(1);
		listInt.add(2);
		//doInsert(listInt); // This wont compile
		listObj.add(1);
		listObj.add(2);
		doInsert(listObj);
		ObjecType objTyp = new ObjecType();
		//objTyp.doInsert(listInt); // This wont compile
		objTyp.doInsert(listObj);

	}

}
