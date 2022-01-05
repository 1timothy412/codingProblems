package alternatingCharacters;

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
	 * Complete the 'alternatingCharacters' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts STRING s
	 * as parameter.
	 */

	public static int alternatingCharacters(String s) {
		// Write your code here
		int count=0;
		List<Character> foo = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			foo.add(s.charAt(i));
		}
		int k = foo.size();
		for (int i = 0; i < k-1; i++) {
			if (foo.get(i) == foo.get(i + 1)) {
				foo.remove(i + 1);
				k--;
				i--;
				count++;
			
			}
		}
//		System.out.println(foo);
		return count;
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
//				int result = Result.alternatingCharacters(s);
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
		String s = "AAAA";
		System.out.println(Result.alternatingCharacters(s));
	}
}
