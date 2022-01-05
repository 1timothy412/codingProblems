package rotatearray;

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
	 * Complete the 'rotateLeft' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * following parameters: 1. INTEGER d 2. INTEGER_ARRAY arr
	 */

	public static List<Integer> rotateLeft(int d, List<Integer> arr) {
		// Write your code here
		List r = new ArrayList();
		int rotateBy = d % arr.size();
		// Add back
		for(int i=rotateBy;i<arr.size();i++) {
			r.add(arr.get(i));
		}
		// Add front
		for(int i=0;i<rotateBy;i++) {
			r.add(arr.get(i));
		}
		return r;
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		List<Integer> arr = new ArrayList<Integer>();
		for(int i=1;i<5;i++) {
			arr.add(i);
		}
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i));
		}
		System.out.println(Result.rotateLeft(5, arr));
	}
}
