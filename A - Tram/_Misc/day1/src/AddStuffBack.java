import java.util.Scanner;

class Stuff1 {
	public float a, b;

	public void work() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the value of a: ");
		a = scan.nextFloat();
		System.out.println("The value of a before adding is: " + a);
		
		System.out.println("Please enter the value of b: ");
		b = scan.nextFloat();
		a = a+b;
		System.out.println("The value of a after adding is: " + a);

	}
}

public class AddStuffBack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stuff1 foo = new Stuff1();
		foo.work();
	}

}
