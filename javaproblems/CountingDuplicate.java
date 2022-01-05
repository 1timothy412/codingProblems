package javaproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Task {
	static public Map<Character, Integer> count(String str) {
		HashMap<Character, Integer> result = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char key = str.charAt(i);
			result.compute(key, (k, v) -> (v == null) ? 1 : v + 1);
		}
		return result;
	}
}

interface MyNumber{
	double getValue();
}



public class CountingDuplicate {

	public static void main(String[] args) {
		String input = "abcdabcd";
		System.out.println(Task.count(input));
		Set set = new HashSet();
		set.add(1);
		set.add(21);
		set.forEach((e) -> System.out.println(e));
		String s = "foo";
		int n = 2;
		MyNumber x;
		x=()->10.5;
		System.out.println(x.getValue());
		System.out.println(x.getClass());

	}
}
