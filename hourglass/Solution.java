package hourglass;

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
	 * Complete the 'hourglassSum' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * 2D_INTEGER_ARRAY arr as parameter.
	 */

	public static int hourglassSum(List<List<Integer>> arr) {
		// Write your code here
		int max = 0;		
		List<Integer> sum = new ArrayList<Integer>();
		for (int i = 0; i < 4; i++) {
		
			for (int j = 0; j < 4; j++) {
				sum.add(arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) + arr.get(i + 1).get(j + 1)
						+ arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2));
			}
			
		}
		max = Collections.max(sum);
		return max;
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		List<List<Integer>> foo = new ArrayList<List<Integer>>();
		List<Integer> bar = new ArrayList<Integer>();
		List<Integer> bar1 = new ArrayList<Integer>();
		List<Integer> bar2 = new ArrayList<Integer>();
		List<Integer> bar3 = new ArrayList<Integer>();
		List<Integer> bar4 = new ArrayList<Integer>();
		List<Integer> bar5 = new ArrayList<Integer>();
		for (int i = 0; i < 6; i++) {
			bar.add(i);
			bar1.add(i);
			bar2.add(i);
			bar3.add(i);
			bar4.add(i);
			bar5.add(i);
		}
		foo.add(bar);
		foo.add(bar1);
		foo.add(bar2);
		foo.add(bar3);
		foo.add(bar4);
		foo.add(bar5);

		System.out.println(foo);
		System.out.println(Result.hourglassSum(foo));

	}
}
