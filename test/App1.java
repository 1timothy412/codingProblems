package test;

public class App1 {
	public static void main(String[] args) {
		Object obj = new String[] { "one","two","three" };
		for(String str:(String[]) obj) {
			str+=".";
			System.out.println(str);
		}
		System.out.println(obj);
	}

}
