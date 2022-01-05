package missingnumbers;

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
	 * Complete the 'missingNumbers' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * following parameters: 1. INTEGER_ARRAY arr 2. INTEGER_ARRAY brr
	 */

	public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
		// Write your code here
		List<Integer> r = new ArrayList<Integer>();
		Collections.sort(arr);
		Collections.sort(brr);
		TreeSet ts = new TreeSet();
		ts.addAll(arr);
		ts.addAll(brr);
		List<Integer> arrCount = new ArrayList<Integer>();
		arrCount.add(0);
		arrCount.add(0);
		arrCount.add(0);
		arrCount.add(0);
		arrCount.add(0);
		arrCount.add(0);
		System.out.println(ts);


		System.out.println(arrCount);
		return r;
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		int[] foo = {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
		int[] bar = {203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204};
		List<Integer> arr = new ArrayList<Integer>();
		
		List<Integer> brr = new ArrayList<Integer>();
		for(int i=0;i<foo.length;i++) {
			arr.add(foo[i]);
		}
		for(int i=0;i<bar.length;i++) {
			arr.add(bar[i]);
		}
		
		System.out.println(Result.missingNumbers(arr, brr));

	}
}
