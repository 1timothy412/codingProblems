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
		String s = scan.nextLine();
		Set<String> set1 = new LinkedHashSet<String>();
		s = String.valueOf(Integer.parseInt(s) + 1);
		while (true) {

			for (int i = 0; i < s.length(); i++) {
				set1.add(String.valueOf(s.charAt(i)));
			}
			if (set1.size() == s.length()) {
				System.out.println(s);
				break;
			} else {
				s = String.valueOf(Integer.parseInt(s) + 1);
				set1.clear();
			}
		}
	}
}
