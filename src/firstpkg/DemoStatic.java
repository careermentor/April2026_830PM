package firstpkg;

public class DemoStatic
{

	static int x = 20;
	
	public static void printdata()
	{
		System.out.println("this is static method");
		System.out.println(x);
	}
	
	public void meth2()
	{
		System.out.println("this is non-static method");
	}
	
	public static void main(String[] args) 
	{
	
		printdata();
		
		
		DemoStatic ds = new DemoStatic();
		ds.meth2();
		
	}
	
}
