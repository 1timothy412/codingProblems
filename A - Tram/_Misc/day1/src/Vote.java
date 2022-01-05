import java.util.Scanner;

class AgeCheck {
	Scanner scan = new Scanner(System.in);

	public void ageCheck() {
		System.out.println("Please enter your age: ");
		int age = scan.nextInt();
		if (age >= 18) {
			System.out.println("You are eligible to vote");
		} else {
			System.out.println("Sorry you are not old enough to vote!");

		}
	}

}

public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgeCheck foo = new AgeCheck();
		foo.ageCheck();
	}

}
