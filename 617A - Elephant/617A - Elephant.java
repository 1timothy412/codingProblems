import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		String[] input = scan.nextLine().split(" ");
		int distance = scan.nextInt();
		int step = 0;
		if (distance / 5 != 0) {
			step += distance / 5;
			distance = distance - (distance / 5) * 5;

		} if (distance / 4 != 0) {
			step += distance / 4;
			distance = distance - (distance / 4) * 4;

		} if (distance / 4 != 0) {
			step += distance / 3;
			distance = distance - (distance / 3) * 3;

		} if (distance / 2 != 0) {
			step += distance / 2;
			distance = distance - (distance / 2) * 2;

		} else {
			step += distance / 1;
			distance = distance - (distance / 1) * 1;

		}
		System.out.println(step);

	}

}
