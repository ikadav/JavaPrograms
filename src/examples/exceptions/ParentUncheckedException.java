package examples.exceptions;

import java.io.*;
import java.sql.SQLException;

class Parent {
	void msg() throws Exception, IOException, SQLException {
		System.out.println("parent");
	}
}

public class ParentUncheckedException extends Parent {
	void msg() {
		System.out.println("child method doesn't need to throw it");
	}

	public static void main(String args[]) {
		Parent p = new ParentUncheckedException();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}