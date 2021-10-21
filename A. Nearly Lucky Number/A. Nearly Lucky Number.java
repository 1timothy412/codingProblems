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
		String s = scan.nextLine();
		int luckyCount = 0;
		int nonLuckyCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (String.valueOf(s.charAt(i)).equals("4") || String.valueOf(s.charAt(i)).equals("7")) {
				luckyCount++;
			} else {
				nonLuckyCount++;
			}
		}
		if (luckyCount > 0 && nonLuckyCount <= 0 && s.length()>1) {
			if (luckyCount == 4 || luckyCount == 7) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}
		if (luckyCount > 0 && nonLuckyCount <= 0 && s.length()==1) {
			System.out.println("NO");

		}
		if (luckyCount <= 0 && nonLuckyCount > 0) {
			System.out.println("NO");
		}
		if (luckyCount > 0 && nonLuckyCount > 0) {
			if (luckyCount == 4 || luckyCount == 7) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
