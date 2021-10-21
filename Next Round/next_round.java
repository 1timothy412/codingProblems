import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner scan = new Scanner(System.in);
		String board[] = scan.nextLine().split(" ");
//		System.out.println(board);
		int numQualifier = 0;
		int kthFinisherIndex = Integer.parseInt(board[1])-1;
//		System.out.println(kthFinisherIndex);

//		String test = "10 9 8 7 7 7 5 5";
//
//		System.out.println(test.charAt(0));
//		System.out.println(Character.getNumericValue(test.charAt(8)));
//
//		String test1[] = test.split(" ");
//		for (String foo : test1) {
//			System.out.print(foo);
//		}
//		System.out.println(Integer.parseInt(test1[5]));

		for (int i = 0; i < 1; i++) {

			String scores[] = scan.nextLine().split(" ");
			for (int j = 0; j < scores.length; j++) {

				if (Integer.parseInt(scores[j]) >= Integer.parseInt(scores[kthFinisherIndex])
						&& Integer.parseInt(scores[j]) != 0) {

					numQualifier++;
				}

			}
			System.out.println(numQualifier);
		}

	}
}
