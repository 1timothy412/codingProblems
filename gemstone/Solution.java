package gemstone;

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
	 * Complete the 'gemstones' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * STRING_ARRAY arr as parameter.
	 */

	public static int gemstones(List<String> arr) {
		// Write your code here
		int result=0;
		String[] letters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };
		List<Integer> count = new ArrayList<Integer>();
		int foo = 0;
		for (int i = 0; i < letters.length; i++) {
			foo = 0;
			for (int j = 0; j < arr.size(); j++) {
				if (arr.get(j).indexOf(letters[i]) > -1) {
					foo++;
				}
			}
			count.add(foo);
		}
		for(int i = 0;i<count.size();i++) {
			if(count.get(i)==arr.size()) {
				result++;
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
//		List<String> arr = IntStream.range(0, n).mapToObj(i -> {
//			try {
//				return bufferedReader.readLine();
//			} catch (IOException ex) {
//				throw new RuntimeException(ex);
//			}
//		}).collect(toList());
//
//		int result = Result.gemstones(arr);
//
//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//
//		bufferedReader.close();
//		bufferedWriter.close();
		List<String> arr = new ArrayList<String>();
		arr.add("abcdde");
		arr.add("baccd");
		arr.add("eeabg");
		System.out.println(Result.gemstones(arr));
	}
}
