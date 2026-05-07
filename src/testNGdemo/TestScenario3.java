package testNGdemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScenario3 
{

	@Test(groups="Regression")
	public void first_testcase()
	{
		//step1
		System.out.println("first_testcase");
		
		//Assert.assertEquals(true, false);  //hard assertion
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(false, true);
		
		
		System.out.println("step1 got pass");
		
		sa.assertAll();
	}
	
	
	@Test(groups={"Regression","Smoke"})
	public void second_testcase()
	{
		System.out.println("second_testcase");
	}
	
	@Test
	public void third_testcase()
	{
		System.out.println("third_testcase");
	}
	
	@Test
	public void forth_testcase()
	{
		System.out.println("forth_testcase");
	}
	
	@Test(groups="Smoke")
	public void fifth_testcase()
	{
		System.out.println("fifth_testcase");
	}
	
	@Test(groups="Sanity")
	public void sixth_testcase()
	{
		System.out.println("sixth_testcase");
	}
	
	
	
}
