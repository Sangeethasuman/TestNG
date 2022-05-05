package testNG;

import org.testng.annotations.Test;

@Test
public class Assertion
{
	public void check()
	{
		String name="aadvik";
		if(name.equals("lot"))
		{
			System.out.println("names are not equal");
		}
		else
		{
			System.out.println("names are equal");
		}
	}

}
