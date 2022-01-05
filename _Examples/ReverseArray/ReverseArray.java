import java.util.Arrays;

final class A {
	final int[] reverse(int[] input) {
		int length = input.length;
		int[] result = new int[length];
		for (int i = 0; i < length; i++) {
			result[i] = input[length - 1-i];
		}
		return result;
	}

}

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 5, 2, 4, 1, 354, 54, 941, 300 };
		A foo = new A();
		System.out.println(Arrays.toString(foo.reverse(input)));
	}

}
