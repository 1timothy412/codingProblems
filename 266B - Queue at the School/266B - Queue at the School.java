import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total = scan.nextInt();
		int time = scan.nextInt();
		int whileCount = 0;
		String[] student = new String[total];
		String temp = scan.next();
		for (int i = 0; i < total; i++) {
			student[i] = String.valueOf(temp.charAt(i));
		}
		while (whileCount < time) {
			for (int k = 0; k < total - 1; k++) {
				if (student[k].equals("B") && student[k + 1].equals("G")) {
					student[k] = "G";
					student[k + 1] = "B";
					k++;
				}
			}
			whileCount++;
		}
		for (String s : student) {
			System.out.print(s);
		}
	}
}
