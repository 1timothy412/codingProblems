import java.util.ArrayList;
import java.util.List;

final class A {

	final List<Integer> move(List<Integer> input) {
		List<Integer> result = new ArrayList<Integer>();
		List<Integer> negative = new ArrayList<Integer>();
		List<Integer> positive = new ArrayList<Integer>();
		for (int i = 0; i < input.size(); i++) {
			if (input.get(i) < 0) {
				negative.add(input.get(i));

			} else {
				positive.add(input.get(i));
			}
		}

		for (int i = 0; i < negative.size(); i++) {
			result.add(negative.get(i));

		}
		for (int i = 0; i < positive.size(); i++) {
			result.add(positive.get(i));

		}

		return result;
	}
}

public class MoveNegativeToOneSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = {-5, 11, 28, -31, -27, 40, 4, -35, -36, 7};
		List<Integer> input = new ArrayList<Integer>();
		for(int i=0;i<inputArray.length;i++) {
			input.add(inputArray[i]);
		}
		A bar = new A();
		System.out.println(bar.move(input));

	}

}
