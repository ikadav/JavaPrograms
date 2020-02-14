package examples.java;
class MyOuter {
	private int x = 7;

	public void makeInner() {
		MyInner in = new MyInner();
		in.seeOuter();
	}
	
	public void justTest() {
		System.out.println("Just Testing");
	}

	class MyInner {
		private int y =10;
		public void seeOuter() {
			System.out.println("Outer x is " + x);
			System.out.println("Inner class ref is " + this.y);
			System.out.println("Outer class ref is " + MyOuter.this);
			MyOuter.this.justTest();
		}
	}

	public static void main(String[] args) {
		MyOuter mo = new MyOuter(); // gotta get an instance!
		MyOuter.MyInner inner = mo.new MyInner();
		inner.seeOuter();
	}
}