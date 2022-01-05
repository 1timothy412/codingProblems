package timeConversion;

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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    	NumberFormat format = NumberFormat.getInstance(Locale.ENGLISH);
    	format.setMinimumIntegerDigits(2);
    	String[] t = s.split("");
    	int hour = Integer.parseInt(t[0]+t[1]);
    	String dayOrNight = t[8]+t[9];
    
    	if(dayOrNight.equals("PM") && hour != 12) {
    		hour = hour+12;
    	}
    	if(dayOrNight.equals("AM") && hour == 12) {
    		hour = 0;
    	}
    	
    	String result = ""+format.format(hour);
    	for(int i=2;i<t.length-2;i++) {
    		result += t[i];
    	}
    	return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = bufferedReader.readLine();
//
//        String result = Result.timeConversion(s);
//
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    	
    	NumberFormat format = NumberFormat.getInstance(Locale.ENGLISH);
    	format.setMinimumIntegerDigits(2);
//    	System.out.println(format.format(1));
    	
    	String s = "12:40:22AM";
//    	String[] t = s.split("");
//    	int hour = Integer.parseInt(t[0]+t[1]);
//    	String dayOrNight = t[8]+t[9];
//    	System.out.println(dayOrNight);
//    	System.out.println(t);
//    	for(int i=0;i<t.length;i++) {
//    		System.out.print(t[i]);
//    	}
//    	System.out.println(hour);
    	System.out.println(Result.timeConversion(s));
    	
    			
    }
}
/*
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Example


Return '12:01:00'.


Return '00:01:00'.

Function Description

Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

string s: a time in  hour format
Returns

string: the time in  hour format
Input Format

A single string  that represents a time in -hour clock format (i.e.:  or ).

Constraints

All input times are valid
Sample Input 0

07:05:45PM
Sample Output 0

19:05:45

*/
