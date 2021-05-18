package Basic_JAVA;
 public class test extends demo
{    int x=5;
     int y=8;
	 static public void mul()
	{
		 int a=5;
		int b=8;
		System.out.println(a*b);
	}
	public static  void add(int c,int d)
	{
		System.out.println(c-d);
	}
	public static void main(String args[])
	{
    	demo z=new test();
     	mul();
		add(13,5);
       System.out.println(demo.c);
      div();
	}
}