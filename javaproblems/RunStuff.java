package javaproblems;

interface A {
	void m1A();
}

class B implements A {
	int a;

	@Override
	public void m1A() {
		System.out.println("Method of A interface");
	}

	public void m1B() {
		abstract class LocalM1B {
			abstract void localM1Bm1Local();
		}
		class Local2M1B extends LocalM1B {

			@Override
			void localM1Bm1Local() {
				System.out.println("Overriden method of localM1Bm1Local");

			}

		}
		System.out.println("Method 1 of B class");
		Local2M1B test = new Local2M1B();
		test.localM1Bm1Local();

	}

	private interface M{
		
	}

}

interface D{
	
}


public class RunStuff {

	public static void main(String[] args) {
		A a = new B();
		a.m1A();
		B b = (B) a;
		System.out.println(a instanceof B);
		
		B c = new B() {
			public void m1A() {
				System.out.println("Stuff");
			}
		};
		c.m1A();
		String str = "foo";
		str = "1";
		
		

	}

}
