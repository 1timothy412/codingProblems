import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner scannerObject = new Scanner(System.in);
		int count = scannerObject.nextInt();

		for (int i = 0; i <= count; i++) {
			String input = scannerObject.nextLine();
			if (input.length() > 10) {
				char first = input.charAt(0);
				int second = input.length() - 2;
				char third = input.charAt(input.length() - 1);
				StringBuilder complete = new StringBuilder();
				complete.append(first).append(second).append(third);
				System.out.println(complete);
			} else {
				System.out.println(input);
			}
		}

	}

}
