import java.util.ArrayList;
import java.util.List;

final class PeakElement {
	protected List find(int[] input) {
		List result = new ArrayList();
		int inputLength = input.length;
		for (int i = 0; i < inputLength; i++) {
			// 1st index 0
			if (i == 0) {
				if (input[i] > input[i + 1]) {
					result.add(input[i]);
				}
			}
			// last index
			if (i == input.length - 1) {
				if (input[i] > input[i - 1]) {
					result.add(input[i]);
				}
			}
			// middle indexes
			if (i > 0 && i < input.length-1) {
				if (input[i] > input[i - 1] && input[i] > input[i + 1]) {
					result.add(input[i]);
				}
			}
		}

		return result;

	}
}

public class FindPeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// case 1 - peak is at index 0 and last index
		int[] input = { 59,1,1,1,1,1,19 };
		// case 2 - peak is in middle
		int[] input2 = { 0,1,2,1,88,1,0 };
		PeakElement foo = new PeakElement();
		// result of case 1
		System.out.println(foo.find(input));
		// result of case 2
		System.out.println(foo.find(input2));
	}

}
