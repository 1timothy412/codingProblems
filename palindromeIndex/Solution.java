package palindromeIndex;

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
	 * Complete the 'palindromeIndex' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts STRING s
	 * as parameter.
	 */

	public static int palindromeIndex(String s) {
		// Write your code here
		int result = 0;
		StringBuilder sb = new StringBuilder(s);
		StringBuilder sbReverse = new StringBuilder(s);
		sbReverse.reverse();
		String temp1 = "";
		String temp2 = "";
		if (sbReverse.equals(sb) == true) {
			result = -1;
		} else {
			for (int i = 0; i < s.length(); i++) {
//				System.out.println(i);
				sb.replace(0, sb.length(), s);
//				System.out.println(sb);
				sb.delete(i, i + 1);
				sbReverse.replace(0, sbReverse.length(), "");
				sbReverse.append(sb.toString());
				sbReverse.reverse();
//				
//				System.out.println(sb);
//				System.out.println(sbReverse);
				temp1 = sb.toString();
				temp2 = sbReverse.toString();
				if (temp1.equals(temp2) == true) {
					result = i;
					break;
				}
			}

		}
		return result;
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//		int q = Integer.parseInt(bufferedReader.readLine().trim());
//
//		IntStream.range(0, q).forEach(qItr -> {
//			try {
//				String s = bufferedReader.readLine();
//
//				int result = Result.palindromeIndex(s);
//
//				bufferedWriter.write(String.valueOf(result));
//				bufferedWriter.newLine();
//			} catch (IOException ex) {
//				throw new RuntimeException(ex);
//			}
//		});
//
//		bufferedReader.close();
//		bufferedWriter.close();
		String s = "aaabbbb";
		String s1 = "aaabbbb";
//		System.out.println(s1.length());
		System.out.println(Result.palindromeIndex(s1));
	}
}
/*
 * Given a string of lowercase letters in the range ascii[a-z], determine the
 * index of a character that can be removed to make the string a palindrome.
 * There may be more than one solution, but any will do. If the word is already
 * a palindrome or there is no solution, return -1. Otherwise, return the index
 * of a character to remove.
 * 
 * Example
 * 
 * Either remove 'b' at index or 'c' at index .
 * 
 * Function Description
 * 
 * Complete the palindromeIndex function in the editor below.
 * 
 * palindromeIndex has the following parameter(s):
 * 
 * string s: a string to analyze Returns
 * 
 * int: the index of the character to remove or Input Format
 * 
 * The first line contains an integer , the number of queries. Each of the next
 * lines contains a query string .
 * 
 * Constraints
 * 
 * All characters are in the range ascii[a-z]. Sample Input
 * 
 * STDIN Function ----- -------- 3 q = 3 aaab s = 'aaab' (first query) baa s =
 * 'baa' (second query) aaa s = 'aaa' (third query) Sample Output
 * 
 * 3 0 -1 Explanation
 * 
 * Query 1: "aaab" Removing 'b' at index results in a palindrome, so return .
 * 
 * Query 2: "baa" Removing 'b' at index results in a palindrome, so return .
 * 
 * Query 3: "aaa" This string is already a palindrome, so return . Removing any
 * one of the characters would result in a palindrome, but this test comes
 * first.
 * 
 * Note: The custom checker logic for this challenge is available here.
 */
