import java.util.Scanner;

class Bank{
	public void getInterest() {
		double deposit;
		double interestRate;
		double taxRate;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter deposit amount: ");
		deposit = scan.nextDouble();
		System.out.println();
		
		System.out.println("Please enter interest rate (e.g: Enter 7.5 for 7.5%): ");
		interestRate = scan.nextDouble()/100;
		System.out.println();
		
		System.out.println("Please enter tax rate (e.g: Enter: 4 for 4%): ");
		taxRate = scan.nextDouble()/100;
		System.out.println();
		
		double earnedIncome = (deposit*interestRate)-(deposit*interestRate*taxRate);
		
		System.out.println("The amount of interest earned in the year: " + earnedIncome);
	}
	
}

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank foo = new Bank();
		foo.getInterest();
	}

}
