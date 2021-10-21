import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int exit;
		int n = scan.nextInt();
		int[] input = new int[n * 2];
		for (int m = 0; m < n * 2; m++) {
			input[m] = scan.nextInt();
		}
		int[] p1 = Arrays.copyOf(input, n * 2);

		int sum = 0;
		int temp = 0;
		for (int i = 0; i < p1.length; i++) {
			if (i % 2 == 0) {
				p1[i] = p1[i] * (-1);
			}
		}
		for (int i = 2; i < p1.length; i = i + 2) {
			if (i == 2 && i != p1.length - 2) {

				sum = sum + (p1[i] + p1[i - 1]) + p1[i + 1];
				if (temp <= sum) {
					temp = sum;
				}
			}
			if (i != 2 && i != p1.length - 2) {
				sum = sum + (p1[i] + p1[i + 1]);
				if (temp <= sum) {
					temp = sum;
				}
			}
			if (i != 2 && i == p1.length - 2) {
				break;
			}
		}
//		System.out.println(sum);
		System.out.println(temp);
	}
}

