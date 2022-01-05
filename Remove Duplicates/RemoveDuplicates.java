import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] array = scan.nextLine().split(",");
		HashSet unique = new HashSet();
		for (int i = 0; i < array.length; i++) {
			unique.add(array[i]);
		}
		for (Object obj : unique) {
			System.out.print(obj + " ");
		}

		// Method 2
		int[] foo = { 2, 23, 12, 12, 0, 3, 2, 4 };
		int[] bar = new int[foo.length];
		List list1 = new ArrayList();
		Arrays.sort(foo);
		for (int i = 0; i < foo.length; i++) {
			if (i == 0) {
				list1.add(foo[i]);
			}
			if (i == foo.length - 1) {
				if (foo[i] != foo[i - 1]) {
					list1.add(foo[i]);
				}
			}
			if (i > 0 && i < foo.length - 1) {

				if (foo[i] != foo[i - 1]) {
					list1.add(foo[i]);

				}

			}
		}
		System.out.println(list1);
	}

}
