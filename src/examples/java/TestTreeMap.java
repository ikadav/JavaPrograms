package examples.java;
import java.util.*;

class TestTreeMap {
	public static void main(String args[]) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "Amit");
		hm.put(102, "Ravi");
		hm.put(101, "Vijay");
		hm.put(103, "Rahul");
		System.out.println("#### HASHMAP ####");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		
		System.out.println("#### TREEMAP ####");

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(100, "Amit");
		tm.put(102, "Ravi");
		tm.put(101, "Vijay");
		tm.put(103, "Rahul");
		for (Map.Entry m : tm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(100, "Amit");
		lhm.put(102, "Ravi");
		lhm.put(101, "Vijay");
		lhm.put(103, "Rahul");
		System.out.println("#### Linked HASHMAP ####");
		for (Map.Entry m : lhm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(100, "Amit");
		ht.put(102, "Ravi");
		ht.put(101, "Vijay");
		ht.put(103, "Rahul");
		System.out.println("#### HASHTABLE ####");
		for (Map.Entry m : ht.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
	}
}