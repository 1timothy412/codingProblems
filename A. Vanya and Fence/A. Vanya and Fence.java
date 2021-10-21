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
		// of friends
		int n = scan.nextInt();
		// height of fence
		int h = scan.nextInt();
		int w = n;
		for (int i = 0; i < n; i++) {
			int foo = scan.nextInt();
			if (foo > h) {
				w++;
				;
			}
		}
		System.out.println(w);
	}
}
