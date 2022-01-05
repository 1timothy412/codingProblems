package javaproblems;

import java.util.ArrayList;
import java.util.Arrays;

/*
You are given an array arr[] of N integers including 0. The task is to find the smallest positive number missing from the array.
Example 1:
Input:
N = 5
arr[] = {1,2,3,4,5}
Output: 6
Explanation: Smallest positive missing 
number is 6.

Input:
N = 5
arr[] = {0,-10,1,3,-20}
Output: 2
Explanation: Smallest positive missing 
number is 2.
*/

public class SmallestMissingInteger {

	public static void main(String[] args) {
		int[] arr = {0,-10,1,3,-20};
//		int[] arr = { 1, 2, 3 };
//		int[] arr = { -4, -5, 1, 3 };
//		int[] arr = { -4, -5, 1 };
//		int[] arr = { -4, -5, 2, 3 };
//		int[] arr = { -4,-5,2,4};
		Arrays.sort(arr);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		int result = 0;
		int counter = 0;
		System.out.println();
		ArrayList foo = new ArrayList();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				foo.add(arr[i]);
			}
		}
		int[] bar = new int[foo.size()];
		for (int i = 0; i < foo.size(); i++) {
			bar[i] = (int) foo.get(i);
		}

		for (int i = 0; i < bar.length; i++) {
			if (bar.length == 1) {
				System.out.println(bar[0] + 1);
				counter++;
				break;
			}
			if (i == 0) {
				if (bar[i] != 1) {
					if (bar[i] > 1) {
						System.out.println(1);
						counter++;
						break;
					}

				}
				if (bar[i] == 1) {
					if (bar[i] + 1 < bar[i + 1]) {
						System.out.println(2);
						counter++;
						break;
					}

				}
			}

		}
		if (counter == 0) {
			System.out.println(bar[bar.length - 1] + 1);
		}

	}
}
