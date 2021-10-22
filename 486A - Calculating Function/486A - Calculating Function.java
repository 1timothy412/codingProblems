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

		final class Stuff {
			int power(int x, int y) {
				int total = 0;
				int temp = 1;
				if (y == 1) {
					return x;
				}
				for (int i = 0; i < y; i++) {
					total = temp * x;
					temp = total;
				}
				return total;
			}
		}
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;

		Stuff some = new Stuff();
		for (int i = 1; i < n+1; i++) {
			sum += (some.power(-1, i) * i);
		}
		System.out.println(sum);

	}

}
