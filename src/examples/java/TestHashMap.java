package examples.java;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

class Dog {
	String color;

	Dog(String c) {
		color = c;
	}

	public String toString() {
		return color + " dog";
	}
	/* Below will prevent duplicates
	
	public boolean equals(Object o) {
		return ((Dog) o).color == this.color;
	}

	public int hashCode() {
		return color.length();
	}*/
		
}

public class TestHashMap {
	public static void main(String[] args) {
		
		HashMap<Dog, Integer> hashMap = new HashMap<Dog, Integer>();
		//TreeMap<Dog, Integer> hashMap = new TreeMap<Dog, Integer>();

		
		Dog d1 = new Dog("red");
		Dog d2 = new Dog("black");
		Dog d3 = new Dog("white");
		Dog d4 = new Dog("white");
		Dog d5 = new Dog("red");

		hashMap.put(d1, 10);
		hashMap.put(d2, 15);
		hashMap.put(d3, 5);
		hashMap.put(d4, 20);
		hashMap.put(d5, 50);
		// print size
		System.out.println(hashMap.size());
		// loop HashMap
		System.out.println("##### HASHMAP #####");
		for (Entry entry : hashMap.entrySet()) {
			System.out.println(entry.getKey().toString() + " - " + entry.getValue());
		}
	}
}