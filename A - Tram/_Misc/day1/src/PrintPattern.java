
class Pattern{
	public void print(int a, String s) {
		int counter = 0;
		while(counter <a) {
			System.out.println(s);
			counter++;
		}
	}
}
public class PrintPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern foo = new Pattern();
		foo.print(6, "*****");
	}

}
