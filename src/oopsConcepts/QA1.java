package oopsConcepts;

import firstpkg.DemoStatic;

public class QA1 
{
	int x = 500;
	
	public QA1()
	{
		System.out.println("this is QA1 constructor");
	}

	public void sum()
	{
		int a=20;
		int b=30;
		int c = a+b;
		System.out.println("sum of 2 numbers: " + c);
	}
	
	public void sum(int a, int b)
	{
		int c = a+b;
		System.out.println("sum of 2 numbers: " + c);
	}
	
	public void sum(int a, float b)
	{
		float c = a+b;
		System.out.println("sum of 2 numbers: " + c);
	}
	
	public void sum(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println("sum of 3 numbers: " + d);
	}
	
	public static void main(String[] args) 
	{
		QA1 q1 = new QA1();
		q1.sum(20, 30);
		q1.sum(20, 30.5f);
		q1.sum(20, 30, 40);
		q1.main(5);
		
		
		DemoStatic.printdata();
		
	}
	
	public static void main(int a) 
	{
		int b = a*a;
		System.out.println("sq of b: " + b);
	}
	
}
