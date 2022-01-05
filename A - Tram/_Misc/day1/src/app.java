class DOB {
	int day;
	String month;
	public DOB(int day, String month) {
		this.day = day;
		this.month = month;
	}
	public void printDOB() {
		System.out.println("I was born on " + this.month + ", " + this.day);
	}
}
 class app {
	public static void main(String[] args) {
		DOB newDOB = new DOB(3,"March");
		newDOB.printDOB();
	}
}