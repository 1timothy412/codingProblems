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
		String n = scan.next();
		String m = scan.next();
		String sum = "";

		for (int i = 0; i < n.length(); i++) {
			
			if (n.charAt(i) != m.charAt(i)) {
				sum += "1";
			}
			if (String.valueOf(n.charAt(i)).equals("0") && String.valueOf(m.charAt(i)).equals("0")) {
				sum += "0";
			}
			if (String.valueOf(n.charAt(i)).equals("1") && String.valueOf(m.charAt(i)).equals("1")) {
				sum += "0";
			}
			

		}
		System.out.println(sum);
	}

}
