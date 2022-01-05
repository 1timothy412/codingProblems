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

		class Sum {
			public int GetSum(int a, int b) {
				// Good luck!
				int sum = 0;
				int[] array1 = { a, b };
				int temp = 0;
				Arrays.sort(array1);
				a = array1[0];
				b = array1[1];
				if (a == 0 && b == 0) {
					return sum;
				}
				if (a >= 0 && b > 0) {
					for (int i = a; i <= b; i++) {
						sum += i;
					}
				}
				if (a < 0 && b <= 0) {
					a = (-1) * a; // 5
					b = (-1) * b; // 0
					temp = a;
					a = b;
					b = temp;
					for (int i = a; i <= b; i++) {
						sum += i;
					}
					sum = (-1) * sum;
					return sum;
				}
				if (a < 0 && b > 0) {
					a = (-1) * a; // 5
					for (int i = 0; i <= a; i++) {
						sum += i;
					}
					sum = (-1) * sum;
					for (int i = 0; i <= b; i++) {
						sum += i;
					}
					return sum;
				}
				return sum;

			}
		}

		Sum foo = new Sum();
//		System.out.println(foo.GetSum(0, 0));
//		System.out.println(foo.GetSum(0, 5));
//		System.out.println(foo.GetSum(-5, 0));
		System.out.println(foo.GetSum(-5, 5));
	}

}
