package oopsConcepts;

public abstract class DemoAbsClass
{

	int b = 200;
	
	public void concrete_method()
	{
		b = 30;
		System.out.println("this is concrete method");
	}
	
	//not concrete method
	
	public abstract void abstractDemo();

	
	public static void main(String[] args) {
	
	//	DemoAbsClass ac = new DemoAbsClass();
		//ac.concrete_method();
		
	}
	
	
}
