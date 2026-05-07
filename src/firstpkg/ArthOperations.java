package firstpkg;

public class ArthOperations 
{
	
	
	//constructor
	/*
	public ArthOperations()
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println("using constructor doing sum: " + c);
		
	}
	*/
	//global variable
	int a;
	
	public int sum() // method without parameter/argument
	{
		//local variable
		int a = 20;
		int b = 30;
		int c = a+b;
		
		float d = 20.5f;
		
		String e = "Java";
		
		return c;
	}
	
	
	//constructor with argments/parameters
	
	public ArthOperations(int a, int b)
	{
		int c  =a+b;
		System.out.println("addition of 2 numbers using constructor : " + c);
		
	}
	
	public int addition(int a, int b) // method with parameters/arguments (a and b are local variables)
	{
		int c  =a+b;
		System.out.println("addition of 2 numbers: " + c);
		return c;
	}
	
	//20+30+40
	
	public static void main(String[] args) 
	{
		ArthOperations ao1 = new ArthOperations(10, 20);
	
		ArthOperations ao2 = new ArthOperations(25, 35);  //constructor going to be called automatically when you create object of the class
		
		int x = ao2.sum();
		System.out.println(x);
		
		
		int y = ao1.addition(20, 30);
		ao2.addition(y, 40);
		
	}
	
}
