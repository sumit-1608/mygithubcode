package data;

public class LamdaDemo {

	public static void main(String args[])
	{
		// Anonymous inner cls which has no name
		Testable t1=new Testable()
		{
			@Override
			public void test()
			{
				System.out.println("i m test of testable");
			}
		};
				
		t1.test();
				// lambda expression
				Testable t2=()-> System.out.println("i m test of testable using lambda fun");
				t2.test();
				
				// if functional interface has parameters
				TestableDemo t3=(int a,int b)->
				{
					int c=a+b;
					System.out.println(c);
					return c;
					
				};
				
				t3.test1(20, 30);
	}
}
