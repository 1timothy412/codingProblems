package gameOfThrones;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'gameOfThrones' function below.
	 *
	 * The function is expected to return a STRING. The function accepts STRING s as
	 * parameter.
	 */

	public static String gameOfThrones(String s) {
		// Write your code here
		int odd = 0;
		int even = 0;
		String r = "";
		Map<Character, Integer> result = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
		}
		List<Integer> foo = new ArrayList<Integer>();
		result.forEach((k, v) -> {
			foo.add(v);
		});
		Collections.sort(foo);
		System.out.println(foo);
		if (s.length() % 2 == 0) {
			for (int i = 0; i < foo.size() - 1; i++) {
				if (foo.get(i) % 2 != 0) {
					r = "NO";
					break;
				} else {
					r = "YES";
				}
			}

		} else {
			for (int i = 0; i < foo.size() - 1; i++) {
				if (foo.get(i) % 2 != 0) {
					odd++;
				}
			}
			if (odd != 1) {
				r = "NO";
			} else {
				r = "YES";
			}
		}

		return r;
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = bufferedReader.readLine();
//
//        String result = Result.gameOfThrones(s);
//
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
		String s = "ddddd";
		System.out.println(Result.gameOfThrones(s));

	}
}

/*
 * Dothraki are planning an attack to usurp King Robert's throne. King Robert
 * learns of this conspiracy from Raven and plans to lock the single door
 * through which the enemy can enter his kingdom.
 * 
 * door
 * 
 * But, to lock the door he needs a key that is an anagram of a palindrome. He
 * starts to go through his box of strings, checking to see if they can be
 * rearranged into a palindrome. Given a string, determine if it can be
 * rearranged into a palindrome. Return the string YES or NO.
 * 
 * Example
 * 
 * One way this can be arranged into a palindrome is . Return YES.
 * 
 * Function Description Complete the gameOfThrones function below.
 * 
 * gameOfThrones has the following parameter(s):
 * 
 * string s: a string to analyze Returns
 * 
 * string: either YES or NO Input Format
 * 
 * A single line which contains .
 * 
 * Constraints
 * 
 * |s| contains only lowercase letters in the range Sample Input 0
 * 
 * aaabbbb Sample Output 0
 * 
 * YES Explanation 0
 * 
 * A palindromic permutation of the given string is bbaaabb.
 * 
 * Sample Input 1
 * 
 * cdefghmnopqrstuvw Sample Output 1
 * 
 * NO Explanation 1
 * 
 * Palindromes longer than 1 character are made up of pairs of characters. There
 * are none here.
 * 
 * Sample Input 2
 * 
 * cdcdcdcdeeeef Sample Output 2
 * 
 * YES Explanation 2
 * 
 * An example palindrome from the string: ddcceefeeccdd.
 */
