class Generate {
	public int getRandom(int a, int b) {
		int num = (int) (Math.random() * (b - a)) + a;

		return num;
	}
}

public class GenerateRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generate foo = new Generate();
		System.out.println(foo.getRandom(1, 6));
	}

}
