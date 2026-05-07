package oopsConcepts;

public class QA4 extends QA2 implements QA3I
{

	public void div(int a, int b)
	{
		int c = a/b;
		System.out.println("div between 2 numbers: " + c);
	}
	
	public static void main(String[] args) {
		
		QA4 q4 = new QA4();
		
		q4.div(40, 20);
		
		//q4.mul(20, 30);
		
		q4.subs(20, 30);
		
		//QA1 q1 = new QA1();
		q4.sum(20, 30);
		
	//	System.out.println(q4.x);
		
		
DemoEncapsulation de = new DemoEncapsulation();
		
		System.out.println(de.getAge());
		
		System.out.println(de.getName());
	}


	public void printtext() {
		
		System.out.println("this method is from QA3I");
		
	}
	
}
