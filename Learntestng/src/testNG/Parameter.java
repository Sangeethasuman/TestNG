package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	
	@Test
	public String pass()
	{
	String name="abc";
	/*int A;
	int B;
	int c;*/
	return(name);
	}

	
	
	@Test(priority=0)
public void printname()
 
 { 
    String B;
	Parameter p=new Parameter();
	B=p.pass();
	 System.out.println("my name is:"+B);
	 
	 
	
 }

}