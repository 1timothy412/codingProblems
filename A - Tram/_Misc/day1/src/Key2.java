import java.util.Scanner;

class KeyCheck {
	Scanner scan = new Scanner(System.in);
	int input = 0;

	public void check() {
		try {
			while (true) {
				input = scan.nextInt();
				if (input >= 0 && input <= 9) {
					System.out.println("You pressed: " + input);
				}else {
					System.out.println("Not allowed");
					break;
				}

			}

		} catch (Exception e) {
			System.out.println("Not allowed");
		}
	}
}

public class Key2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyCheck foo = new KeyCheck();
		foo.check();
	}

}
