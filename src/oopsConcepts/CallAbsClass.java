package oopsConcepts;

public class CallAbsClass extends DemoAbsClass
{

	int a = 30;
	
	
	public void abstractDemo() 
	{
		a=40;
		System.out.println("this method where credential is availbale");
		
	}
	
public static void main(String[] args) 
{
	
	CallAbsClass cab = new CallAbsClass();
	cab.concrete_method();
	cab.abstractDemo();
	
}

}
