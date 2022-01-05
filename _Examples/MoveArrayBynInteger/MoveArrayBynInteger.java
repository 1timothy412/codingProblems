import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 99 };
		// 1, 2, 3, 4, 5 => 5,1,2,3,4
		// 1,2,3,4,5 => 5,4,1,2,3

		int increment = 5;
		int[] result = new int[input.length];
		// Write back into first
		for (int i = 0; i < increment; i++) {
			result[i] = input[input.length - i - 1];
		}
		// Write beginning into after first
		for (int i = increment; i < input.length; i++) {
			result[i] = input[i - increment];
		}
		System.out.println(Arrays.toString(result));
	}

}
