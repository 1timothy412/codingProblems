import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		StringBuilder result = new StringBuilder();
		String[] sum = null;

		sum = input.split("\\+");
		Arrays.sort(sum);
//		for (String foo : sum) {
//			System.out.println(foo);
//		}
		if (sum.length == 1) {
			System.out.println(sum[0]);
		} else {
			for (int i = 0; i < sum.length; i++) {
				result.append((String.valueOf(sum[i])));
				result.append("+");

			}
			System.out.println(result.replace(result.length()-1,result.length(),""));
		}


	}
}
