package beautifulBinaryString;

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
	 * Complete the 'beautifulBinaryString' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts STRING b
	 * as parameter.
	 */

	public static int beautifulBinaryString(String b) {
		// Write your code here
		int count = 0;
		int k=0;
		while((b.substring(k)).indexOf("010")>-1) {
//			System.out.println(b.substring(k));
//			System.out.println(b.substring(k).indexOf("010"));
			k=b.substring(k).indexOf("010")+k+3;
			count++;
//			System.out.println(b.substring(k));
		}

		return count;
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//		int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//		String b = bufferedReader.readLine();
//
//		int result = Result.beautifulBinaryString(b);
//
//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//
//		bufferedReader.close();
//		bufferedWriter.close();
		String s = "0100101010100010110100100110110100011100111110101001011001110111110000101011011111011001111100011101";
		String s1 = "0101";
//		System.out.println(s.indexOf("010"));
		
		System.out.println(Result.beautifulBinaryString(s));
		

	}
}
