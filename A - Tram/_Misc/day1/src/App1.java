import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int maxLevel = scan.nextInt();
		int xTotalLevel = scan.nextInt();
		int counter = 0;

		Set x = new HashSet();
		
		int[] foo = new int[xTotalLevel];


		for (int a = 0; a < xTotalLevel; a++) {
			x.add(scan.nextInt());

		}
		
		int yTotalLevel = scan.nextInt();
		int[] bar = new int[yTotalLevel];
		
		for (int b = 0; b < yTotalLevel; b++) {
			x.add(scan.nextInt());

		}
		
		
		int i = 0;

		int[] total = new int[x.size()];
		for (Object item : x) {
			total[i] = (int) item;
			i++;
		}
		
		for(int loop1=0;loop1<total.length;loop1++) {
			for(int loop2=1;loop2<=maxLevel;loop2++) {
				if(total[loop1]==loop2) {
					counter++;
				}
			}
		}
		if(counter==maxLevel) {System.out.println("I become the guy.");
			
		}else {
			System.out.println("Oh, my keyboard!");
		}
		
//		System.out.println(Arrays.toString(total));
//		System.out.println(counter);

	}

}
