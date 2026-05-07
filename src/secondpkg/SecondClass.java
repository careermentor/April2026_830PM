package secondpkg;

import firstpkg.FirstClass;

public class SecondClass 
{

	public static void main(String[] args) 
	{
		
		int a = 20;
		float b = 20.5f;
		char c = 'Y';
		boolean d = false;
		String f = "Selenium";
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(f);
		
		
		FirstClass abc = new FirstClass();
		abc.values();
		System.out.println(abc.e);
	}

}
