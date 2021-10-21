import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int totalUpper = 0;
		int totalLower = 0;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) >= 97) {
				totalLower++;
			} else {
				totalUpper++;
			}
		}
		if (totalUpper > totalLower) {
			System.out.println(input.toUpperCase());
		}
		if (totalUpper <= totalLower) {
			System.out.println(input.toLowerCase());
		}

//		System.out.println(totalUpper);
//		System.out.println(totalLower);

	}

}
