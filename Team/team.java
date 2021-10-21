import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner scan = new Scanner(System.in);
		int numberOfProblems = scan.nextInt();
//		int numberOfProblems = 3;
		int ok = 0;
		int totalProblems = 0;
		String input = "";
//		System.out.println("Stuff");
//		input = scan.nextLine();
//		System.out.println(input);
//		System.out.println(input.length());

//		String test = "1 1 1";
//		System.out.println(Character.getNumericValue(test.charAt(0)) == 1);

		for (int k = 0; k <= numberOfProblems; k++) {
			input = scan.nextLine();
			for (int i = 0; i < input.length(); i = i + 2) {
				if (Character.getNumericValue(input.charAt(i)) == 1) {
					ok++;
//					System.out.println(i);
//					System.out.println("For loop");
				}
			}
			if (ok >= 2) {
				totalProblems++;
//				System.out.print("Problems can be solved so far: ");
//				System.out.println(totalProblems);
				ok = 0;
			}else {
				ok = 0;
			}

		}

		System.out.println(totalProblems);

	}
}
