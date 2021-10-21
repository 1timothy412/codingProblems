import java.util.Scanner;

public class app {

	public static void main(String[] args) {

		final class GetLast {
			Integer get(int n) {

				String s = Integer.toString(n);
				int length = s.length();
				int digit = Integer.parseInt((String.valueOf(s.charAt(length - 1))));
				return digit;
			}
		}
		GetLast obj = new GetLast();
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int k = Integer.parseInt(input[1]);
//		System.out.println(GetLast.get(512)+2);

		for (int i = 0; i < k; i++) {
			if (obj.get(n) != 0) {
				n -= 1;
			} else {
				n /= 10;
			}
		}
		System.out.println(n);

	}

}
