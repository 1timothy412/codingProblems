package javaproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TaskFirstNonRepeating2 {

	static char find(char[] input) {
		HashMap<Character, Integer> charsCount = new HashMap();
		char result = 'n';
		for (int i = 0; i < input.length; i++) {
			charsCount.compute(input[i], (k, v) -> (v == null) ? 1 : v + 1);
		}
		for (Map.Entry<Character, Integer> kvPair : charsCount.entrySet()) {
			if (kvPair.getValue() <= 1) {
				result = kvPair.getKey();
			}
		}
		return result;

	}
}

public class FirstNonRepeating2 {

	public static void main(String[] args) {
		char[] input = { 'a', 'a', 'b' };
//		System.out.println(input);
		Arrays.sort(input);
//		System.out.println(input);
		System.out.println(TaskFirstNonRepeating2.find(input));

	}

}
