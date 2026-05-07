package firstpkg;

public class Calculations
{

	//global variable
	
	int x = 100;
	
	
	
	public void sum()
	{
		x=200;
		//local variable
	
		int a = 20;
		a=70;
		int b = 30;
		
		int c = a+b;
		System.out.println("sum of a&b: " + c);
		
	}
	
	
	
	public void subs()
	{
		
		int a = 40;
		int b = 60;
		System.out.println(x);
		
		int c = a-b;
		System.out.println("substraction between a&b: " + c);
	}
	
	public static void main(String[] args) {
		
		Calculations cal = new Calculations();
		
		cal.sum();
		
		cal.subs();
		
	}
	
}
