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
		String temp1=scan.next();
		String temp2 = scan.next();
		StringBuilder t = new StringBuilder(temp1);
		StringBuilder s = new StringBuilder(temp2);
		t = t.reverse();
//		System.out.println(t);
		if(t.toString().equals(s.toString())) {
		System.out.println("YES");
		}
		else {System.out.println("NO");
		}
	}
}
