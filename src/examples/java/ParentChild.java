package examples.java;

import java.io.*;
import java.sql.SQLException;

class Parent {
	void msg()  {
		System.out.println("parent");
	}
}

public class ParentChild extends Parent {
	void msg() {
		System.out.println("child method doesn't need to throw it");
	}
	
	void msg1() {
		System.out.println("child method doesn't need to throw it");
	}

	public static void main(String args[]) {
		Parent p = new ParentChild();
			p.msg();
			//p.msg1();
		
	}
}