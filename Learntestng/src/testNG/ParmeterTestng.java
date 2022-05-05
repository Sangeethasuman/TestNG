package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParmeterTestng {

	@Test
	@Parameters({"Name","ID","dept"})
	public void passing(String rname,int rid,String rdept)
	{
		
		System.out.println(rname);
		System.out.println(rid);
		System.out.println(rdept);
	}
	
	
	
}
