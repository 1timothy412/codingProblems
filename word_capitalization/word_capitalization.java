import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine();
		char[] result = input.toCharArray();
//		System.out.println(result);
		if((int)result[0]>=97) {
			result[0]=(char)((int)result[0]-32);
		}
		System.out.print(result);


	}
}
