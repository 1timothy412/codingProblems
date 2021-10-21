import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner scannerObject = new Scanner(System.in);

		// // User prompt
		// System.out.println("Please enter the weight of the water melon: ");

		// Accept the water melon weight as an integer
		int input = scannerObject.nextInt();
		if (input >= 1 && input <= 100) {
			if (input % 2 == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} else {
			System.out.println("Your water melon weights too much. Must weight between 1 and 100 kilos");
		}

	}

}
