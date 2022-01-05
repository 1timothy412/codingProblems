import java.util.Scanner;

class Sales {
	Scanner scan = new Scanner(System.in);

	public void getRevenue() {

		int price, quant;
		double revenue;

		System.out.println("Enter unit price: ");
		price = scan.nextInt();

		System.out.println("Enter quantity: ");
		quant = scan.nextInt();

		revenue = quant * price - quant * price * discountRate(quant);
		System.out.println("The revenue from sale: $" + revenue);
		System.out.println(
				"After discount: $" + quant * price * discountRate(quant) + " (" + discountRate(quant) * 100 + "%)");

	}

	double discountRate(int quant) {
		double rate = 0;
		if (quant >= 100 && quant <= 120) {
			rate = 0.1;
		}
		if (quant > 120) {
			return 0.15;
		}
		if (quant < 100) {
			rate = 0;
		}
		return rate;

	}
}

public class Revenue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sales foo = new Sales();
		foo.getRevenue();
	}

}
