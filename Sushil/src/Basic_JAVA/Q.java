package Basic_JAVA;

public class Q extends Poverr {
	public void C() {
		System.out.println("Stay");
	}

	public void B() {
		System.out.println("Blessed");
	}

	public static void main(String[] args) {
		override x = new Q();
		Poverr y = new Q();
		// Q z=new Q();
		x.B();
		System.out.println(x.toString());
	}
}
