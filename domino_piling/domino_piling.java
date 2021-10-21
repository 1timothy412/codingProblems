import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner scan = new Scanner(System.in);
		String board[] = scan.nextLine().split(" ");
//		System.out.println(board);

		int boardArea = Integer.parseInt(board[0])*Integer.parseInt(board[1]);

		int maxDominoCount = boardArea/2;
		System.out.println(maxDominoCount);

	}
}
