import java.util.Arrays;
import java.util.Scanner;

class Employee {
	Scanner scan = new Scanner(System.in);
	private int id;
	private String name;
	private double salary;

	public void setID(int id) {
		this.id = id;
	}

	public void setName(String name) {

		this.name = name;
	}

	public void setSalary(double salary) {

		this.salary = salary;
	}

	public int getID() {
		return id;
	}

	public double getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

}

class Add {
	Scanner scan = new Scanner(System.in);

	public int add() {
		int a, b;
		System.out.println("Please enter 1st number: ");
		a = scan.nextInt();
		System.out.println("Please enter 2nd number: ");
		b = scan.nextInt();
		return a + b;
	}

	public int add(int a, int b) {
		return a + b;
	}
}

class A {
	public void show() {
		System.out.println("Class A accessed.");
	}

}

class B extends A {
	public void show() {
		System.out.println("Class B accessed.");
	}
}

public class Test {

	public static void main(String[] args) {
		Employee foo = new Employee();
		foo.setID(1);
		foo.setName("Bob");
		foo.setSalary(500);
		System.out.println("ID: " + foo.getID());
		System.out.println("Name: " + foo.getName());
		System.out.println("Salary: $" + foo.getSalary());

		Add foo1 = new Add();
//		System.out.println(foo1.add());
		System.out.println(foo1.add(1, 2));

		B foo2 = new B();
		foo2.show();
	}

}
