package oopsConcepts;

public class QA3 extends QA1
{

	public void mul(int a, int b)
	{
		int c = a*b;
		System.out.println("mul between 2 numbers: " + c);
	}
	
	public static void main(String[] args) {
		
		QA3 q3 = new QA3();
		
		q3.mul(20, 30);
		
		//q3.subs(20, 30);
		
		//QA1 q1 = new QA1();
		q3.sum(20, 30);
		
		System.out.println(q3.x);
	}
	
}
