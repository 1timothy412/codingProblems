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
		// number of magnets
		int n = scan.nextInt();
		int result = 0;
		String temp = scan.next();
		for (int i = 0; i < n-1; i++) {
			// number of people living in the room
			String foo = scan.next();
			// number of the room capacity
			if (!String.valueOf(foo).equals(temp)) {
				result++;
				temp = foo;
			} else {
				temp = foo;
			}
		}
		System.out.println(result+1);
	}
}
