import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class A {
	static int x = 0;
	private int y = 1;
	protected int z = 3;

	void getX() {
		int m = 4;
		System.out.println("Using this " + this.x);
		System.out.println("Without using this " + x);
	}

	void getY() {
		System.out.println("Using this " + this.y);
		System.out.println("Without using this " + y);
		// error
//		System.out.println("Without using this " + m);
	}

	void getZ() {
		System.out.println("Using this " + this.z);
		System.out.println("Without using this " + z);
	}

	public void getSomething(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("This getSomething(int x, int y) is from class A");
		System.out.println("This is x passing from object of class A" + x);
		System.out.println("This is y passing from object of class A" + y);
		
		System.out.println("This is x from Class A" + A.x);
		System.out.println("This is y from class A" + this.y);

	}

	public void getSomething() {
		// TODO Auto-generated method stub
		System.out.println("This method getSomething() is from superclass A");
	}
}

class B extends A {
	void getX() {
	}
}

class D extends A implements C {

	@Override
	public void getSomething(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("This overloading getSomething(int x, int y) is from class D");
	}

	@Override
	public void getSomething() {
		// TODO Auto-generated method stub
		System.out.println("This overriding method getSomething() is from class D");
	}

}

interface C {
	void getSomething();

}

public class app {

	public static void main(String[] args) {

		A a = new A();
		System.out.println(a.x);
//		System.out.println(a.y);
		System.out.println(a.z);
		A b = new B();
		System.out.println(b.x);
		System.out.println(b.z);
		
		A d1 = new D();
		a.getX();

		b.getX();

		a.getY();
		b.getY();

		a.getZ();
		b.getZ();
		
		D d = new D();
		d.getSomething();
		d.getSomething(5, 6);
		
		a.getSomething();
		a.getSomething(5, 6);
		
		d1.getSomething();
		d1.getSomething(5, 6);
		

	}
}
