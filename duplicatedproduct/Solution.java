package duplicatedproduct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Foo {
	static int numDuplicates(List<String> name, List<Integer> price, List<Integer> weight) {
		int count = 0;
//		for(int i=0;i<price.size();i++) {
//			for(int j = i+1;j<price.size();j++) {
//				if(name.get(i).equalsIgnoreCase(name.get(j))){
//					if(price.get(i)==price.get(j)) {
//						if(weight.get(i)==weight.get(j)) {
//							count++;							
//							name.remove(j);
//							price.remove(j);
//							weight.remove(j);
//							j--;
//							
//						}
//					}
//				}
//			}
//			
//		}

		Set<List<String>> unique = new HashSet<List<String>>();	
		for(int i = 0;i<price.size();i++) {
			unique.add(Arrays.asList(name.get(i),String.valueOf(price.get(i)),String.valueOf(weight.get(i))));
		}
		System.out.println(unique);
		count = price.size() - unique.size();
		return count;
	}
}

public class Solution {
	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		List<Integer> price = new ArrayList<Integer>();
		List<Integer> weight = new ArrayList<Integer>();
		name.add("ball");
		name.add("box");
		name.add("ball");
		name.add("ball");
		name.add("box");
		price.add(2);
		price.add(2);
		price.add(2);
		price.add(2);
		price.add(2);
		weight.add(1);
		weight.add(2);
		weight.add(1);
		weight.add(1);
		weight.add(3);
		System.out.println(Foo.numDuplicates(name, price, weight));
	}
}
