import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner scan = new Scanner(System.in);
		String string1, string2;

		string1 = scan.nextLine();
		string2 = scan.nextLine();
		string1 = string1.toLowerCase();
		string2 = string2.toLowerCase();
		int result = 0;
		char char1[] = string1.toCharArray();
		char char2[] = string2.toCharArray();

		if (string1.equalsIgnoreCase(string2)) {
			System.out.println(0);
		} else {

			for (int i = 0; i < char1.length; i++) {

				if ((int) char1[i] < (int) char2[i]) {
					System.out.println(-1);
					break;
				} else if ((int) char1[i] > (int) char2[i]) {
					System.out.println(1);
					break;
				}

			}

		}
	}

}
