import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int in = 0;
		int out = 0;
		int total = 0;
		int temp = 0;
		int n = scan.nextInt();
		for(int i=0;i<n;i++) {
			out = scan.nextInt();
			in = scan.nextInt();
			total = (in - out)+total;
			if(temp<total) {
				temp = total;
			}
		}
		System.out.println(temp);
	}
}
