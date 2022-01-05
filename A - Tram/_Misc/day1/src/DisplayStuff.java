class Stuff{
	int a, b;
	float c;
	String s;
	public Stuff(int a, int b, float d, String s ) {
		this.a = a;
		this.b = b;
		this.c = d;
		this.s = s;
		
	}
	public void display(){
		System.out.println("Your integers are: "+ this.a +" and "+this.b);
		System.out.println("Your float is: "+ this.c);
		System.out.println("Your string is: "+this.s);
	}
}

public class DisplayStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stuff foo = new Stuff(10,20,12.5f,"Java Programming");
		foo.display();
		

	}

}
