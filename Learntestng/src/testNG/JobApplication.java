package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JobApplication {
	@Test(invocationCount=100)//runs the test case 100 times
	public void sslc()
	{ 
		int A=10;
		int B=20;
		Assert.assertEquals(A, B);
		System.out.println("sslc cleared");
	}
    @Test(dependsOnMethods="sslc",alwaysRun=false)
	public void hsc()
	{
		System.out.println("hsc cleared");
	}
    @Test(dependsOnMethods="hsc")
	public void college()
	{
		System.out.println("college cleared");
	}
    @Test(dependsOnMethods="college")
	public void job()
	{
		System.out.println("eligible to enter");
	}
}
