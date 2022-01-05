// Time exceeded with extremely large numbers

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int counter = 1;
		int a, b;
		int[] result = new int[t];
		for (int f1 = 0; f1 < t; f1++) {
			a = scan.nextInt();
			b = scan.nextInt();
			for (int f2 = 0; f2 < counter; f2++) {
				if (a % b == 0) {
					result[f1] = f2;
					f2 = counter;
				} else {
					a+=1;
					result[f1] += 1;
					counter++;
				}
			}
			counter = 2;
		}
		for(int x:result) {
			System.out.println(x);
		}
	}

}
