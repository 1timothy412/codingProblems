package strongPassword;

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
	 * Complete the 'minimumNumber' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER n 2. STRING password
	 */

	public static int minimumNumber(int n, String password) {
		// Return the minimum number of characters to make the password strong
		String[] temp = password.split("");
		String numbers = "0123456789";
		String lower_case = "abcdefghijklmnopqrstuvwxyz";
		String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String special_characters = "!@#$%^&*()-+";
		int countLength = 0;
		int countNum = 0;
		int countLs = 0;
		int countUs = 0;
		int countChar = 0;
		if (password.length() < 6) {
			countLength += 6 - password.length();
		}
		for (int i = 0; i < password.length(); i++) {
			if (numbers.indexOf(password.charAt(i)) == -1) {
				countNum = 1;
			} else {
				countNum = 0;
				break;

			}

		}
		for (int i = 0; i < password.length(); i++) {
			if (lower_case.indexOf(password.charAt(i)) == -1) {
				countLs = 1;
			} else {
				countLs = 0;
				break;

			}

		}
		for (int i = 0; i < password.length(); i++) {
			if (upper_case.indexOf(password.charAt(i)) == -1) {
				countUs = 1;
			} else {
				countUs = 0;
				break;

			}

		}
		for (int i = 0; i < password.length(); i++) {
			if (special_characters.indexOf(password.charAt(i)) == -1) {
				countChar = 1;
			} else {
				countChar = 0;
				break;

			}

		}
		int countOthers = countNum + countLs + countUs + countChar;
		if (countLength == 0) {
			return countOthers;
		} else {
			if (countOthers > countLength) {
				return countOthers;
			} else {
				return countLength;
			}
		}
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//		int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//		String password = bufferedReader.readLine();
//
//		int answer = Result.minimumNumber(n, password);
//
//		bufferedWriter.write(String.valueOf(answer));
//		bufferedWriter.newLine();
//
//		bufferedReader.close();
//		bufferedWriter.close();
		String password = "4700";
		System.out.println(Result.minimumNumber(4, password));

	}
}
