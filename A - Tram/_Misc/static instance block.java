import java.util.Arrays;
import java.util.Scanner;
class A{
	A(){
		System.out.println("Parent");
	}
}

class B extends A{
	B(){
		super();
		System.out.println("Child");
	}
	static {
		System.out.println("Static");
	}
	{
		System.out.println("Instance");
	}
}
public class Test {

	public static void main(String[] args) {
	B foo = new B();
	}

}
