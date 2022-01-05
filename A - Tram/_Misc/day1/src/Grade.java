import java.util.Scanner;

class GradeCheck {
	Scanner scan = new Scanner(System.in);

	public void check() {
		int quizScore, midtermScore, finalScore, average;
		System.out.println("Please enter quiz score: ");
		quizScore = scan.nextInt();

		System.out.println("Please enter mid-term score: ");
		midtermScore = scan.nextInt();

		System.out.println("Please enter final score: ");
		finalScore = scan.nextInt();

		average = (quizScore + midtermScore + finalScore) / 3;
		String grade="A";
		if (average >= 90) {
			grade = "A";
		}
		if (average >= 70 && average < 90) {
			grade = "B";
		}
		if (average >= 50 && average < 70) {
			grade = "C";
		}
		if (average < 50) {
			grade = "F";
		}
		System.out.println("Your grade is " + grade);

	}
}

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeCheck foo = new GradeCheck();
		foo.check();

	}

}
