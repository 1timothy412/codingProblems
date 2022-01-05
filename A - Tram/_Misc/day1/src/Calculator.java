class Calculate {

	public void add(int a, int b) {
		System.out.println("Adding " + b + " to " + a + ": " + (a + b));

	}

	public void subtract(int a, int b) {

		System.out.println("Subtracting " + b + " from " + a + ": " + (a - b));

	}

	public void multiply(int a, int b) {
		System.out.println("Multiplying " + b + " by " + a + ": " + (a * b));
	}

	public void divide(int a, int b) {
		System.out.println("Dividing " + b + " by " + a + ": " + (b / a));
	}
}

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate foo = new Calculate();
		foo.add(14, 56);
		foo.subtract(10, 65);
		foo.multiply(30, 40);
		foo.divide(11, 44);
	}

}
