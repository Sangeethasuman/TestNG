package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Employee {

	
	@Test
	
	public void details()
	{
		int empid=504;
		String empname="jhanvi";
		String dept="it";
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(dept);
		Assert.assertEquals(empname,dept);
		
		
	}
	
	                                   
	@Test(priority=1,dependsOnMethods="details",alwaysRun=true)
	
	public void bank()
	{
		int accountno=6425436;
		String bankname="SBI";
		System.out.println(accountno);
		System.out.println(bankname);
		
	}
	
	@Test(priority=2,invocationCount=1)
	public void salary()
	{
		long amt=10000000;
		System.out.println(amt);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
