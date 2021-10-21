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
		// number of rooms
		int n = scan.nextInt();
		int result = 0;
		for (int i = 0; i < n; i++) {
			// number of people living in the room
			int foo = scan.nextInt();
			// number of the room capacity
			int bar = scan.nextInt();
			if (foo < bar && (bar - foo) >= 2) {
				result++;
			}
		}
		System.out.println(result);
	}
}
