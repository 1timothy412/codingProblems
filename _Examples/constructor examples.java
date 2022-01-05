class A {
	A() {
		this(1, 2);
		System.out.println("A constructor is called");

	}

	A(int a, int b) {
		System.out.println("A parameterized constructor is called");
	}

	public void show() {
		System.out.println("Class A accessed.");
	}

}

class B extends A {
	B(int a, int b) {

		System.out.println("B parameterized constructor is called");
	}

	B() {
		System.out.println("B constructor is called");
	}

	public void show() {
		System.out.println("Class B accessed.");
	}

	public void b1method() {
		System.out.println("B1 method");
	}

}

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B foo2 = new B();
		foo2.show();
		
		System.out.println();
		A foo3 = new B(1, 2);

	}

}
