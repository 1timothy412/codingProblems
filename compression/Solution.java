package compression;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Foo {
	public static String compressedString(String message) {
		String result = "";
		int temp = 0;

//		for (int i = 0; i < message.length(); i++) {
//			if (i < message.length() - 1 && message.charAt(i) == message.charAt(i + 1)) {
//				k = i + 1;
//				while (true) {
//					if (k < message.length() && message.charAt(i) == message.charAt(k)) {
//						k++;
//						temp++;
//					} else {
//						break;
//					}
//				}
//				result += message.charAt(i);
//				result += temp + 1;
//				i = k - 1;
//				temp = 0;
//				k = 0;
//			} else {
//				result += message.charAt(i);
//			}
//
//		}

		List<String> foo = new ArrayList<String>();
		for (int i = 0; i < message.length(); i++) {
			foo.add(String.valueOf(message.charAt(i)));
			if (i != 0) {
				foo.add(String.valueOf(message.charAt(i)));
				if (foo.get(i) == String.valueOf(message.charAt(i - 1))) {
					foo.remove(i);
				}
			}

		}
		System.out.println(foo);
		return result;
	}
}

public class Solution {
	public static void main(String[] args) {
		String s = "aaa";
		System.out.println(Foo.compressedString(s));

	}
}
