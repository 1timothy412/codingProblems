package javaproblems;

import java.util.Arrays;
class TaskFirstNonRepeating{
	static void find(char[] input) {
		
		int k = 1;
		int count = 0;
		int index = 0;
		for (int i = 0; i < input.length; i++) {
			if (i == 0) {
				count++;
				if (input[i] == input[k]) {
					count++;
					k++;
				} else {
					System.out.println(input[i]);
					break;
				}

			} else {
				if (i == input.length - 1) {
					if (input[i] == input[i - 1]) {
						System.out.println("No non-repeating");
					} else {
						System.out.println(input[i]);
						break;
					}
				} else {
					if (input[i] == input[k] || input[i] == input[i - 1]) {
						count++;
						k++;
					} else {
						System.out.println(input[i]);
						break;
					}
				}

			}
		}
		
	}
}

public class FirstNonRepeating {

	public static void main(String[] args) {
		char[] input = { 'a', 'a' };
//		System.out.println(input);
		Arrays.sort(input);
//		System.out.println(input);
		TaskFirstNonRepeating.find(input);

	}

}
