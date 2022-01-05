import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class MaxElement {

	final int find(int[] input) {
		int result = 0;
		int inputLength = input.length;
		for (int i = 0; i < inputLength; i++) {
			// 1st index 0
			if (i == 0) {
				if (input[i] < input[i + 1]) {
					result = (input[i]+1);
				} else {
					result = (input[i]);
				}
			}
			// middle and all remaining indexes
			if (i > 0) {
				if (input[i] > result) {
					result = input[i];
				}
			}
		}

		return result;

	}
}

public class FindMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// case 1 - max is at index 0
		int[] input = { 99, 1, 1, 1, 1, 1, 19 };
		// case 2 - max is at the last index
		int[] input2 = { -1, 5, 2, -50, 4, 1, 76 };
		// case 2 - max is in the middle
		int[] input3 = { -1, 5, 2, -90, 300, 1, -55 };
		MaxElement foo = new MaxElement();
		// result of case 1
		System.out.println(Arrays.toString(input));
		System.out.println(foo.find(input));
		// result of case 2
		System.out.println(Arrays.toString(input2));
		System.out.println(foo.find(input2));
		// result of case 3
		System.out.println(Arrays.toString(input3));
		System.out.println(foo.find(input3));
	}

}
