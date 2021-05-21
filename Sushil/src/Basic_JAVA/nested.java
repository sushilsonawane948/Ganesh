package Basic_JAVA;
public class nested
{
	int a=10;
	int b=20;
	
		public void m1()
		{
			if(a<b)
			{
				System.out.println("a is small");
			}
			else
			{
				System.out.println("b is greater");
			}
		}
			public void m2()
			{
				for(int i=0;i<=5;i++)
				{
					if(b>a)
					{
						System.out.println(i);
					}
					System.out.println(i);
				}
			}
			public void m3()
			{
				int i=5;
				while(i<=a)
				{
					System.out.println(i++);
				}
			}
			public static void main(String[] args)
			{
				nested s=new nested();
				s.m1();
				s.m2();
				s.m3();
			}
}
		