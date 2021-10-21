import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] inputString = input.split(" ");


		int lw = Integer.parseInt(inputString[0]);

		int bw = Integer.parseInt(inputString[1]);
		int lGrow = 3, bGrow = 2, yearGrow = 0;
		while (lw <= bw) {
			lw = lw * 3;
			bw = bw * 2;

			yearGrow++;

		}
		System.out.println(yearGrow);

//		}
	}
}
