import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine();
		// Receive input as a String array
		String[] inputArray = input.split("");
		// Convert the String array into a List (not unique)
		List<String> inputArrayList = Arrays.asList(inputArray);
//		// Convert the List into a hashset (unique)
		Set result = new HashSet(inputArrayList);
		if (result.size() % 2 == 0) {
			System.out.println("CHAT WITH HER!");
		} else {
			System.out.println("IGNORE HIM!");
		}
//		System.out.println(result);
//		Iterator<String> iterator = result.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		System.out.println(result.size());
//		for (Object str : result) {
//			System.out.println(str);
//		}
	}
}
