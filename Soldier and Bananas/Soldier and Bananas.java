import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(" ");
		int cost = Integer.parseInt(input[0]);
		int money = Integer.parseInt(input[1]);
		int quantity = Integer.parseInt(input[2]);
		int totalCost = 0;

		for (int i = 1; i <= quantity; i++) {
			totalCost += cost * i;
		}

		if (money >= totalCost) {
			System.out.println(0);

		} else {
			System.out.println(totalCost - money);
		}

	}

}
