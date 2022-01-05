package caesarCipher;

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
	 * Complete the 'caesarCipher' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. STRING s 2. INTEGER k
	 */

	public static String caesarCipher(String s, int k) {
		// Write your code here

		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if (k % 26 > 0) {
				k = k % 26;
			}
			if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {

				if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') && (char) (s.charAt(i) + k) > 'z') {
					result += (char) (96 + (s.charAt(i) + k) - 122);
				} else if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') && (char) (s.charAt(i) + k) > 'Z') {
					result += (char) (64 + (s.charAt(i) + k) - 90);
				} else {
					result += (char) (s.charAt(i) + k);
				}

			} else {
				result += s.charAt(i);
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
//		int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//		String s = bufferedReader.readLine();
//
//		int k = Integer.parseInt(bufferedReader.readLine().trim());
//
//		String result = Result.caesarCipher(s, k);
//
//		bufferedWriter.write(result);
//		bufferedWriter.newLine();
//
//		bufferedReader.close();
//		bufferedWriter.close();
		String s = "z";
		System.out.println((s.charAt(0) + 27) % 26);
		System.out.println(Result.caesarCipher(s, 27));

	}
}
