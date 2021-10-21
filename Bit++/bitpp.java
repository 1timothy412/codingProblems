import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner scan = new Scanner(System.in);


//
		String numLines = scan.nextLine();

		int X = 0;
//		System.out.println("Enter operation:");
//		String operation = scan.nextLine();
//		System.out.println(operation);
//		System.out.println(operation.equals("X++"));

		for (int i = 0; i < Integer.parseInt(numLines); i++) {
//			System.out.println("Enter operation:");
			String operation = scan.nextLine();
			if (operation.equals("X++") || operation.equals("++X")) {
				X++;
			} else {
				X--;
			}
		}
		System.out.println(X);

	}
}
