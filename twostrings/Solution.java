package twostrings;

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
	 * Complete the 'twoStrings' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. STRING s1 2. STRING s2
	 */

	public static String twoStrings(String s1, String s2) {
		// Write your code here
		String result = "";
//		for (int i = 0; i < s1.length(); i++) {
//			for (int j = i + 1; j < s1.length() + 1; j++) {
//				if (s2.lastIndexOf(s1.substring(i, j)) != -1) {
//					result = "YES";
//					break;
//				} else {
//					result = "NO";
//				}
//			}
//			if (result == "YES") {
//				break;
//			}
//		}
		for (int i = 0; i < s1.length(); i++) {
			if (s2.lastIndexOf(s1.charAt(i)) != -1) {
				result = "YES";
				break;
			} else {
				result = "NO";
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
//				String s1 = bufferedReader.readLine();
//
//				String s2 = bufferedReader.readLine();
//
//				String result = Result.twoStrings(s1, s2);
//
//				bufferedWriter.write(result);
//				bufferedWriter.newLine();
//			} catch (IOException ex) {
//				throw new RuntimeException(ex);
//			}
//		});
//
//		bufferedReader.close();
//		bufferedWriter.close();
		String s1 = "hackerrankcommunity";
		String s2 = "cdecdecdecde";
//		System.out.println(s2.lastIndexOf(s1.substring(0, 1)));
		System.out.println(Result.twoStrings(s1, s2));

	}
}
/*
 * https://www.hackerrank.com/challenges/two-strings/problem?isFullScreen=true
 */
