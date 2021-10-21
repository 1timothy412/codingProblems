import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner scan = new Scanner(System.in);

		String temp[];
		String matrix[][] = new String[5][5];
		int prettyRow = 0, prettyColumn = 0;

		for (int i = 0; i < 5; i++) {
			String input = scan.nextLine();
			temp = input.split(" ");
//			System.out.println(Arrays.toString(temp));
			/*
			 * Cannot assign String[] values from temp directly into multidimensional array,
			 * hence 2 loops
			 */
			for (int j = 0; j < 5; j++) {
//				System.out.println(Arrays.toString(temp));
				if (Integer.parseInt(temp[j]) != 0) {
					prettyRow = i;
					prettyColumn = j;
				}
				matrix[i][j] = temp[j];
//				System.out.println(matrix[i][j]);

			}
		}
//		System.out.println("Pretty row index: " + prettyRow);
//		System.out.println("Pretty column index: " + prettyColumn);
//		System.out.println(Arrays.deepToString(matrix));
		System.out.println(Math.abs(prettyRow - 2) + Math.abs(prettyColumn - 2));

	}

}
