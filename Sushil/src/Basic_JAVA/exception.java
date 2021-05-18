package Basic_JAVA;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class exception {

	public void m1() throws FileNotFoundException {
		FileInputStream f = new FileInputStream("");
	}

	public static void main(String args[]) {

		X z = new X();
		try {
			z.m1();
		} catch (FileNotFoundException e) {

			System.out.println(e);
		}

	}
}