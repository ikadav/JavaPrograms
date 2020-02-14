package examples.logical;

public class TestMyOwnSinglyLinkedList {
	
	public static void main(String args[])
	{
		EmployeeLinkedList ell = new EmployeeLinkedList();
		
		System.out.println("IsEmpty before adding elements " + ell.isEmpty());

		ell.addToFront(new Employee("David", "Solomon",1));
		ell.addToFront(new Employee("Radhika", "David",2));
		ell.addToFront(new Employee("Melba", "David",3));
		ell.addToFront(new Employee("Sam", "David",4));
		
		ell.printList();
		
		System.out.println("Size of my list is " + ell.getSize());
		System.out.println("IsEmpty after adding elements " + ell.isEmpty());
		
		ell.removeFirstNode();
		
		System.out.println("Size of my list after deleteing " + ell.getSize());

		ell.printList();

	}

}
