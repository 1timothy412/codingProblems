import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class app {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		String t = scan.next();
		int a = 0, d = 0;
//		System.out.println(s);
//		System.out.println(t);
		for (int i = 0; i < s; i++) {
			if (String.valueOf(t.charAt(i)).equals("A")) {
				a++;
			} else {
				d++;
			}
		}
		if (a > d) {
			System.out.println("Anton");
		}
		if (d > a) {
			System.out.println("Danik");
		}
		if (a == d) {
			System.out.println("Friendship");
		}
	}
}
