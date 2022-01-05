
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean flag = true;

		while(flag){

			System.out.println("Press key:");

			String n = sc.next();

			switch(n){

					case "1": System.out.println("you pressed 1");

				break;

					case "2": System.out.println("you pressed 2");

				break;

					case "3": System.out.println("you pressed 3");

				break;

					case "4": System.out.println("you pressed 4");

				break;

					case "5": System.out.println("you pressed 5");

				break;
		
					case "6": System.out.println("you pressed 6");

				break;

					case "7": System.out.println("you pressed 7");

				break;

					case "8": System.out.println("you pressed 8");

				break;

					case "9": System.out.println("you pressed 9");

				break;

					case "0": System.out.println("you pressed 0");

				break;

					default: System.out.println("Not allowed");

				break;
			}
		}
	}
}