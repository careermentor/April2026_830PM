package oopsConcepts;

public class CallDemoInterface implements DemoInterface
{

	int x = 100;
	
	public void meth3()
	{
		x=200;
		System.out.println("this is Method3 from Interface");
		
	}


	public void meth4()
	{
		System.out.println("this is Method4 from Interface");
		
	}

	//main method
	public static void main(String[] args)
	{
	
		CallDemoInterface di = new CallDemoInterface();
		di.meth3();
		di.meth4();
		
		System.out.println(di.a);
		
	}
}
