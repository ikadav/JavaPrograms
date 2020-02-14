package examples.java;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySetHashMap {

	public static void main(String a[]) {
		//Hashtable<String, String> hm = new Hashtable<String, String>(); -- This also works
		HashMap<String, String> hm = new HashMap<String, String>();
		// add key-value pair to hashmap
		hm.put("first", "FIRST INSERTED");
		hm.put("second", "SECOND INSERTED");
		hm.put("third", "THIRD INSERTED");
		System.out.println(hm);
		// getting value for the given key from hashmap
		Set<Entry<String, String>> entires = hm.entrySet();//Returns a Set view of the mappings contained in this map. A set containing a map
		//Set<Map.Entry<String, String>> entires = hm.entrySet(); -- This is also correct

		System.out.println(entires);

		for (Entry<String, String> ent : entires) {
			System.out.println(ent.getKey() + " ==> " + ent.getValue());
		}
		
		Set<String> keySet = hm.keySet();
		System.out.println("map keys = " + keySet);

		Collection<String> values = hm.values();
		System.out.println("map values = " + values);
		
	}
}