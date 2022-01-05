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
		String[] s = scan.nextLine().split(" ");
		int result=0;
		Set<String> foo = new HashSet<String>();
		for(int i=0;i<s.length;i++) {
			foo.add(s[i]);
					}
		result = Math.abs(foo.size()-s.length);
		
		
		System.out.println(result);
	}

}
