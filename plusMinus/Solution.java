package plusMinus;

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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    	int positive=0;
    	int negative=0;
    	int none=0;
    	DecimalFormat df = new DecimalFormat("0.000000");
    	for(int i=0;i<arr.size();i++) {
    		if(arr.get(i)>0) {
    			positive += 1;
    		}
    		if(arr.get(i)<0) {
    			negative += 1;
    		}
    		if(arr.get(i)==0) {
    			none += 1;
    		}
    	}
    	System.out.println(df.format((double)positive/arr.size()));
    	System.out.println(df.format((double)negative/arr.size()));
    	System.out.println(df.format((double)none/arr.size()));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//            .map(Integer::parseInt)
//            .collect(toList());
//
//        Result.plusMinus(arr);
//
//        bufferedReader.close();
    	List<Integer> arr = new ArrayList<Integer>();
    	arr.add(-1);
    	arr.add(2);
    	arr.add(0);
    	Result.plusMinus(arr);
    }
}
