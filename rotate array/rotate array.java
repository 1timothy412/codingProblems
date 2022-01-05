import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class app {

	public static void main(String[] args) {

		class Solution {
			public int[] rotate(int[] nums, int k) {
				int[] foo = new int[nums.length];
				List bar = new ArrayList();
				for (int i = k+1; i < nums.length; i++) {
					bar.add(nums[i]);
				}
				
				bar.add(nums[k]);
				for (int i = 0; i < k; i++) {
					bar.add(nums[i]);
				}
				
				for(int i=0;i<bar.size();i++) {
					foo[i]=(int) bar.get(i);
				}
				
				
		
			System.out.println(Arrays.toString(foo));
			return nums;
			
			}
		}

//		int[] prices = {7,1,5,3,6,4};
//		int[] prices = {1,2,3,4,5};
		int[] prices = { 1, 2, 3, 4, 5, 6, 7,8,9,10 };
		Solution s = new Solution();
		s.rotate(prices, 1);

	}
}