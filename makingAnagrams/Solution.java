package makingAnagrams;

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
	 * Complete the 'makingAnagrams' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. STRING s1 2. STRING s2
	 */

	public static int makingAnagrams(String s1, String s2) {
		// Write your code here
		int result=0;
		TreeSet<Character> ts1 = new TreeSet<Character>();
		for(int i=0;i<s1.length();i++) {
			ts1.add(s1.charAt(i));
		}
		for(int i=0;i<s2.length();i++) {
			ts1.add(s2.charAt(i));
		}
		int count=0;
		char temp;
		Object[] al = ts1.toArray();
		List<Integer> s1Count = new ArrayList<Integer>();
		List<Integer> s2Count = new ArrayList<Integer>();
		for(int i=0;i<al.length;i++) {
			count=0;
			for(int j=0;j<s1.length();j++) {
				temp = s1.charAt(j);
				if(temp == (char)al[i]) {
					count++;
				}
			}
			s1Count.add(count);
		}
		for(int i=0;i<al.length;i++) {
			count=0;
			for(int j=0;j<s2.length();j++) {
				temp = s2.charAt(j);
				if(temp == (char)al[i]) {
					count++;
				}
			}
			s2Count.add(count);
		}
		for(int i=0;i<al.length;i++) {
			result += Math.abs(s1Count.get(i) - s2Count.get(i)); 
		}
//		System.out.println(ts1);
//		System.out.println(s1Count);
//		System.out.println(s2Count);
		
		return result;
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//		String s1 = bufferedReader.readLine();
//
//		String s2 = bufferedReader.readLine();
//
//		int result = Result.makingAnagrams(s1, s2);
//
//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//
//		bufferedReader.close();
//		bufferedWriter.close();
		String s1 = "bacdc";
		String s2 = "dcbad";

		System.out.println(Result.makingAnagrams(s1, s2));
	}
}
/*
 * We consider two strings to be anagrams of each other if the first string's
 * letters can be rearranged to form the second string. In other words, both
 * strings must contain the same exact letters in the same exact frequency. For
 * example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.
 * 
 * Alice is taking a cryptography class and finding anagrams to be very useful.
 * She decides on an encryption scheme involving two large strings where
 * encryption is dependent on the minimum number of character deletions required
 * to make the two strings anagrams. Can you help her find this number?
 * 
 * Given two strings, and , that may not be of the same length, determine the
 * minimum number of character deletions required to make and anagrams. Any
 * characters can be deleted from either of the strings.
 * 
 * Example.
 * 
 * 
 * The only characters that match are the 's so we have to remove from and from
 * for a total of deletions.
 * 
 * Function Description
 * 
 * Complete the makingAnagrams function in the editor below.
 * 
 * makingAnagrams has the following parameter(s):
 * 
 * string s1: a string string s2: a string Returns
 * 
 * int: the minimum number of deletions needed Input Format
 * 
 * The first line contains a single string, . The second line contains a single
 * string, .
 * 
 * Constraints
 * 
 * It is guaranteed that and consist of lowercase English letters, ascii[a-z].
 * Sample Input
 * 
 * cde abc Sample Output
 * 
 * 4 Explanation
 * 
 * Delete the following characters from our two strings to turn them into
 * anagrams:
 * 
 * Remove d and e from cde to get c. Remove a and b from abc to get c.
 * characters have to be deleted to make both strings anagrams.
 * 
 * 
 */