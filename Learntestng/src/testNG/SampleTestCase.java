package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestCase {
	
	boolean A=true;
	boolean B=false;
	
	@Test(groups={"first"})
	public void firsttestcase()
	{
		Assert.assertNotSame(A,B);
	}
	@Test(enabled=false)
	public void secondtestcase()
	{
		System.out.println("my second test case");
	}
	@Test 
	public void thirdtestcase()
	{
		System.out.println("my third test case");
		
	}
	

}
