package birthdayCakeCandles;

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
	 * Complete the 'birthdayCakeCandles' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY candles as parameter.
	 */

	public static int birthdayCakeCandles(List<Integer> candles) {
		// Write your code here
		Collections.sort(candles);
		int count = 0;
		for (int i = candles.size()-1; i >= 0; i--) {
			if (candles.get(i).equals(candles.get(candles.size() - 1))) {
				count += 1;
			}
			else {
				break;
			}
		}
		return count;
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//		int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//		List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//				.map(Integer::parseInt).collect(toList());
//
//		int result = Result.birthdayCakeCandles(candles);
//
//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//
//		bufferedReader.close();
//		bufferedWriter.close();
		List<Integer> candles = new ArrayList<Integer>();
		candles.add(500);
		candles.add(500);
		candles.add(500);
		candles.add(500);
		int[] foo = {500,500};
		System.out.println(candles);
		System.out.println(Result.birthdayCakeCandles(candles));
		System.out.println(candles.get(3).equals(candles.get(2)));
		System.out.println(500==500);
		System.out.println(foo[0]==foo[1]);
	}
}
