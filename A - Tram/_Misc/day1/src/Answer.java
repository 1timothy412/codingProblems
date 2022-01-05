import java.util.Scanner;

class Quiz{
	Scanner scan = new Scanner(System.in);
	String a = "a. int 1x=10";
	String b = "b. int x=10";
	String c = "c. float x=10.0f;";
	String d = "d. string x=\"10\";";
	
	public void check() {
		System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
		System.out.println(a+"\n"+b+"\n"+c+"\n"+d);
		System.out.println("Please enter your choice: ");
		String s = scan.next();
		if(s.equalsIgnoreCase("b")) {
			System.out.println("Correct");
		}else {
			System.out.println("Sorry your answer is incorect!");
		}
	}
}
public class Answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quiz foo = new Quiz();
		foo.check();
	}

}
