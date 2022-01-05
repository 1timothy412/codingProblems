package hackerrankinastring;

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
	 * Complete the 'hackerrankInString' function below.
	 *
	 * The function is expected to return a STRING. The function accepts STRING s as
	 * parameter.
	 */

	public static String hackerrankInString(String s) {
		// Write your code here
		int i0 = 0;
		int i1 = 0;
		int i2 = 0;
		int i3 = 0;
		int i4 = 0;
		int i5 = 0;
		int i6 = 0;
		int i7 = 0;
		int i8 = 0;
		int i9 = 0;

		while (true) {
			if (s.indexOf('h') < 0 || s.indexOf('a') < 0 || s.indexOf('c') < 0 || s.indexOf('k') < 0
					|| s.indexOf('e') < 0 || s.indexOf('r') < 0 || s.indexOf('r') < 0 || s.indexOf('a') < 0
					|| s.indexOf('n') < 0 || s.indexOf('k') < 0) {
				break;
			} else {
				i0 = s.indexOf('h');
				i1 = i0 + s.substring(i0).indexOf('a');
				i2 = i1 + s.substring(i1).indexOf('c');
				i3 = i2 + s.substring(i2).indexOf('k');
				i4 = i3 + s.substring(i3).indexOf('e');
				i5 = i4 + s.substring(i4).indexOf('r');
				i6 = i5 + 1 + s.substring(i5 + 1).indexOf('r');
				i7 = i6 + s.substring(i6).indexOf('a');
				i8 = i7 + s.substring(i7).indexOf('n');
				i9 = i8 + s.substring(i8).indexOf('k');
//				System.out.println("h" + i0);
//				System.out.println("a" + i1);
//				System.out.println("c" + i2);
//				System.out.println("k" + i3);
//				System.out.println("e" + i4);
//				System.out.println("r" + i5);
//				System.out.println("r" + i6);
//				System.out.println("a" + i7);
//				System.out.println("n" + i8);
//				System.out.println("k" + i9);

			}
			break;

		}
		if (i0 < i1 && i1 < i2 && i2 < i3 && i3 < i4 && i4 < i5 && i5 < i6 && i6 < i7 && i7 < i8 && i8 < i9) {
			return "YES";

		} else {
			return "NO";
		}

	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int q = Integer.parseInt(bufferedReader.readLine().trim());
//
//        IntStream.range(0, q).forEach(qItr -> {
//            try {
//                String s = bufferedReader.readLine();
//
//                String result = Result.hackerrankInString(s);
//
//                bufferedWriter.write(result);
//                bufferedWriter.newLine();
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        bufferedReader.close();
//        bufferedWriter.close();
		String s = "hhaacckkekraraannk";
		System.out.println(Result.hackerrankInString(s));


	}
}

/*
 * We say that a string contains the word hackerrank if a subsequence of its
 * characters spell the word hackerrank. Remeber that a subsequence maintains
 * the order of characters selected from a sequence.
 * 
 * More formally, let be the respective indices of h, a, c, k, e, r, r, a, n, k
 * in string . If is true, then contains hackerrank.
 * 
 * For each query, print YES on a new line if the string contains hackerrank,
 * otherwise, print NO.
 * 
 * Example
 * 
 * This contains a subsequence of all of the characters in the proper order.
 * Answer YES
 * 
 * 
 * This is missing the second 'r'. Answer NO.
 * 
 * 
 * There is no 'c' after the first occurrence of an 'a', so answer NO.
 * 
 * Function Description
 * 
 * Complete the hackerrankInString function in the editor below.
 * 
 * hackerrankInString has the following parameter(s):
 * 
 * string s: a string Returns
 * 
 * string: YES or NO Input Format
 * 
 * The first line contains an integer , the number of queries. Each of the next
 * lines contains a single query string .
 * 
 * Constraints
 * 
 * Sample Input 0
 * 
 * 2 hereiamstackerrank hackerworld Sample Output 0
 * 
 * YES NO Explanation 0
 * 
 * We perform the following queries:
 * 
 * 
 * The characters of hackerrank are bolded in the string above. Because the
 * string contains all the characters in hackerrank in the same exact order as
 * they appear in hackerrank, we return YES. does not contain the last three
 * characters of hackerrank, so we return NO. Sample Input 1
 * 
 * 2 hhaacckkekraraannk rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt Sample
 * Output 1
 * 
 * YES NO
 * 
 */