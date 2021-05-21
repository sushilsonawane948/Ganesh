package Basic_JAVA;
class demo1 extends demo {
	 int a=10;
	static int b=0;
	int c=6;
	
public void div()   {
	
	try{
		System.out.println(c/b);
		
		demo my =new demo();
        my.add();
         
	}catch (Exception e) {
		e.getMessage();
		
	}
	
}
public static void main(String[] args)   {
	 
		demo1 x=new demo1();
       try{
    	   x.div();
       }
       catch (Exception e) {
    	   System.out.println("sonawane");
       }
    	   demo d=new demo();
    	   d.mul();
    	   d.add();
	}
        
}
