package diagonalDifference;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> arr = new ArrayList<>();
		List<Integer> arr1 = new ArrayList<Integer>();
		List<Integer> arr2 = new ArrayList<Integer>();
		List<Integer> arr3 = new ArrayList<Integer>();
		arr1.add(0);
		arr1.add(1);
		arr1.add(2);
		arr2.add(3);
		arr2.add(4);
		arr2.add(5);
		arr3.add(6);
		arr3.add(7);
		arr3.add(8);
		arr.add(arr1);
		arr.add(arr2);
		arr.add(arr3);
		System.out.println(arr);
		System.out.println(arr.get(0).get(0));
	}

}
