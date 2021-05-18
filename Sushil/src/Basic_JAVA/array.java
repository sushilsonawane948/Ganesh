package Basic_JAVA;
public class array{
	String Title;
	String Author;
	
	
	public static void main(String[] args){
		String[] mybooks=new String[4];
		
		
		mybooks[0] = "Wings of fire";
		mybooks[1] = "A.P.J Abdul Kalam";
		mybooks[2] = "Chava";
		mybooks[3]="Shivaji Sawant";
		

			System.out.println(mybooks[0]+" By "+mybooks[1]);
			System.out.println(mybooks[2]+" By "+mybooks[3]);
			

		}
	}