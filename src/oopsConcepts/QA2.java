package oopsConcepts;

public class QA2 extends QA1
{

	final int x = 200;
	
	
	
	public void printvaluesX()
	{
		//x=250;
		
		final int x = 300;
		//x=400;
		
		System.out.println(x);  //300
		
		System.out.println(this.x);  //200
		
		System.out.println(super.x);
		
		super.sum(20, 30);
	}
	
	
	
	
	public void subs(int a, int b)
	{
		
		int c = a-b;
		System.out.println("subs between 2 numbers: " + c);
	}
	
	
	public void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("sum of 2 numbers: " + c);
	}
	
	
	public static void main(String[] args) {
		
		QA2 q2 = new QA2();
		//q2.subs(20, 30);
		
		//QA1 q1 = new QA1();
		q2.sum(20, 30);
		
		//System.out.println(q2.x);
		
		q2.printvaluesX();
	}


	
	public void qa1im() {
	System.out.println("this is method coming QA1I");
		
	}
	
}
