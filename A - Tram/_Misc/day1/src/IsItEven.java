import java.util.Scanner;

class NumberCheck {
	Scanner scan = new Scanner(System.in);
	public void check() {
		int num = scan.nextInt();
		if(num % 2 == 0) {
			System.out.println("Your number is even");
		}else {
			System.out.println("Not an even number");
		}
		
	}
}
public class IsItEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberCheck foo = new NumberCheck();
		foo.check();
	}

}
