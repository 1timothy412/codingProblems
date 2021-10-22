import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class app {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int input = 0;
		int easy = 0;
		int hard = 0;

		for (int i = 0; i < n; i++) {
			input = scan.nextInt();
			if (input == 0) {
				easy++;
			} else {
				hard++;
			}
		}
		if (easy == n & hard == 0) {
			System.out.println("Easy");
		}
		if (hard >= 1) {
			System.out.println("Hard");
		}
	}

}
