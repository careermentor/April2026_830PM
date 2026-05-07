package firstpkg;

import secondpkg.SecondClass;

 public class FirstClass
{
	
	int a=10;
	
	float b = 10.5f; //decimal
	char c = 'X';
	boolean d = true;
	
	public String e = "Java";
	
	 public void values()  //method
	{
		 a=20;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
	
	public static void main(String[] args) //main method is the entry point to run any java program
	{
		FirstClass fc = new FirstClass();  //create object of the class (fc)
		//fc - will be used to call any class member
		
		//FirstClass.
		
		fc.values();
		
		System.out.println(fc.a);
		
		System.out.println(fc.e);
		
		//SecondClass sc = new SecondClass();
		//sc.main(args);

	}
	

}
